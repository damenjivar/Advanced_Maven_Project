package com.automation.code_25th_March_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CssSelector_TN {

	public WebDriver driver;
	public ChromeOptions options;

	@BeforeMethod
	public void openBrowser() {
		options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		options.addArguments("--start-maximized");
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get("http://tutorialsninja.com/demo");
	}

	@Test
	public void clickOnMyAccountLink() {
		driver.findElement(By.cssSelector("i.fa.fa-user + span")).click();
	}

	@Test
	public void clickOnLoginLink() {
		driver.findElement(By.cssSelector("i.fa.fa-user + span")).click();
		driver.findElement(By.cssSelector("ul.dropdown-menu.dropdown-menu-right > li + li  > a")).click();
		driver.findElement(By.cssSelector("div.form-group > input#input-email")).sendKeys("dennismenjivar@yahoo.com");
		driver.findElement(By.cssSelector(
				"div.col-sm-6 + div > div.well > form > div.form-group + div.form-group > input#input-password"))
				.sendKeys("Baseball#26");
		driver.findElement(By.cssSelector("div.form-group + div.form-group > input#input-password")).click();

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
