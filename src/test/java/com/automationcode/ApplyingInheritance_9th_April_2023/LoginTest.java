package com.automationcode.ApplyingInheritance_9th_April_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginTest extends TestBase {

	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		TestBase.openBrowserAndApplication();
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
	}

	@Test(priority = 1)
	public void verifyingLoginWithValidCredentials() {
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		SoftAssert softassert = new SoftAssert();
		softassert.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed());
		softassert.assertAll();
	}

	@Test(priority = 2)
	public void verifyingLoginWithInvalidCredentials() {
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda1234@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@1231234");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		SoftAssert softassert = new SoftAssert();
		String actualWarningMessage = driver.findElement(By.xpath("//div[contains(@class, 'alert-dismissible')]"))
				.getText();
		String expectedWarningMessage = "Warning: No match for E-Mail Address and/or Password.";
		softassert.assertTrue(actualWarningMessage.contains(expectedWarningMessage));
		softassert.assertAll();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();

	}
}
