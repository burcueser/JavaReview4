package com.Neotech.Review04;

public class Teacher {

	// Create a class of Teacher
	// String name, double salary, string subject
	// teach (), yellatStudent()

	String teacherName;
	double salary;
	String subject;

	void teach() {
		System.out.println(teacherName + " is teaching " + subject);
	}

	void yellAtStudent(String name) { // to make him yell at specific student name 
		System.out.println(teacherName + " is yelling at " + name);
	}

}
