package com.automationcode_2nd_April_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Rediff_DataDriven {

	public WebDriver driver;

	@Test(dataProvider = "getData")
	public void loginRediffTest(String username, String password) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@name='proceed']")).click();
	}

	@DataProvider

	public Object[][] getData() {

		Object[][] data = { { "seleniumpanda@rediffmail.com", "Selenium@123" },
				{ "seleniumpanda1@rediffmail.com", "Selenium@123" },
				{ "seleniumpanda2@rediffmail.com", "Selenium@123" },
				{ "seleniumpanda845@rediffmail.com", "Selenium@123" } };

		return data;
	}

}
