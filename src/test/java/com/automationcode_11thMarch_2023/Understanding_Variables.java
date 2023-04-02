package com.automationcode_11thMarch_2023;

public class Understanding_Variables {

	// instance variables
	static String name = "John"; // static variable
	int age = 10;
	double height = 4.1;

	public static void main(String[] args) {
		// There are 3 types of variables
		// 1. instance variable - this is declared at a class level. this one is not
		// static.
		// 2. static variable - this is also declared at a class level but it is static.
		// 3. local variable - this is declared at a method level. it is neither static
		// nor non-static.

		int i = 10; // i is a variable. it is an int variable.

	}

	// local variables

	public static void sample() {
		int i = 10;
		String S1 = "Hello";
	}

	public void test() {
		int j = 20;
		String S2 = "World";
	}

}