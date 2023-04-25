package com.automationcode_1st_April_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Actions_Mouse_RightClick_LeftClick {

	public WebDriver driver;

	@Test
	public void mouseActionsTest() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		// driver.get("https://jqueryui.com/draggable");
		driver.get("https://browserstack.com");
		Actions action = new Actions(driver);

		WebElement getADemoButton = driver
				.findElement(By.xpath("//button[@class='btn btn-secondary btn-lg col-md-3']"));
		action.moveToElement(getADemoButton).perform();

		WebElement getStartedFreeButton1 = driver.findElement(By.id("signupModalButton"));
		action.moveToElement(getStartedFreeButton1).contextClick().perform();

		WebElement getStartedFreeButton = driver.findElement(By.id("signupModalButton"));
		action.moveToElement(getStartedFreeButton).click().perform();

	}

}
