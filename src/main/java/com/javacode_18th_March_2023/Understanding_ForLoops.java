package com.javacode_18th_March_2023;

public class Understanding_ForLoops {

	public static void main(String[] args) {
		// for(initialize; condition; increment/decrement) {
		// programming logic
		// }

		// flow of logic
		// 1. initialize value is taken into consideration
		// 2. check for the condition
		// 3. if the condition is true, the control flow will
		// go inside the body of the for loop
		// 4. if the condition is false, then it will exit
		// 5. then control goes to iteration and it is compared
		// with the condition
		// 6. then the logic again goes back in the same flow
		// until the condition is false

		for (int i = 1; i <= 5; i++) {
			System.out.println("the value of i is: " + i + "");
		}

		// print 1 to 20 using for loop

		for (int i = 1; i <= 20; i++) {
			System.out.print(i + " ");
		}
		System.out.println();

		// print first 10 multiples of 5 starting from 5 to 50

		for (int i = 1; i <= 10; ++i) {
			System.out.print(i * 5 + " ");
		}

		System.out.println();

		// print starting from 100 and decreasing 10 until 0

		for (int i = 100; i >= 0; i = i - 10) {
			System.out.print(i + " ");

		}
		// print first 20 multiples of 2 and add all the values and give the sum
		// 2, 4, 6, 8.....40
		// sum = 2+4+6+8+....+40=?

		System.out.println();

		for (int i = 1; i <= 20; i++) {
			System.out.println(i * 2 + ""); // not complete
		}

	}
}