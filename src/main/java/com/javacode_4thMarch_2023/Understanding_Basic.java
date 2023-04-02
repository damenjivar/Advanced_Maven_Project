package com.javacode_4thMarch_2023;

public class Understanding_Basic {

	public static void main(String[] args) {
		
		//you want to use integers
		
		//int has maximum and minimum range
		
		int i = 10;
		
		System.out.println("The value of i in this row is :" + i);
		
		i = 20;
		
		System.out.println("The value of i in this row is :" + i);
		
		int a;
		int b = 20;
		int c = -21;
		a = 10;
		
		System.out.println(a+b+c);
		
		//boolean data types
		
		boolean b1 = 1<2; //true 
		System.out.println("the value of b1 is : " + b1);
		boolean b2 = false; //false
		
		System.out.println(b1 == b2);
		
		//char data types
		
		char c1 = ' ';
		char c2 = '$';
		char c3 = 'a';
		char c4 = 'B';
		char c5 = '1';
		//char c6 = '1.0'; single character value only allowed
		
		//short, byte and long
		
		//byte range -128 to 127
		//short range -32,768 to 32,767
		//long range -2^63 to 2^63-1 
		
		double d1 = 20;
		double d2 = 20.11;
		//double acts a decimal value
		
		//String is a statement
		String S1 = "I am learning java";
		String S2 = "123";
		System.out.println(S1 + S2);

	}

}
