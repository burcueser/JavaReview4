package com.Neotech.Review02;

public class Task2 {

	public static void main(String[] args) {
		// 1. Add Even numbers
		// 2. Also add odd numbers
		// 3. also all the numbers
		// use for loop
		// between 1 and 50

		// since at the beginning all the totals are 0, we defined them 0:
		int oddTotal = 0;
		int evenTotal = 0;
		int total = 0;

		for (int i = 1; i <= 50; i++) {

			if (i % 2 == 0) { // even
				evenTotal += i;

			} else { // odd
				oddTotal += i;

			}
			total += i;
		}

		System.out.println("The sum of even numbers -> " + evenTotal);
		System.out.println("The sum of odd numbers -> " + oddTotal);
		System.out.println("The sum of all numbers -> " + total);

	}

}
