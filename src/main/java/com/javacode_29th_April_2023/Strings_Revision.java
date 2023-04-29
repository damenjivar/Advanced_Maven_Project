package com.javacode_29th_April_2023;

public class Strings_Revision {

	// String is a class
	// String objects can be directly created
	// String Constant(Literal) Pool
	// string StringBuffer, StringBuilder
	// immutability concept of StringObjects
	// final concept of String classes
	// difference between == operator and .equals() method
	// why saving passwords is better in Char array rather than Strings
	// String Operations

	// in interview Strings are very important
	// in interview learn strings and arrays in depth

	// interview questions
	// how to reverse a string
	// maximum occurring character in a String

	// heap memory - String Constant Pool or String Literal Pool (SCP/SLP)
	// stack memory
	// PC register
	// method area
	// native method area

	public static void main(String[] args) {

		// by default String Class is final in nature

		// String Objects

		String S0 = new String(); // 1 object will be created in the heap memory

		String S = new String("Selenium"); // 2 objects will be created, 1 in HP and 1 in SCP

		String S1 = "Java"; // 1 object will be created and it will be stored in SLP

		String S2 = "Java"; // 0 objects will be created

	}
}
