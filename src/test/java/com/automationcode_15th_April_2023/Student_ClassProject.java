package com.automationcode_15th_April_2023;

public class Student_ClassProject {

	String name;
	int age;
	String country;
	String subject;
	int height;
	int weight;
	String sex;
	String city;
	String favFood;
	String favColor;

	public static void main(String[] args) {

		Student_ClassProject s1 = new Student_ClassProject("Tom", 10, "USA", "Science", 6, 200, "male", "NY", "pasta",
				"green");
		System.out.println(s1.name + "--" + s1.age + "--" + s1.country + "--" + s1.subject + "--" + s1.height + "--"
				+ s1.weight + "--" + s1.sex + "--" + s1.city + "--" + s1.favFood + "--" + s1.favColor);

		Student_ClassProject s2 = new Student_ClassProject("Harry", 11, "DR", "Arts", 5, 190, "male", "VA", "banana",
				"red");
		System.out.println(s2.name + "--" + s2.age + "--" + s2.country + "--" + s2.subject + "--" + s2.height + "--"
				+ s2.weight + "--" + s2.sex + "--" + s2.city + "--" + s2.favFood + "--" + s2.favColor);

		Student_ClassProject s3 = new Student_ClassProject("Carly", 12, "CA", "Math", 5, 180, "female", "DC", "apples",
				"blue");

		System.out.println(s3.name + "--" + s3.age + "--" + s3.country + "--" + s3.subject + "--" + s3.height + "--"
				+ s3.weight + "--" + s3.sex + "--" + s3.city + "--" + s3.favFood + "--" + s3.favColor);
	}

	public Student_ClassProject(String name, int age, String country, String subject, int height, int weight,
			String sex, String city, String favFood, String favColor) {

		this.name = name;
		this.age = age;
		this.country = country;
		this.subject = subject;
		this.height = height;
		this.weight = weight;
		this.sex = sex;
		this.city = city;
		this.favFood = favFood;
		this.favColor = favColor;

	}

}
