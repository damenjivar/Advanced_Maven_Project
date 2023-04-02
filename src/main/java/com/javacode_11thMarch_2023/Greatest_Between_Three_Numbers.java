package com.javacode_11thMarch_2023;

public class Greatest_Between_Three_Numbers {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;
		
		if(a>b && a>c) { //false && false = false (goes to next)
			System.out.println("a is the greatest :" + a);
		}else if (b>a && b>c) { //true && false = false (goes to next)
			System.out.println("b is the greatest :" + b);
		}else if (c>a && c>b) { //true && true = true (prints statement)
			System.out.println("c is the greatest :" + c);
		}

	}

	}