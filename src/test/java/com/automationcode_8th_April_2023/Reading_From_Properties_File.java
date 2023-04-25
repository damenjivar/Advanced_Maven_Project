package com.automationcode_8th_April_2023;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Reading_From_Properties_File {

	public WebDriver driver;

	@Test
	public void tutorialsNinjaLogin() throws IOException {
		// 1. create the Object of properties class
		// 2. create the Object of FileInputStream class

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("The common path which can be universal is : " + System.getProperty("user.dir"));
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream(System.getProperty("user.dir")
				+ "\\src\\test\\java\\com\\automationcode_8th_April_2023\\tutorialsninja.properties");
		prop.load(ip);
		driver.get(prop.getProperty("url"));
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys(prop.getProperty("validUsername"));
		driver.findElement(By.id("input-password")).sendKeys(prop.getProperty("validPassword"));
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
