package com.javacode_11thMarch_2023;

public class Smallest_Between_Four_Decimal_Numbers {

	public static void main(String[] args) {
		
		double a = 1.1;
		double b = 1.2;
		double c = 1.3;
		double d = 1.4;
		
		if (a>b && a>c && a>d) {
			System.out.println("a is the smallest :" + a);
		}else if (b>a && b>c && b>d) {
			System.out.println("b is the smallest :" + b);
		}else if (c>a && c>b && c>d) {
			System.out.println("c is the smallest :" + c);
		}else if (d>a && d>b && d>c) {
			System.out.println("d is the smallest :" + d);
		}

	}

}
