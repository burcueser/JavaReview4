package com.Neotech.Review03;

public class ArrayIntro {

	public static void main(String[] args) {
		
		int [] array = new int [4]; //we tell we are going to put 4 elements in array
		// then we tell what those elements are and their location 
		array[0] = 6; 
		array[1] = 4;
		array[2] = 9; 
		array[3] = 2; 
		
		int sumArray = 0;
		for (int i = 0; i < array.length; i++) {
			sumArray += array[i];
		}System.out.println("The sum of the array is: " + sumArray);
		
		
		// 2ND WAY
		int [] array2 = {6,4,9,2};
		int sum2 = 0; 
		
		for (int num : array2 ) { 
			sum2 += num;
		} // with this one you have to start from the beginning and go all the way to the end 
		//you can't start from the middle or from the end and go to the beginning
		System.out.println("The sum of the array is " +sum2);
		
		System.out.println("=========================");
		
		String[] animals = {"dog", "cat", "pig", "horse", "mouse", "bird"};
		for (int k = 0; k< animals.length; k++) {
			System.out.print(animals[k] +" " );
		}System.out.println();
		
		for (String element : animals) {
			System.out.print(element + " " );
		}System.out.println();
		
		System.out.println("========================");
		System.out.println("Printing animals in reverse order");
		
		for (int j = animals.length - 1; j >= 0; j--) {
			System.out.print(animals[j] + " " );
		}System.out.println();
		
		//we can't do the reverse order with enhanced for loop <for (numbers : animals ) ......>
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
