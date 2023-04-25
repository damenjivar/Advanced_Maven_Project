package com.automationcode_2nd_April_2023;

import org.testng.Assert;
import org.testng.annotations.Test;

// 2 forms of Assertions in TestNG

// 1. Assert
// 2. SoftAssert

public class Hard_Assert {

	@Test
	public void logicTest() {

		if (2 != 3) {
			System.out.println(2 + 3);
			Assert.assertTrue(true);

			Assert.fail();

			if (true != false) {
				System.out.println("My logic is true");
			}
		}

	}

}
