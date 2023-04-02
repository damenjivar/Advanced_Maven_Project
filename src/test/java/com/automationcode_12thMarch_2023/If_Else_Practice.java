package com.automationcode_12thMarch_2023;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class If_Else_Practice {
	
	public static String browserName = "chrome";
	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		if(browserName.equals("chrome")) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://tutorialsninja.com/demo");
			driver.quit();
		}else if(browserName.equals("edge")) {
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.get("https://amazon.com");
			driver.quit();
		}else if(browserName.equals("firefox")) {
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://rediff.com");
			driver.quit();
		}else {
			System.out.println("nothing opened");
		}
	}
}