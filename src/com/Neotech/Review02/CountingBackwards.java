package com.Neotech.Review02;

public class CountingBackwards {

	public static void main(String[] args) {

		// 4321
		// 4321
		// 4321
		// 4321

		// instead of going from 1 to 4 --> we go from 4 to 1 and decrease

		for (int row = 1; row <= 4; row++) {
			for (int col = 4; col >= 1; col--) {
				System.out.print(col);
			}
			System.out.println();
		}

		// 4444
		// 3333
		// 2222
		// 1111

		System.out.println("================================");

		for (int r = 4; r >= 1; r--) {
			for (int c = 1; c <= 4; c++) { // it doesn't matter if it starts with 1 or 4 since we willl be printing row
				System.out.print(r);
			}
			System.out.println();
		}

	}

}
