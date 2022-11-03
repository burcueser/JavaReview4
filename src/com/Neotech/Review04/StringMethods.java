package com.Neotech.Review04;

public class StringMethods {

	public static void main(String[] args) {

		String str = "Pershendetje";
		System.out.println(str.length()); // how many characters
		System.out.println(str.isEmpty()); // if it has any characters

		System.out.println(str.toUpperCase()); // to upper case
		System.out.println(str.toLowerCase()); // to lower case

		System.out.println(str); // the original remained the same

		boolean result = str.equals("persendetje"); // false
		System.out.println(result);

		boolean equal = str.equalsIgnoreCase("PERShENDETJE");
		System.out.println(equal);

		System.out.println("============================");

		System.out.println(str.contains("sh")); // true
		System.out.println(str.contains("SH")); // false --> you can't do contains and
												// ignore case all together there is a way;
		System.out.println(str.contains("SH".toLowerCase())); // this will give true

		boolean starts = str.startsWith("P"); // false because case sensitive
		System.out.println(starts);

		System.out.println("Does Persehendetje starts with Per?");
		System.out.println(str.startsWith("Per"));

		System.out.println("================================");

		String name = "Viktor" + "-" + "Bondar"; // the way to concat string
		System.out.println(name);

		String name2 = "Viktor".concat("-").concat("Bondar");

	}

}
