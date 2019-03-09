/*
 * Homework 2 - ComputingChange.java
 * Joao Paulo D. S. Ferreira
 * CSIT 111 - Fundamentals of Programming I
 * Dr. Jiayin Wang
 * September 23, 2017 
 */

/* 
 * 2.4.3: Compute change.
 * A cashier distributes change using 
 * the maximum number of five dollar bills, 
 * followed by one dollar bills. 
 * For example, 19 yields 3 fives and 4 ones. 
 * Write a single statement that assigns 
 * the number of one dollar bills to variable numOnes,
 * given amountToChange. 
 */

public class ComputingChange {
	public static void main (String [] args) {
		int amountToChange = 0;
		int numFives = 0;
		int numOnes  = 0;

		amountToChange = 19;
		numFives = amountToChange / 5;

		/* My solution */
		numOnes = amountToChange % 5;

		System.out.println("Number of fives: " + numFives);
		System.out.println("Number of Ones: " + numOnes);
	}
}
