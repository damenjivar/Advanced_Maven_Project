package com.javacode_1st_April_2023;

public class Pillars_OOPS_In_Java {
	// OOPS - object oriented programming [system or structure]
	// 6 pillars of OOPS in java
	// 1. Classes and Objects
	// 2. Methods
	// 3. Inheritance
	// 4. Polymorphism
	// 5. Abstraction
	// 6. Encapsulation

	// Class is collection of methods
	// User-defined Class can call user-defined methods directly only if static
	// keyword is associate with the method
	// What happens to the method which does not have static associated with it?
	// Class says make an object and using the Object reference call that method
	// which does not have static associated with it
	// Class is a also a collection of Objects
	// Bookish definition of Class - it is a blueprint or a template and it will go
	// with connection to Object and its properties
	// Class is a logical entity. It is not a physical entity.
	// Class does not occupy memory space

	// Ways to create an Object in Java
	// 1. using new keyword (only one that will be used)
	// 2. newInstance() method
	// 3. clone() method
	// 4. deserialization
	// 5. factory methods

	// Object is nothing but instance of a Class
	// Object is also a physical entity
	// Object occupies memory space
	// Object is created using new keyword so the memory allocated is in Heap Area
	// Object has certain properties:-
	//1. Identification [name]
	//2. State [Breed, color, age]
	//3. Behavior [barking, sleeping, eating, running]
	// Categorization of Object is simpler compared to Class
	// Object is collection of all non-static entities of the Class
	
	String name;
	int age;
	double height;
	long salary;
	short rollNumber;

	public static void main(String[] args) {
		Pillars_OOPS_In_Java.sample();

		// How to create an Object using the ClassName and new keyword

		Pillars_OOPS_In_Java objref = new Pillars_OOPS_In_Java(); // Left is class / Right is object
		objref.testSample();

	}

	public static void sample() {
		System.out.println("This is sample method");
		System.out.println(100 - 90);
	}

	public void testSample() {
		System.out.println("This is test sample method");
	}

}
