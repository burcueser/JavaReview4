package com.Neotech.Review06;

// OOP -> Object Oriented Programming

//1. Inheritance
// 2. PolyMorphism
// 3. Abstraction
// 4. Encapsule

public class Doctor {

	String name;
	int salary;
	String licenseId;

	// it is a good practice to leave default constructor
	Doctor() {

	}

	Doctor(String name, int salary, String licenseId) {
		this.name = name;
		this.salary = salary;
		this.licenseId = licenseId;
	}

	public void checkUp(String name) {
		System.out.println("Doctor " + this.name + " makes a checkup on " + name);
	}

}
