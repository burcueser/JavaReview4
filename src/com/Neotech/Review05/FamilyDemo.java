package com.Neotech.Review05;

public class FamilyDemo {
	
	public static void main(String[] args) {
		
		//I CAN access static/class variables before I create an object
		StaticVoidFamilyMembers.lastName ="James";
		
		//I CAN'T access instance/non-static variables before I create an object
		//StaticVoidFamilyMembers.firstName = "LeBron";
		
		// I CAN access static/class methods before I create an object
		StaticVoidFamilyMembers.printFamilyName();
		
		//I CAN'T access instance/non-static methods before I create an object
		//StaticVoidFamilyMembers.printFullName();
		
		System.out.println("=============================================");
		
		//CREATING AN OBJECT to access firstName and age
		StaticVoidFamilyMembers member1 = new StaticVoidFamilyMembers();
		member1.firstName = "LeBron";
		member1.age = 37;
		
		StaticVoidFamilyMembers member2 = new StaticVoidFamilyMembers();
		member2.firstName = "Savannah";
		member2.age = 35;
		
		member1.printFullName();
		member2.printFullName();
		
		System.out.println("=============================================");
		System.out.println("They went to the court and chnaged their lastname!!");
		
		//Static variables CAN change
		StaticVoidFamilyMembers.lastName = "Brown";
		
		member1.firstName = "King LeBron";
		
		member1.printFullName();
		member2.printFullName();
		
		// They had a baby
		
		StaticVoidFamilyMembers baby = new StaticVoidFamilyMembers();
		
		//Does this baby has a firstName? 
		System.out.println("firstName ->" + baby.firstName); //null
		
		//Does this baby has a lastName?
		System.out.println("lastName -> " + baby.lastName); // Brown
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
