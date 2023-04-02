package com.automationcode_12thMarch_2023;

import static org.testng.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.*;

public class SeleniumCode {
	public WebDriver driver;
	public ChromeOptions options;

	@BeforeMethod
	public void setUp() {
		options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		options.addArguments("--start-maximized");
		options.addArguments("--incognito");
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get("http://tutorialsninja.com/demo");
	}

	@Test(priority = 1) // enabled = false (will disable), alwaysRun = true(highest power annotation)
	public void loginWithValidCredentials() {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	}

	@Test(priority = 2, dependsOnMethods = "loginWithValidCredentials")
	public void loginWithInvalidCredentials() {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail12323.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123213123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		Assert.fail("I am failing test case 2");
	}

	@Test(priority = 3, dependsOnMethods = { "loginWithValidCredentials",
			"loginWithInvalidCredentials" }, alwaysRun = true)
	public void loginWithoutAnyCredentials() {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
