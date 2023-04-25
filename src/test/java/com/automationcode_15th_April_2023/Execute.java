package com.automationcode_15th_April_2023;

public interface Execute {

	// 100% abstraction
	// all the variables inside the interface are public, static, & final in nature

	// what is an interface?
	// as blueprint of a class
	// it specifies the methods that a class should implement
	// but it does not provide any implementation details of those methods

	// interface tells a class what to do but does not tell how to do
	// the implementation details of the methods are left to the implementing class
	// you cannot change final int variable, even with ++

	public static final int i = 10;

	public void secret();

	// all non-static methods can be created using default keywords

	default void world() {

	}

	public static void green() {
		
	}
}
