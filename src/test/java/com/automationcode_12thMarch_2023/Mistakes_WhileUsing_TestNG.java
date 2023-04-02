package com.automationcode_12thMarch_2023;

import org.testng.annotations.Test;

public class Mistakes_WhileUsing_TestNG {

	public static void main(String [] args) {
		System.out.println("this is the main method");
	}
	
	@Test
	public void testcase1() {
		System.out.println("this too is an exec. eng.");
	}

// if using main method, don't use Test NG
// if using Test NG, don't use main method
// make sure pom.xml file has 7.7.1 on dependency version line 56
// always code in src/test/java not src/main
// @Test is required for test to execute 
// don't import using JUnit, use TestNG
}