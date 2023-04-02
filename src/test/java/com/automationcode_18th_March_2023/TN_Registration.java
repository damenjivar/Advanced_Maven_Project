package com.automationcode_18th_March_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TN_Registration {

	public WebDriver driver;
	public ChromeOptions options;

	@BeforeMethod
	public void openBrowser() {
		options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		options.addArguments("--start maximized");
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get("http://tutorialsninja.com/demo");
	}

	@Test
	public void registerAccount() {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("input-firstname")).sendKeys("Dennis");
		driver.findElement(By.id("input-lastname")).sendKeys("Menjivar");
		driver.findElement(By.id("input-email")).sendKeys("dennismenjivar@yahoo.com");
		driver.findElement(By.id("input-telephone")).sendKeys("7039913545");
		driver.findElement(By.id("input-password")).sendKeys("password");
		driver.findElement(By.id("input-confirm")).sendKeys("password");
		driver.findElement(By.name("agree")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
