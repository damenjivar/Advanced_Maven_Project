package com.automationcode_15th_April_2023;

public class MainMethod_Overloaded {

	// can I overload the main method? yes

	public static void main(String[] args) {
		System.out.println("this is the original main method");
		main();
		main(10);
		main(args = new String[4], args = new String[5]);
	}

	public static void main() {
		System.out.println("this is a main method without any parameters");
	}

	public static void main(int i) {
		System.out.println("this is a main method with a single int input parameters");
	}

	public static void main(String[] args1, String[] args2) {
		System.out.println("this is a main method with two String array input parameters");

	}

}
