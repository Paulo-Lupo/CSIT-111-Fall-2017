/*
 * Homework 7 - StarPrinter.java
 * Joao Paulo D. S. Ferreira
 * CSIT 111 - Fundamentals of Programming I
 * Dr. Jiayin Wang
 * November 8, 2017 
 */

/* 
 * 4.4.2: Printing output using a counter.
 * Re-type the following and run, note incorrect behavior.
 * Then fix errors in the code, which should print numStars asterisks.
 * while (numPrinted != numStars) {
 * 		System.out.print("*"); }   
 */

public class StarPrinter {
	public static void main (String [] args) {
		int numStars = 0;
		int numPrinted = 0;

		numStars = 12;
		numPrinted = 1;

		/* My Solution */
		while (numPrinted <= numStars) {
			System.out.print("*");
			++numPrinted;
		}
	}
}
