package com.automationcode_5thMar_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Rediff_Login {
	

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.NONE);
		options.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://Rediff.com");
		driver.findElement(By.className("signin")).click();
		driver.findElement(By.id("Login1")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.signbtn")).click();
		driver.findElement(By.cssSelector("a.rd_logout")).click();

	}

}
