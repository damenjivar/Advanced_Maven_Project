package com.javacode_5thMar_2023;

public class Assignment_Concat {

	public static void main(String[] args) {
		int i = 10;
		int j = -200;
		String S1 = "Hello";
		char c1 = 'd';
		double d1 = 21.09;
		
		System.out.println(i + j + S1 + c1 + d1);
		System.out.println(S1 + j + i + c1 + d1);
		System.out.println(c1 + j + S1 + i + d1);
		System.out.println(i + d1 + S1 + c1 + j);
		System.out.println(j + c1 + S1 + i + d1);
		

	}

}
