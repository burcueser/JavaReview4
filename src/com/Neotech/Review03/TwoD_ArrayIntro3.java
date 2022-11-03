package com.Neotech.Review03;

public class TwoD_ArrayIntro3 {
	public static void main(String[] args) {

		int[][] nums = { { 3, 6 }, { 5, 2, 9, 7 }, { 8 } };

		System.out.println(nums[1][3]);

		System.out.println(nums[2][0]);

		System.out.println("The number of the rows --> " + nums.length);
		System.out.println("The length of the row with index 1 -> " + nums[1].length);

		System.out.println("=====================");

		for (int row = 0; row < nums.length; row++) {
			// nums[row].length will give me the length of that specific row
			for (int col = 0; col < nums[row].length; col++) {
				System.out.print(nums[row][col] + " ");
			}
			System.out.println();
		}

		System.out.println("====== ENHANCED FOR LOOP ==========");
		for (int[] row : nums) {
			for (int element : row) {
				System.out.print(element + " ");
			}
			System.out.println();
		}

	}

}
