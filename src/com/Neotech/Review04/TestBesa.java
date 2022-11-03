package com.Neotech.Review04;

public class TestBesa {

	public static void main(String[] args) {

		Besa b = new Besa();

		b.addTwoNumbers();

		b.addTwoNumbersThatIGive(5, 7);

		int res1 = b.addTwoNumbersAndGiveMeTheResult();

		int res2 = b.addTwoNumbersThatIGiveAndGiveMeTheResult(9, 8);

		// We can also print the result for the last 2 of them on top of what we have
		// already printed
		// because we defined them as integers and returned them
		System.out.println(res1);
		System.out.println(res2);

	}

}
