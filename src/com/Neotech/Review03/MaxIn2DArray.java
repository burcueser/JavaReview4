package com.Neotech.Review03;

public class MaxIn2DArray {
	public static void main(String[] args) {

		// Task: Find the biggest number in 2D array

		int[][] num = { { -2, 3, 5 }, { 2, 4, 7 }, { 8, 1, -9 }, { 3, 5, 1 } };

		int biggest = num[0][0]; // in case all numbers negative we don't start with 0

		for (int row = 0; row < num.length; row++) {

			for (int col = 0; col < num[row].length; col++) {

				int element = num[row][col];
				if (biggest < element) {

					biggest = element;
				}

			}
		}

		System.out.println("The biggest number is --> " + biggest);

		System.out.println("======= ENHANCED FOR LOOP =======");

		int max = num[0][0];

		for (int[] row : num) {

			for (int col : row) {

				if (col > max) {
					max = col;
				}
			}
		}
		System.out.println("The max number is -> " + max);

	}

}
