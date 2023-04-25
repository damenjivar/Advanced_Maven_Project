package com.javacode_1st_April_2023;

public class Static_NonStatic {

	// Class - static
	// Non-static - Object level interaction

	// Static will call static entities
	// Static will not call non-static entities

	// Non-static can interact with static [but with a warning]

	public static void main(String[] args) {
		Static_NonStatic.sample();
		sample();

		// can't call non-static test below

		Static_NonStatic obj = new Static_NonStatic();
		obj.test();

		obj.sample(); // comes with a warning

	}

	public static void sample() {
		int i = 10;
		int j = 20;
		int sum = i + j;
		System.out.println(sum);
		// sample can't call test
	}

	public void test() {
		String S1 = "Hello";
		String S2 = "World";
		System.out.println(S1 + S2);
		// test can call sample
	}

}
