package com.automationcode_15th_April_2023;

public class Student {

	String name; // default value is null
	int age; // default value is 0
	String subject; // default value is null

	public static void main(String[] args) {

		Student s1 = new Student("Tom", 10, "Science");
		System.out.println(s1.name + " -- " + s1.age + " -- " + s1.subject);

		Student s2 = new Student("Tom", 11, "Arts");
		System.out.println(s2.name + " -- " + s2.age + " -- " + s2.subject);
	}

	// In this example, the instance variables which are blue in color and local
	// variables which are brown in color, have the same name.
	
	// This keyword - instantiates variables of the current class

	public Student(String name, int age, String subject) {
		this.name = name;
		this.age = age;
		this.subject = subject;
	}
}