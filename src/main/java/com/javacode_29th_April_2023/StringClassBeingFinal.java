package com.javacode_29th_April_2023;

public class StringClassBeingFinal {

	// final concept of String is related to the Class String

	// final is a keyword in java which is used with classes, methods and variables
	// anything which is termed final cannot be changed

	// String class is final because String class has features which is not
	// available to other java classes. this prevents sub-classes to try
	// implementing changes to the string class.

	// hence anything within the string class cannot be modified

	// immutability concept is different from final concept
	// string immutability is related to string objects
	// string final concept is related to string classes

	public static void main(String[] args) {

		int i = 10; // 10
		i = i + 2; // 12

		System.out.println(i); // i became 12

		final int j = 5;
		// j = 3; this is not allowed as j is a final variable

	}

}
