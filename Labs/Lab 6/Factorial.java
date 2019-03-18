/*
 * Lab 6 - Factorial.java
 * Joao Paulo D. S. Ferreira
 * CSIT 111 - Fundamentals of Programming I
 * Dr. Jiayin Wang
 * November 8, 2017 
 */

// This program calculates the factorial of a number

import java.util.Scanner;

public class Factorial {
	public static void main(String [] args) {
		
		Scanner scnr = new Scanner(System.in);
		int num;
		
		// gets the user input
		System.out.println("Please enter an integer value " 
                     		+ "greater than or equal to 0: ");
		num = scnr.nextInt();
		
		// checks if the number is negative
		if (num < 0) {
			System.out.println("You cannot take the factorial " 
                        		+ "of a negative number.");
		} else {
			int fact = factorial(num);
			System.out.println("The factorial of " + num 
								+ " is " + fact);
		}
	}
	
	// method to calculate the factorial of a number
	public static int factorial (int num) {
		int fact = 1;
			 while (num > 0) {
				 fact = fact*num;
				 num = num-1;	
			 } 
		return fact;
	}
}
