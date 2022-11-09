package com.Neotech.Review06;

public class Dermatologist extends Doctor {

	String dermId;

	public Dermatologist() {
		// super();
		// implicitly it is calling the default constructor of the parent
	}

	// The constructors are NOT INHERITED
	// You need to create the constructed for each class
	public Dermatologist(String name, int salary, String licenseId) {
		super.name = name;
		super.salary = salary;
		super.licenseId = licenseId;
	}

	public Dermatologist(String name, int salary, String licenseId, String dermId) {
		// super.name = name;
		// super.salary = salary;
		// super.licenseId = licenseId; // instead you can type them all together
		super(name, salary, licenseId);
		this.dermId = dermId;
	}

	public void applySkinTreatment() {
		System.out.println("Doctor " + name + " applies skin treatment");
	}

}
