package com.Neotech.Review04;

public class Methods {

	void sayWelcome() {
		for (int i = 1; i <= 5; i++) {
			System.out.print("Welcome ");
		}
		System.out.println();
	}

	void sayWelcomeWithNumber(int n) {
		for (int i = 1; i <= n; i++) {
			System.out.print("Welcome ");
		}
		System.out.println();
	}

	void sayGreeting(String greeting) {
		for (int i = 1; i <= 5; i++) {
			System.out.print(greeting + " ");
		}
		System.out.println();
	}
	
	void sayGreetingWithNumber(String greeting, int m) {
		for (int i=1; i<=m; i++) {
			System.out.print(greeting + " " );
		}System.out.println();
	}

	public static void main(String[] args) {

		Methods m = new Methods();
		m.sayWelcome();
		m.sayWelcomeWithNumber(10);
		m.sayGreeting("Hola");
		m.sayGreetingWithNumber("Merhaba", 3);

	}

}
