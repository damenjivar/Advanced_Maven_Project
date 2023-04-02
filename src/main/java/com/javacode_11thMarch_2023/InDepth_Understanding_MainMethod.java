package com.javacode_11thMarch_2023;

public class InDepth_Understanding_MainMethod {

	//why is main method always public?
	//if I swap the reserved keyword public static to static public will it work or not?
	//yes it will still work
	//you are not allowed to change nomenclature of main to anything else. main remains main
	
	public static void main(String[] args) {
		System.out.println("this is the main method");
		
		temp();
		//logic must be under main method to express logic
		//main method is always public because it always needs to be accessed from other classes

	}
	public static void temp() {
		System.out.println("this is the temp method");
	}
}
