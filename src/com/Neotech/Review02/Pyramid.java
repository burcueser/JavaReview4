package com.Neotech.Review02;

public class Pyramid {

	public static void main(String[] args) {
		//*
		//**
		//***
		//****
		
		for (int i = 1; i<=4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("=================================");
		
		for (int num = 1; num<= 4; num++) {
			for (int column = 1; column <=4; column ++) {
				System.out.print(num);
			}
			System.out.println();
		}
		
		System.out.println("========================");
		for (int row = 1; row <=4; row++) {
			for (int col = 1; col<=5 - row; col ++) {
				System.out.print(row);
			}
			System.out.println();
		}
		
		System.out.println("=================================");
		
		
		for (int a = 1; a<=4; a++) {
			for (int b = 1; b <= a; b++) {
				System.out.print(a);
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
