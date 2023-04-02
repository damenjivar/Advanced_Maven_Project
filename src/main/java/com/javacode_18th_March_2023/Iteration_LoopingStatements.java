package com.javacode_18th_March_2023;

public class Iteration_LoopingStatements {

	// while loop
	// for loop
	// nested for loop
	// advanced for loop

	public static void main(String[] args) {

		// print the first 10 natural numbers
		// 1.....10

		// while loop syntax
		// 1. you have to initialize a value of a variable
		// 2. you have to pass the condition in the while
		// 3. if your condition is true, the control will go
		// inside the body of the while loop
		// 4. if your condition is false, the control will not
		// go inside the body of the while loop
		// 5. to control your logic, you may choose to increment
		// or decrement a certain value

		boolean b1 = true;

		while (b1 != false) {
			System.out.println("the grass is green");
			break; // to break
		}

		// print the first 10 natural numbers using while loop
		int i = 1;
		while (i <= 10) {
			System.out.print(i + " ");
			i++;
		}

		System.out.println();
		// print numbers backward from 20 to 1 using while loop

		int j = 20;
		while (j > 0) {
			System.out.print(j + " ");
			j--;
		}

		System.out.println();
		// print first 20 multiples of 2

		int k = 1;
		while (k <= 20) {
			System.out.print(k * 2 + " ");
			k++;
		}

		System.out.println();
		// print from 100, 95, 90, 85...5
		

		int a = 100;
		while (a > 1) {
			System.out.print(a + " ");
			a = a - 5;
		}
	}
}