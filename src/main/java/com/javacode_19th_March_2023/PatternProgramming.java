package com.javacode_19th_March_2023;

public class PatternProgramming {

	public static void main(String[] args) {
		System.out.println("pattern 1");
		
		for(int i=1; i<=5; i++) {
			
			for(int j=1; j<=5; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("pattern 2");
		
		for(int i=1; i<=5; i++) {
			
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("pattern 3");
		
		for(int i=1; i<=5; i++) {
			
			for(int j=5; j>=i; j--) {
				System.out.print("* ");
			}
		System.out.println();
	}
		System.out.println("pattern 4");
		
		for(int i=1; i<=5; i++) {
			
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=2; i<=5; i++) {
			
		for(int j=5; j>=i; j--) {
			System.out.print("* ");
		}
		System.out.println();
		}
		
		
		
		
		
		
		
		
}
}