package com.automationcode_15th_April_2023;

public class Methods_Overloading_ClassProject {

	public static void main(String[] args) {
		System.out.println("this is the original main method");
		test();
		test(10);

		Methods_Overloading_ClassProject objref = new Methods_Overloading_ClassProject();
		objref.sample();
		objref.sample("Hello");
	}

	public static void test() {
		System.out.println("this is a static no parameter test method");
	}

	public static void test(int i) {
		System.out.println("this is a static single int parameter test method");
	}

	public void sample() {
		System.out.println("this is a non-static no parameter sample method");
	}

	public void sample(String S1) {
		System.out.println("this is a non-static one String input parameter sample method");
	}
}
