package com.automationcode_12thMarch_2023;

import org.testng.Assert;
import org.testng.annotations.*; // star takes care of importing annotations

public class TestNG_Annotations {
	
	// @AnnotationName
	// below the annotation you have to create a method
	
	@BeforeSuite
	public void beforeSuitAnnotation() {
	System.out.println("This is Before Suite");
	}
	
	@BeforeTest
	public void beforeTestAnnotation() {
	System.out.println("This is Before Test");
	}
	
	@BeforeClass
	public void beforeClassAnnotation() {
	System.out.println("This is Before Class");
	}
	
	@BeforeMethod
	public void beforeMethodAnnotation() {
	System.out.println("This is Before Method");
	}
	
	@Test
	public void testCase1Annotation() {
	System.out.println("This is TestCase1");
	}
	
	@Test
	public void testCase2Annotation() {
	System.out.println("This is TestCase2");
	}
	
	@Test
	public void testCase3Annotation() {
	System.out.println("This is TestCase3");
	Assert.fail("Deliberately failing");
	}
	
	@AfterMethod
	public void afterMethodAnnotation() {
	System.out.println("This is After Method");
	}
	
	@AfterClass
	public void afterClassAnnotation() {
	System.out.println("This is After Class");
	}
	
	@AfterTest
	public void afterTestAnnotation() {
	System.out.println("This is After Test");
	}
	
	@AfterSuite
	public void afterSuiteAnnotation() {
	System.out.println("This is After Suite");
	}
	
	

}
