/*
 * Homework 2 - AssigningSum.java
 * Joao Paulo D. S. Ferreira
 * CSIT 111 - Fundamentals of Programming I
 * Dr. Jiayin Wang
 * September 23, 2017 
 */

/* 
 * 2.2.3: Assigning a sum.
 * Write a statement that assigns 
 * numCoins with numNickels + numDimes. 
 */

public class AssigningSum {
	public static void main (String [] args) {
		int numCoins;
		int numNickels;
		int numDimes;
      
		numNickels = 5;
		numDimes = 6;
      
		/* My solution */
		numCoins = numNickels+numDimes;

		System.out.println("There are " + numCoins + " coins.");
	}
}
