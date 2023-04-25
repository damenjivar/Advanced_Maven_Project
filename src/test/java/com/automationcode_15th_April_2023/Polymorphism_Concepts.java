package com.automationcode_15th_April_2023;

public class Polymorphism_Concepts {
	// poly means multiples
	// morph - different forms
	// polymorphism is multiple different forms

	// types of polymorphism -
	// 1. compile time polymorphism [static polymorphism]
	// how to achieve?
	// 1. method overloading
	// 2. method name should be same. class should be same. parameters or
	// arguments will be different.
	// 3. handled by the compiler
	// 4. HAS-A relationship

	// run time polymorphism [dynamic polymorphism]

	// how to achieve?
	// 1. inheritance
	// 2. method name should be same. class obviously different. parameters or args
	// same.
	// 3. IS-A relationship
	// 4. access modifier of child class overridden method should have higher or
	// equivalent access compared to parent class method.

	// public > default > protected > private

	// parent method is public then the child has to be public
	// parent method is protected then the child can also have both protected or
	// public, cannot be lower than that.
}
