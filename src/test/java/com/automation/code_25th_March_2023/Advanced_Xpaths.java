package com.automation.code_25th_March_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Advanced_Xpaths {

	public WebDriver driver;
	public ChromeOptions options;

	@BeforeMethod
	public void openBrowser() {
		options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		options.addArguments("--start-maximized");
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get("http://tutorialsninja.com/demo/");
	}

	@Test
	public void clickOnMyAccountLink() {
		driver.findElement(By.xpath("//div[@id = 'top-links']/descendant::span[contains(text(),'My Account')]"))
				.click();
	}

	@Test
	public void clickOnLoginLink() {
		driver.findElement(By.xpath("//div[@id = 'top-links']/descendant::span[contains(text(), 'My Account')]"))
				.click();
		driver.findElement(By.xpath("//a[text() = 'Login']")).click();
		driver.findElement(By.xpath("//div[@class = 'form-group']/input[@id = 'input-email']"))
				.sendKeys("dennismenjivar@yahoo.com");
		driver.findElement(By.xpath("//div[@class = 'form-group']/input[@id = 'input-password']"))
				.sendKeys("Baseball#26");
		driver.findElement(By.xpath("//aside[@id = 'column-right']/preceding::input[@class = 'btn btn-primary']"))
				.click();
		driver.findElement(By.xpath("//aside[@id = 'column-right']/descendant::a[text() = 'Logout']")).click();
		driver.findElement(By.xpath("//div[@id = 'content']/descendant::a[text() = 'Continue']")).click();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
