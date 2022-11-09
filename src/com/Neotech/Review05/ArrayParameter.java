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

		// Task 2
		result = ap.arraySum(array);
		System.out.println("The sum of the array is --> " + result);

		// Task 3

		double d = ap.arrayAvg(array);
		System.out.println("The average of the array is --> " + d);

	}
	// we closed the parenthesis for public static void main(String[] args) and open
	// new public method

	// Task 2:
	// Create a method that will get an array of integers
	// and return the sum. make the method protected

	protected int arraySum(int[] arr) {
		int sum = 0;

		for (int el : arr) {
			sum += el;
		}
		return sum;
	}

	// Task3:
	// Create method that will get an array of integers
	// and return the average as a double. Make the method private

	private double arrayAvg(int[] arr) {
		// you can call a method from another method
		// instead of recalculating sum you can call it from the sum method we already
		// typed

		double sum = arraySum(arr);
		double average = sum / arr.length;

		return average;
	}

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
