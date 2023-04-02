package com.automationcode_19th_March_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Facebook_Using_XPath {

	public WebDriver driver;
	public ChromeOptions options;

	@BeforeMethod
	public void openBrowser() {
		options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		options.addArguments("--start-maximized");
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com/");
	}

	@Test(priority = 1)
	public void clickOnCreateNewAccount() {
		driver.findElement(By.xpath("//a[contains(text(), 'Create new account')]")).click();
	}

	@Test(priority = 2, dependsOnMethods = "clickOnCreateNewAccount")
	public void createNewAccountDetailsPage() {
		driver.findElement(By.xpath("//a[contains(text(), 'Create new account')]")).click();
		driver.findElement(By.xpath("//input[@name = 'firstname']")).sendKeys("Dennis");
		driver.findElement(By.xpath("//input[@name = 'lastname']")).sendKeys("Menjivar");
		driver.findElement(By.xpath("//input[@name = 'reg_email__']")).sendKeys("dennismenjivar@yahoo.com");
		driver.findElement(By.xpath("//input[@name = 'reg_email_confirmation__')]")).sendKeys("dennismenjivar@yahoo.com");
		driver.findElement(By.xpath("//input[@name = 'reg_passwd__']")).sendKeys("password@123");
	}

	@AfterMethod
	public void tearDown() {
		// driver.quit();
		//test is failing
	}

}
