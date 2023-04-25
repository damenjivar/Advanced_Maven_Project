package com.automationcode_15th_April_2023;

public class Method_Overloading {

	public static void main(String[] args) {
		sampleData();
		sampleData(20);
		sampleData(20, 21);
		sampleData("hello");
		sampleData("hello", "world");
		sampleData("Hello", 23);
		sampleData(new StringBuffer("Daily"));
		sampleData(new StringBuilder("Home"));
	}

	public static void sampleData() {
		System.out.println("this is a no parameter method");
	}

	public static void sampleData(int i) {
		System.out.println("this is a single int parameter method");
	}

	public static void sampleData(int j, int k) {
		System.out.println("this is a multiple int parameter method");
	}

	public static void sampleData(String S1) {
		System.out.println("this is a single String parameter method");
	}

	public static void sampleData(String S2, String S3) {
		System.out.println("this is a multiple String parameter method");
	}

	public static void sampleData(String S2, int f) {
		System.out.println("this is a multiple String parameter method");
	}

	public static void sampleData(StringBuffer S3) {
		System.out.println("this is a single StringBuilder parameter method");
	}

	public static void sampleData(StringBuilder S3) {
		System.out.println("this is a single StringBuilder parameter method");
	}
}