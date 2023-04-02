package com.automationcode_18th_March_2023;

import org.testng.annotations.Test;

public class InvocationCountUse {

	@Test(priority = 1)

	public void sample1() {
		System.out.println("this is Test1");
	}

	@Test(priority = 2)

	public void sample2() {
		System.out.println("this is Test2");
	}

	@Test(priority = 3, invocationCount = 5) // specifies how many times it'll run

	public void sample3() {
		System.out.println("this is Test3");
	}

}
