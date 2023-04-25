package com.automationcode_15th_April_2023;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Applying_Interface_Logic {

	@Test
	public void test() {
		WebDriver driver = new ChromeDriver();

		// WebDriver is an interface
		// ChromeDriver is an implementing class

		// WebDriver has a lot of abstract methods
		// an interface can refer to the object of a class
		
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo");
		
		// .get or anything is an unimplemented method or abstract method
		
	}
}
