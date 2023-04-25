package com.automationcode_9th_April_2023;

// child class uses extends to connect with parent class
// parent class cannot inherit child properties

public class Child extends Parent {

	public static void main(String[] args) {
		Child child = new Child();
		child.bankBalance();
		child.apartment();
		child.sportsCar();
		child.Bike();

		Parent parent = new Parent();
		parent.apartment();
		parent.bankBalance();

	}

	public void sportsCar() {
		System.out.println("child's sport car");
	}

	public void Bike() {
		System.out.println("child's bike");
	}
}
