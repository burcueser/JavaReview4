package com.Neotech.Review03;

import java.util.Scanner;

public class ScannerArray {
	public static void main(String[] args) {

		// Ask the user: How many numbers do you want to store in the array?
		// Ask the user to enter the numbers: Read the numbers and enter them into the
		// array
		// Print the numbers from the array

		Scanner scan = new Scanner(System.in);

		System.out.println("How many numbers do you want to store in the array? ");
		int size = scan.nextInt();

		int[] array = new int[size];

		for (int i = 0; i < size; i++) {
			System.out.println("Enter a number: ");
			array[i] = scan.nextInt();

		}

		// Print the numbers from the array
		System.out.println("Let's print the numbers from the array");
		for (int j = 0; j < array.length; j++) {
			System.out.print(array[j] + " ");
		}
		System.out.println();
		System.out.println("Let's print the numbers from the array using ENHANCED FOR LOOP");
		
		for (int numbers : array) {
			System.out.print(numbers + " " );
		}System.out.println();
		
		
		//HOMEWORK: 
		//Print the sum of the numbers in the array
		//1. Using for loop
		//2. Using enhanced/advanced for loop 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
