package com.automationcode_9th_April_2023;

import org.testng.annotations.DataProvider;

public class DataProvider_TN {

	@DataProvider(name = "TN", parallel = true)
	public Object[][] getData() {
		Object[][] data = { { "seleniumpanda@gmail.com", "Selenium@123" } };
		return data;
	}
}
