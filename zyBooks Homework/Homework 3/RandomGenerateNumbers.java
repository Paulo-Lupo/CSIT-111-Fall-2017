/*
 * Homework 3 - RandomGenerateNumbers.java
 * Joao Paulo D. S. Ferreira
 * CSIT 111 - Fundamentals of Programming I
 * Dr. Jiayin Wang
 * October 8, 2017 
 */

/* 
 * 2.14.3: Fixed range of random numbers.
 * Type two statements that use nextInt() 
 * to print 2 random integers 
 * between (and including) 100 and 149. 
 * End with a newline. 
 */

import java.util.Random;

public class RandomGenerateNumbers {
	public static void main (String [] args) {
		Random randGen = new Random();
		int seedVal;

		seedVal = 4;
		randGen.setSeed(seedVal);

		/* My solution */
		System.out.println(randGen.nextInt(50)+100);
		System.out.println(randGen.nextInt(50)+100);
	}
}
