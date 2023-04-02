package com.javacode_11thMarch_2023;

public class AccessModifiers {
	
	public static int age = 20;
	private static String name = "Don";
	protected static double height = 6.0;
	String color = "Red";
	
	

	public static void main(String[] args) {
		// There are 4 access modifiers in java
		
		//1. public - is everywhere across the project
		//2. protected - access is within the package. It can have access outside the package 
		// but the condition is that you have to have a child class. 
		//3. private - this is strictly within the same Class. 
		//4. default - only within the package 

	}
	
	public static void sample( ) {
		System.out.println("This is a public sample method");
	}
	protected static void sample1() {
		System.out.println("This is a protected sample1 method");
	}
	private static void cash() {
		System.out.println("This is a private cash method");
	}
	static void setup() {
		System.out.println("This is a default setup method");
	}
}
