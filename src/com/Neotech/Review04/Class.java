package com.Neotech.Review04;

public class Class {

	public static void main(String[] args) {
		// Declaring and initializing a variable
		Baby baby1 = new Baby();
		baby1.name = "Pedro";
		baby1.weight = 18;
		baby1.gender = 'M';

		System.out.println("The name of the baby is " + baby1.name);
		System.out.println("The hair color of baby 1 is " + baby1.hairColor);
		System.out.println("The gender of the baby 1 is " + baby1.gender);

		baby1.hairColor = "black";
		System.out.println("The hair color of the baby 1 is " + baby1.hairColor);

		System.out.println("=======================================");

		// declaring a variable of type baby
		Baby baby2 = new Baby();
		System.out.println("The name of the baby 2 is " + baby2.name);

		baby2.name = "Aykut";
		baby2.gender = 'M';
		baby2.hairColor = "Red";
		baby2.weight = 5;

		System.out.println("The hair color of baby 1 is " + baby1.hairColor);
		System.out.println("The hair color baby 2 is " + baby2.hairColor);

		baby1.cry();
		baby2.cry();

		baby1.talk();

		System.out.println("================================");

		baby1.displayInformation();
		baby2.displayInformation();

	}
}
