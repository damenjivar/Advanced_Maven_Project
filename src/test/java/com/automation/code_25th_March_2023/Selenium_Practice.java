package com.automation.code_25th_March_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Selenium_Practice {

	public WebDriver driver;
	public Select select;

	@BeforeMethod
	public void openUrl() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2019/01/dropdown-demo-for-selenium.html");
	}

	@Test
	public void dropDownTest() {
		select = new Select(driver.findElement(By.id("tools")));
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
