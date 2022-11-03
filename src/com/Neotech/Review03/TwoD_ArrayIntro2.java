package com.Neotech.Review03;

public class TwoD_ArrayIntro2 {
	public static void main(String[] args) {

		int[][] num = { { 6, 3, 7 }, { 2, 4, 9 }, { 1, 5, -4 }, { 8, 6, 0 } };

		// How to print 9
		System.out.println(num[1][2]);

		// How to print 8
		System.out.println(num[3][0]);

		// How to print 6
		System.out.println(num[0][0]);
		// OR
		System.out.println(num[3][1]);

		System.out.println("======================================");

		// NESTED / ENHANCED FOR LOOP

		for (int[] row : num) { // every row is an array
			// I will iterate the row (1D-array) with enhanced loop
			for (int element : row) { // every element in a row is an integer
				System.out.print(element + " ");
			}
			System.out.println();
		}

		System.out.println("====================");

		for (int[] row : num) {
			// I will iterate the row(1D Array) with a normal for loop
			for (int i = 0; i < row.length; i++) {
				System.out.print(row[i] + " ");
			}
			System.out.println();

		}

	}

}
