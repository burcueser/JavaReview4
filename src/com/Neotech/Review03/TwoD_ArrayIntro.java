package com.Neotech.Review03;

public class TwoD_ArrayIntro {
	public static void main(String[] args) {
		
		int [][] numbers = new int [3][4]; // this is the size [rows][columns]
		
		numbers [1][2] = 9; //assign the value to the specific coordinate
		numbers [0][1] = 5;
		numbers [0][0] = 3;
		numbers [2][2] = 8;
		
		//re-assigning the value to an element
		numbers [0][0] += 3; 
		
		numbers [2][0] = 4;
		numbers [0][3] = 8;
		numbers [1][0] = 1;
		
		//numbers [3][0] = 6; // outside the size - it will warn when you run the code
		//this is called run-time error
		
		int rows = numbers.length; // we will get the number of rows
		System.out.println("The number of rows is: " + rows);
		
		int cols1 = numbers[1].length; // 2nd row's length -> how many elements (columns) in row 2
		System.out.println("The length of row with index 1 is -> " + cols1);
		
		for (int row = 0; row< numbers.length; row++) {
			for( int col = 0; col < numbers[row].length; col++) {
				System.out.print(numbers[row][col]);
			}System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
