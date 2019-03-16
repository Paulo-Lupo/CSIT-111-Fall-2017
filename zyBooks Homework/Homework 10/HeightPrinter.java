/*
 * Homework 10 - HeightPrinter.java
 * Joao Paulo D. S. Ferreira
 * CSIT 111 - Fundamentals of Programming I
 * Dr. Jiayin Wang
 * December 5, 2017 
 */

/* 
 * 6.2.3: Method call with parameter: 
 * Printing formatted measurement.
 * Define a method printFeetInchShort, 
 * with int parameters numFeet and numInches, 
 * that prints using ' and " shorthand. 
 */

public class HeightPrinter {
	
	/* My Solution */
	public static void printFeetInchShort(int numFeet, int numInches) {
		
		System.out.print(numFeet + "' " + numInches + "\"");      
	}
 
	public static void main (String [] args) {
		
		printFeetInchShort(5, 8);
	}
}
