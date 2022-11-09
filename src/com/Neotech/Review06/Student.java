package com.Neotech.Review06;

public class Student {

	// instance variables
	String name;
	int age;

	// static/class variable
	static String school;

	// Constructor
	public Student(String studentName, int studentAge) {

		this.name = studentName;
		this.age = studentAge;
	}

	public void displayStudentInfo() {
		System.out.println("My name is " + this.name + ", my age is " + this.age + ", I study at " + Student.school);
	}

	public static void main(String[] args) {
		Student.school = "Neotech";

		// we don't have the default constructor
		// Student s1 = new Student(); // this won't work --> error

		Student s2 = new Student("Aykut", 15);

		s2.displayStudentInfo();

		Student s3 = new Student("Burcu", 31);
		s3.displayStudentInfo();

	}

}
