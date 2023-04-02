package com.javacode_5thMar_2023;

public class Post_Increment {

	public static void main(String[] args) {
		
		
		//variable is i which is before ++
		//++ is coming after i. So ++ is post variable
		//post increment operator
		
		int i = 1;
		i++; //this is uni-body
		
		System.out.println(i);
		
		int j = i++;
		
		System.out.println(j);
		System.out.println(i);
		
		j = i++ + i++;
	  //j = 3 + 4 = 7
		System.out.println(i); //5
		System.out.println(j); //7
		
		j = i++ + i++ + i++ + i++;
		
	  //j = 6 + 7 + 8 + 9
		//i = 
		
		System.out.println(i);
		System.out.println(j);

	}

}
