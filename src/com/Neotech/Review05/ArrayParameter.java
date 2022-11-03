package com.Neotech.Review05;

import java.util.Arrays;

public class ArrayParameter {
	public static void main(String[] args) {

		int[] array = { 7, 3, 5, 4, 65, 8 };
		// System.out.println(array); // this array is a object you will get [I@6bf2d08e

		// or you can print like this
		System.out.println(array[2]); // this will print the third element in array

		// print the array using:
		String str = Arrays.toString(array); // this will store it into an array / this is a method
		// Arrays is a class somewhere else we called it
		System.out.println(str); // I am able to print all the numbers in array at the same time

		// OR in one step
		// System.out.println(Arrays.toString(array));

		ArrayParameter ap = new ArrayParameter(); // object of the class
		int result = ap.largestNumber(array); // call the method from below
		System.out.println("The largest number in the array is --> " + result);

	} // we closed the parenthesis for public static void main(String[] args) and open
		// new public

	public int largestNumber(int[] arr) { // give me an array as a parameter
		int largest = arr[0];
		for (int el : arr) {
			if (el > largest) {
				largest = el;
			}

		}
		return largest;

	}

	// we created the second public and then called it in the first part of the
	// public static void
	// to print the largest number for the array

}
