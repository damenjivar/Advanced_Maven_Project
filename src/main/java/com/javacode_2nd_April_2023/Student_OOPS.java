package com.javacode_2nd_April_2023;
// Constructors:

// Constructor is a block which looks like a method but it has the name of the Class
// Constructor does not have a return type
// Public, private, protected, default - applicable for constructor
// Constructors are invoked the moment object is created

// Uses of constructor:
// 1. Initialize an object
// 2. It is used to optimize the code

// Misconception and people confuse you in interview by saying constructors are used to create Object [not true at all]

// Types of constructors:
// 1. Default constructor [compiler auto generates this when an Object is created]
// 2. No Argument Constructor [user-defined]
// 3. Parameterized Constructor [user-defined]

public class Student_OOPS {

	String name; // null
	int student_id; // 0
	int age; // 0 default value is always 0

	public static void main(String[] args) {

		Student_OOPS st1 = new Student_OOPS("Tom", 101, 10);
		System.out.println(st1.name + " " + st1.student_id + " " + st1.age);

		Student_OOPS st2 = new Student_OOPS("Grey", 102, 11);
		System.out.println(st2.name + " " + st2.student_id + " " + st2.age);

	}

	public Student_OOPS(String name, int student_id, int age) {
		this.name = name;
		this.student_id = student_id;
		this.age = age;
	}

}
