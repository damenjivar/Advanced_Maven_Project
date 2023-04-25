package com.automationcode_8th_April_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class RediffCreateAccountTest {
	public WebDriver driver;
	public SoftAssert softassert = new SoftAssert();
	public Select select;

	@Test
	public void rediffCreateAccount() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.xpath("//input[starts-with(@name, 'name')]")).sendKeys("Dennis Menjivar");
		driver.findElement(By.xpath("//input[starts-with(@name, 'login')]")).sendKeys("dennismenjivar");
		driver.findElement(By.xpath("//input[@class='btn_checkavail']")).click();
		String actualAvailabilityMessage = driver.findElement(By.id("check_availability")).getText();
		String expectedAvailabilityMessage = "Yippie! The ID you've chosen is available.";
		softassert.assertTrue(actualAvailabilityMessage.contains(expectedAvailabilityMessage));
		driver.findElement(By.xpath("//input[@id='newpasswd']")).sendKeys("Baseball#28");
		driver.findElement(By.xpath("//input[@id='newpasswd1']")).sendKeys("Baseball#28");
		driver.findElement(By.xpath("//input[starts-with(@name, 'altemail']")).sendKeys("dennismenjivar@yahoo.com");
		driver.findElement(By.xpath("//input[@id='mobno']")).sendKeys("7039913545");

		select = new Select(driver.findElement(By.xpath("//select[starts-with(@name, 'DOB_Day")));
		select.selectByVisibleText("02");

		select = new Select(driver.findElement(By.xpath("//select[starts-with(@name, 'DOB_Month")));
		select.selectByVisibleText("DEC");

		select = new Select(driver.findElement(By.xpath("//select[starts-with(@name, 'DOB_Year")));
		select.selectByVisibleText("1995");

		driver.findElement(By.xpath("//input[starts-with(@name, 'gender')][@value='m']")).click();

		select = new Select(driver.findElement(By.id("country")));
		select.selectByVisibleText("United States");

		driver.findElement(By.className("captcha")).sendKeys("ABCD");
		driver.findElement(By.id("Register")).click();

		String actualUnregisteredWarningMessage = driver.findElement(By.className("errbody")).getText();
		String expectedUnregisteredWarningMessage = "Sorry! We will not be able to register you right now.";
		softassert.assertTrue(actualUnregisteredWarningMessage.contains(expectedUnregisteredWarningMessage));

		softassert.assertAll();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
