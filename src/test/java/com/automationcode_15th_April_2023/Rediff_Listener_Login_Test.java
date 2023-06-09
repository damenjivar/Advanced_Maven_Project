package com.automationcode_15th_April_2023;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(MyListener.class)

public class Rediff_Listener_Login_Test {

	public WebDriver driver;

	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
	}

	@Test(priority = 1)
	public void clickOnSigninLink() {
		driver.findElement(By.className("signin")).click();
	}

	@Test(priority = 2)
	public void enterCredentials() {
		driver.findElement(By.className("signin")).click();
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Selenium@123");
	}

	@Test(priority = 3)
	public void clickOnSigninButton() {
		driver.findElement(By.className("signin")).click();
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Selenium@123");
		driver.findElement(By.className("signinbtn")).click();
	}

	@Test(priority = 4)
	public void clickOnLogoutLink() {
		driver.findElement(By.className("signin")).click();
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Selenium@123");
		driver.findElement(By.className("signinbtn")).click();
		driver.findElement(By.className("rd_logout")).click();
	}

	@Test(priority = 5)
	public void clickOnRediffHomeLink() {
		driver.findElement(By.className("signin")).click();
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Selenium@123");
		driver.findElement(By.className("signinbtn")).click();
		driver.findElement(By.className("rd_logout")).click();
		WebElement rediffHomeLink = driver.findElement(By.xpath("//b[contains(text(), 'Rediff Home')]"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(rediffHomeLink));
		rediffHomeLink.click();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
