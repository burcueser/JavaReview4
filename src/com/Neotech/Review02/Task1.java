package com.Neotech.Review02;

import java.util.Scanner;

public class Task1 {
	
	public static void main(String[] args) {
		//Ask the user to enter a positive number and add it to the total
		//User should enter -1 to STOP, -1 will not be added to the total 
		
		
		Scanner scan = new Scanner (System.in);
		
		
		int num = 0;
		int total =0;
		
		System.out.println("Please enter a positive number! To STOP enter -1");
		num = scan.nextInt();
		
		while (num != -1) {
			total += num;
			System.out.println("Please enter a positive number! To STOP enter -1");
			num = scan.nextInt();
		} 
		System.out.println("total = " +total);
		
	System.out.println("==== 2nd way DO WHILE LOOP =======");
	int num2 = 0;
	int total2 = 0;
	
	do {
		System.out.println("Please enter a positive number! ToSTOP enter -1");
		num2 = scan.nextInt();
		if (num2 != -1) {
		total2 += num2;}
	}
	while (num2!=-1);
	System.out.println("Total = " + total2);
		
		System.out.println("===========3rd way FOR LOOP ============");
		
		System.out.println("Please enter a positive number! ToSTOP enter -1");
		//for is not suggested, it became weird and others are easier to execute
		int num3 = 0;
		int total3 = 0;
		num3 = scan.nextInt();
		
		for (; num3 != -1;) {
			total3 += num3;
			System.out.println("Please enter a positive number! To STOP enter -1");
			num3 = scan.nextInt();
			
		}
		System.out.println("Total = " + total3);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
