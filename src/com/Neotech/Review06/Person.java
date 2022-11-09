package com.Neotech.Review06;

public class Person {

	// instance variables

	public String name;
	int age;
	protected int weight;

	public Person() {
		System.out.println("Creating a person with no parameters");

	}

	public Person(String pName, int pAge) {
		name = pName;
		age = pAge;

	}

	public Person(String tName, int tAge, int tWeight) {
		name = tName;
		age = tAge;
		weight = tWeight;

	}

	public void displayInfo() {
		System.out.println("Name: " + name + " | age: " + age + " | weight: " + weight);
	}

}
