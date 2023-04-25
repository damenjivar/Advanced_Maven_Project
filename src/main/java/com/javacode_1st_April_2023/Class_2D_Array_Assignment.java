package com.javacode_1st_April_2023;

public class Class_2D_Array_Assignment {

	public static void main(String[] args) {
		// 1. Create a 2-D String Array
		// 2. Initialize that 2-D Array by entering values in respective columns
		// 3. I want you to retrieve the values of the String 2-D Array in traditional
		// style as well as compact style

		String[][] S1 = new String[2][3];

		S1[0][0] = "Java";
		S1[0][1] = "Java1";
		S1[0][2] = "Java2";

		S1[1][0] = "Python";
		S1[1][1] = "Python1";
		S1[1][2] = "Python2";

		for (int i = 0; i < S1.length; i++) {
			for (int j = 0; j < S1[i].length; j++) {
				System.out.print(S1[i][j] + " ");
			}
			System.out.println();
		}

		String[][] S2 = { { "kia", "jeep", "ford" }, { "prius", "cherokee", "mustang" } };

		S2[0][0] = "kia";
		S2[0][1] = "jeep";
		S2[0][2] = "ford";

		S2[1][0] = "prius";
		S2[1][1] = "cherokee";
		S2[1][2] = "mustang";

		for (int i = 0; i < S2.length; i++) {
			for (int j = 0; j < S2[i].length; j++) {
				System.out.print(S2[i][j] + " ");
			}
			System.out.println();
		}
	}
}