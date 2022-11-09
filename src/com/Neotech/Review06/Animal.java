package com.Neotech.Review06;

// You can have multiple classes in one file
// Only one class can be public 
// The public class name should be the same as file name 

public class Animal {

	String name;
	int legs;

	Animal() {

	}

	Animal(String name, int legs) {
		this.name = name;
		this.legs = legs;
	}

	public void sleep() {
		System.out.println("All animals sleep");
	}

	void displayInfo() {
		System.out.println(name + " has " + legs + " legs");
	}

}

class Snake extends Animal { // you can only one public class under one class
	// this can't be public
	// the name of the class has to match the public class name
	// you can't make the animal class and snake public class unless you change the
	// class name
	// to snake


}
