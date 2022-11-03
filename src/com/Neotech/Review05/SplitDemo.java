package com.Neotech.Review05;

public class SplitDemo {

	public static void main(String[] args) {

		// Split is a method on string

		String longStr = "I am very happy today, because today is not Monday";

		String[] strArray = longStr.split("today");
		System.out.println(strArray.length);
		// 3 parts because every time it sees today it will split and there are 2 todays
		// in this sentence
		// when you see array [] you should think about for and enhanced for loops

		System.out.println("----Iterating using Enhanced for loop----");
		for (String element : strArray) { // for every element in strArray
			System.out.println(element);
		}
		System.out.println("----Iterating using Normal for loop----");

		for (int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
		}
		System.out.println("-----------------------------------------");

		longStr = "I like number 5 and 6 because 7 ate 9.";

		String[] stringArray = longStr.split("[0-9]"); // splitting whenever we see a number

		System.out.println(stringArray.length); // there are 5 parts
		// if you put [09] that means cut it when you see 0 or 9
		// [5-7] means looking for numbers 5 through 7 that will have 4 parts
		// [57] means looking for numbers 5 and 7 that will have 3 parts
		// [l7] means looking for l and number 5
		// ("57") means looking for number 57

		for (String str : stringArray) {
			System.out.println(str);
		}

	}

}
