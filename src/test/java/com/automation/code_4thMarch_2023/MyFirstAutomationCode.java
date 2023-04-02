package com.automation.code_4thMarch_2023;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirstAutomationCode {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		driver.quit();
		
		WebDriver driver1 = new FirefoxDriver();
		driver1.manage().window().maximize();
		driver1.get("https://firefox.com");
		driver1.quit();
		
		WebDriver driver2 = new EdgeDriver();
		driver2.manage().window().maximize();
		driver2.get("http://tutorialsninja.com/demo");
		driver2.quit();

	}

}
