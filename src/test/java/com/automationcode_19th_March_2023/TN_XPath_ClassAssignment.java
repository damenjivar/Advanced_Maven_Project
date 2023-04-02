package com.automationcode_19th_March_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TN_XPath_ClassAssignment {

	public static WebDriver driver;
	public static ChromeOptions options;

	@BeforeMethod
	public void setup() {
		options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		options.addArguments("--start-maximized");
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get("http://tutorialsninja.com/demo");
	}

	@Test(priority = 1)
	public void registerAccount() {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.xpath("//input[@id = 'input-firstname']")).sendKeys("Dennis");
		driver.findElement(By.xpath("//input[@id = 'input-lastname']")).sendKeys("Menjivar");
		driver.findElement(By.xpath("//input[@id = 'input-email']")).sendKeys("dennismenjivar@yahoo.com");
		driver.findElement(By.xpath("//input[@id = 'input-telephone']")).sendKeys("703-991-3545");
		driver.findElement(By.xpath("//input[@id = 'input-password']")).sendKeys("password");
		driver.findElement(By.xpath("//input[@id = 'input-confirm']")).sendKeys("password");
		driver.findElement(By.xpath("//input[@name = 'agree']")).click();
		driver.findElement(By.xpath("//input[@class = 'btn btn-primary']")).click();
	}

	@Test(priority = 2)
	public void loginUsingRegisteredDetails() {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.xpath("//input[@id = 'input-email']")).sendKeys("dennismenjivar@yahoo.com");
		driver.findElement(By.xpath("//input[@id = 'input-password']")).sendKeys("password");
		driver.findElement(By.xpath("//input[@class = 'btn btn-primary']")).click();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
