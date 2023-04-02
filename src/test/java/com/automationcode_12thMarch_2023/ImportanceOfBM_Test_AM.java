package com.automationcode_12thMarch_2023;

import org.testng.annotations.*;

public class ImportanceOfBM_Test_AM {

	// tri-combo - BM>Test1>AM BM>Test2>AM

	@BeforeMethod
	public void beforeMethodAnnotation() {
		System.out.println("This is beforeMethod");
	}

	@Test
	public void testCase1() {
		System.out.println("This is testCase1");
	}

	@Test
	public void testCase2() {
		System.out.println("This is testCase2");
	}

	@Test
	public void testCase3() {
		System.out.println("This is testCase3");
	}

	@AfterMethod
	public void afterMethodAnnotation() {
		System.out.println("This is afterMethod");
	}

}
