package com.javacode_26th_March_2023;

public class MethodsInJava {

	// Methods are also known as functions
	// Methods are known as independent units of execution
	// access modifier static/non-static returnType nameOfTheMethod() { }

	public static void main(String[] args) {
		System.out.println("this is the main method");
		hello();
		sample(10,20,30); // must define parameters
		String val = test("hello", "world");
		System.out.println(val);
	}

	public static int sample(int i, int j, int k) {
		i = 10;
		j = 20;
		k = 30;

		int sum = i + j + k; // 60
		System.out.println(sum);
		return sum; // what are we trying to return?
	}

	public static String test(String S1, String S2) {
		String S3 = S1 + S2;
		return S3;

	}

	public static void hello() {
		System.out.println("This is the hello method");
	}

}
