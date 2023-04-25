package com.automationcode_23rd_April_2023;

public class String_MemoryLocations {

	// heap memory - String Constant Pool or String Literal Pool (SCP/SLP)
	// stack memory
	// PC register
	// method area
	// native method area

	// whenever you create an object using new keyword, the object is stored in the
	// heap memory.

	public static void main(String[] args) {

		String S1 = new String();

		String S2 = new String("Java"); // literal gets stored in SLP/SCP area
		//2 objects will get created. 1 due to new keyword and another 1 due to literal past

		String S3 = new String("Python");
		
		String S4 = new String("Java");
		
		String S5 = "Java"; // no object will be created in this 
	}

}
