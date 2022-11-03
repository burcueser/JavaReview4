package com.Neotech.Review02;

public class ContinueDemo {
	
	public static void main(String[] args) {
		
		//I want to celebrate my son's bday from 11 to 20 (use for loop)
		//but not the 13th bday bc we are scared
		//lets use for loop
		
		for (int bday = 11; bday <=20; bday++) {
			if (bday == 13) {
				continue;
			}
		System.out.println("Happy Birthday Son! You are " + bday + " years old");	
		}
		
		System.out.println("============Doing the same thing with While Loop =============");
		
		int age =11;
		while (age <=20) {
			age++; // be careful with where you increment the variable
			if (age ==13) {
				System.out.println("No celebration, we are scared");
				continue;
			}
			System.out.println("Happy Birthday! You are " + age + " years old");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
