package com.javacode_29th_April_2023;

public class WhyStringsAreImmutable {

	// immutability concept is used for String Objects
	// string objects are immutable
	// once Strings objects are created, its data or state cannot be changed

	// So basically what happens is - if we try to change the state of a string
	// object, instead of changing it, it will create another object.

	public static void main(String[] args) {

		String S = new String("Apple");
		S.concat("Macbook"); // only trying to modify the object
		System.out.println(S); // Apple, bc you cannot change a string

		S = S.concat("iPhone"); // Here you are modifying the object as well as pointing the reference to the
								// new object.

		System.out.println(S);
		
		String state1 = "Virginia";
		String state2 = "Virginia";
		String state3 = "Virginia";
		
		String state30 = "Maryland";
		
		String state50 = "Virginia";

	}
}
