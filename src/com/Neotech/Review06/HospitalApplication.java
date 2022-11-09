package com.Neotech.Review06;

public class HospitalApplication {

	public static void main(String[] args) {

		Doctor d1 = new Doctor("Karen", 170000, "D123");
		d1.checkUp("Burcu");

		// These are variables and methods of child class, can't use it for the parent
		// class
		// d1.dermId =
		// d1.applySkinTreatment =
		
		// Creating a Dermatologist with NO initial information
		Dermatologist d2 = new Dermatologist();
		d2.name = "Alex";
		d2.salary = 500000;
		d2.licenseId = "D5555";
		d2.dermId = "X5555";

		d2.checkUp("Alexa");
		d2.applySkinTreatment();

		System.out.println("-------------------------------------");

		//Creating a dermatologist with initial information 
		Dermatologist d3 = new Dermatologist("Kenan", 200000, "D482");

		d3.dermId = "X284";
		d3.salary = 210000; // We are reassigning the salary
		d3.applySkinTreatment();
		
		System.out.println("-------------------------------------");
		
		Dermatologist d4 = new Dermatologist("Jennifer", 350000, "D195", "X951");
		d4.checkUp("Onur");
		d4.applySkinTreatment();
		

	}

}
