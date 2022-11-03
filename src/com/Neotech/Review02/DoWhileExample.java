package com.Neotech.Review02;

public class DoWhileExample {
	public static void main(String[] args) {
		
		//whatever we do with wile loop <--> we can do it with do while do loop
		
		System.out.println("Similarities between WHILE & DO-WHILE");
		
		int age = 1; 
		
		while (age <=10) {
			System.out.println("Happy Birthday! You are " + age + " years old");
			age ++;
		}
		
		System.out.println("============================");
		
		int age2 = 1;
		do {
			System.out.println("Happy Birthday! You are " + age2 + " years old");
			age2++;
			
		} while (age2 <=10);
		
		System.out.println("Differences between WHILE & DO-WHILE");
		
		boolean hot = true;
		
		while (!hot) {
			System.out.println("While --> Drink");
		}
		
		do {
			System.out.println("Do While --> Drink");
			
		} while (!hot);
		
		// when we use while it won't print because the boolean condition is not met 
		//it is false
		// when we use do --> it will print first and then check the condition 
		//so it will print in that case 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
