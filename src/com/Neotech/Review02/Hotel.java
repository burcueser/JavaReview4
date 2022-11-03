package com.Neotech.Review02;

public class Hotel {
	
	public static void main(String[] args) {
		
		//In my hotel I have 4 floors
		//Each floor --> 6 rooms
		//Room numbers floor 1 1.1 / 1.2/1.3... 1.6
		//Room numbers floor 2 2.1/2.2/2.3....2.6
		//I want to print all the room numbers
		
		for (int floor = 1; floor <= 4; floor++) {
			System.out.println("Floor -> "+ floor);
			for (int room = 1; room <=6; room++) {
				System.out.print(floor +"." + room + " ");
			}
			System.out.println(" ");// bring me to the next line after printing room numbers
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
