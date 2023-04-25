package com.automationcode_15th_April_2023;

public class Method_Overriding_Child extends Method_Overriding {

	public static void main(String[] args) {
		Method_Overriding_Child child = new Method_Overriding_Child();
		child.display();
		child.hello(10);

		Method_Overriding parent = new Method_Overriding();
		parent.display();

	}

	public static void display() {
		System.out.println("child's display");
	}

	public static void hello(int i) {
		System.out.println("this is child's int parameter method");
	}
}
