package com.Neotech.Review05;

public class Task {
	public static void main(String[] args) {

		// Print the whole array, but replace 'a' with 'e'
		// Don't use replace / replaceAll method

		System.out.println("\n\tPrint the whole array, but replace \"a\" with \"e\"");
		// if you want to use " inside "" you need to use \"a\" to be able to print it
		// \n go to the new line (enter)
		// \t means tab
		// these are different escape characters

		String longStr = "I am very happy today, because today is not Monday";

		char[] charArray = longStr.toCharArray();

		for (char element : charArray) {
			// if there is only one statement inside the if
			// we can remove the curly brackets but in this case we have else so it won't
			// work
			if (element == 'a') { // since it is a char we use ==
				System.out.print('e');
				// System.out.print('e');
				// System.out.print('e'); // instead of 'a' we print three 'e's
			} else {
				System.out.print(element);
			}
		}

	}
}
