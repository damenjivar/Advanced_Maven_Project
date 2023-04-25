package com.automationcode_2nd_April_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

// Annotation is known as @DataProvider

// 1. Returns a 2-D Object array
// 2. Pass all the elements of that 2-D Array [initialization process of Array]
// 3. You have to create the @Test case and pass dataProvider
// 4. You have to pass the arguments in the Method under @Test == columns of the 2-D Array

public class DataDriven {

	public WebDriver driver;

	@Test(dataProvider = "getData")
	public void loginNinjaTest(String username, String password) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();  
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys(username);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();

	}

	@DataProvider

	public Object[][] getData() {

		Object[][] data = { { "seleniumpanda@gmail.com", "Selenium@123" },
							{ "seleniumpanda1@gmail.com", "Selenium@123" }, 
							{ "seleniumpanda2@gmail.com", "Selenium@123" },
							{ "seleniumpanda845@gmail.com", "Selenium@123" } };

		return data;
	}
}
