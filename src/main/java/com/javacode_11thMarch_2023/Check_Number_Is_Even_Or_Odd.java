package com.javacode_11thMarch_2023;

public class Check_Number_Is_Even_Or_Odd {

	public static void main(String[] args) {
		int a = 39;
		int b = 20;
		
		if (a%2 == 0 && b%2 != 0) {
			System.out.println("a is an even number");
		}else if (b%2 == 0 && a%2 != 0){
			System.out.println("b is an even number");
		}
		
	}
}
