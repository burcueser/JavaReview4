package com.Neotech.Review05;

public class ToCharArray {
	public static void main(String[] args) {

		String longStr = "I am very happy today, because today is not Monday";
		System.out.println("String length is --> " + longStr.length()); // 50 characters
		// length is a method in the string class

		char[] charArray = longStr.toCharArray(); // get the characters in the string one by one

		System.out.println("char[] length is --> " + charArray.length); // again 50 characters
		// this one is a property of the char array you can see () for the string length
		// arrays don't have methods they have properties

		for (char element : charArray) {
			System.out.print(element + " ");
		} // this one is easier so prefer this one if you will print from beginning till
			// the end
		System.out.println();

		for (int i = 0; i < charArray.length; i++) {
			System.out.print(charArray[i] + " ");
		} // if you want to start from the end or somewhere in the middle you should use
			// this one

	}

}
