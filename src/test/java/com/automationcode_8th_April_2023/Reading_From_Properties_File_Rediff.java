package com.automationcode_8th_April_2023;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Reading_From_Properties_File_Rediff {

	public WebDriver driver;

	@Test
	public void rediffLogin() throws IOException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream(System.getProperty("user.dir")
				+ "\\src\\test\\java\\com\\automationcode_8th_April_2023\\rediffmail.properties");
		prop.load(ip);
		driver.get(prop.getProperty("url"));
		driver.findElement(By.id("login1")).sendKeys(prop.getProperty("validUsername"));
		driver.findElement(By.id("password")).sendKeys(prop.getProperty("validPassword"));
		driver.findElement(By.className("signinbtn")).click();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
