package com.automationcode_2nd_April_2023;

import org.testng.annotations.DataProvider;

public class Separate_Data_Providers {

	@DataProvider(name = "dataForNinja")

	public static Object[][] getNinjaData() {

		Object[][] data = { { "seleniumpanda@rediffmail.com", "Selenium@123" },
				{ "seleniumpanda1@rediffmail.com", "Selenium@123" },
				{ "seleniumpanda2@rediffmail.com", "Selenium@123" },
				{ "seleniumpanda845@rediffmail.com", "Selenium@123" } };

		return data;
	}

	@DataProvider(name = "dataForRediff")

	public static Object[][] getRediffData() {

		Object[][] data = { { "seleniumpanda@rediffmail.com", "Selenium@123" },
				{ "seleniumpanda1@rediffmail.com", "Selenium@123" },
				{ "seleniumpanda2@rediffmail.com", "Selenium@123" },
				{ "seleniumpanda845@rediffmail.com", "Selenium@123" } };

		return data;
	}
}
