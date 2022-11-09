package com.Neotech.Review05;

public class StaticVoidFamilyMembers {

	String firstName; // instance variable, belongs to the instance / object
	static String lastName; // static/class variable, belongs to the class
	int age; // another instance variable

	// With non static methods you can access ALL the variables
	void printFullName() {
		System.out.println("Full name is: " + firstName + " " + lastName);
	} // non static method

	// With static methods you can ONLY static variables
	static void printFamilyName() { // static object
		System.out.println("Family name is: " + lastName);
		// System.out.println("Full name is: " + firstName + lastName);
	} // inside static method you can only call static variables (you can't call
		// firstName or age)

}
