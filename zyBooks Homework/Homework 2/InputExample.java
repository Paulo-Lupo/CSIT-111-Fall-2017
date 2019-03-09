/*
 * Homework 2 - InputExample.java
 * Joao Paulo D. S. Ferreira
 * CSIT 111 - Fundamentals of Programming I
 * Dr. Jiayin Wang
 * September 23, 2017 
 */

/* 
 * 1.4.2: Read multiple user inputs.
 * Write two statements to get input values into birthMonth and birthYear.
 * Then write a statement to output the month, a slash, and the year. 
 * End with newline. 
 */

import java.util.Scanner;

public class InputExample {
	public static void main(String [] args) {
		Scanner scnr = new Scanner(System.in);
		int birthMonth;
		int birthYear;
		
		/* My Solution */
		birthMonth = scnr.nextInt();
		birthYear = scnr.nextInt();
		System.out.println(birthMonth + "/" + birthYear);
	}
}
