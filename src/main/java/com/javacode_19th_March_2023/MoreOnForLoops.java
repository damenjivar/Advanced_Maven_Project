package com.javacode_19th_March_2023;

public class MoreOnForLoops {

	public static void main(String[] args) {
		// nested for loop (for loop inside for loop)

		for (int i = 1; i <= 5; i++) {// outer for loop represents row

			for (int j = 1; j <= 5; j++) {// inner for loop represents columns
				System.out.print("Hello");
				// body of the inner loop
			}
			System.out.println("Row");
			// this is the body of the outer for loop
		}

	}

}
