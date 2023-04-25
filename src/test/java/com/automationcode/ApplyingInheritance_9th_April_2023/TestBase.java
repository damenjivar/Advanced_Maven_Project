package com.automationcode.ApplyingInheritance_9th_April_2023;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// this one will act as the parent class for all the other test cases

public class TestBase {

	public static WebDriver driver;

	public static void openBrowserAndApplication() {
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(100));
		driver.get("http://tutorialsninja.com/demo");
	}
}
