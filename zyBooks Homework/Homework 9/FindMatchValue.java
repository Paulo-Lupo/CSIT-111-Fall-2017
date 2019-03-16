/*
 * Homework 9 - FindMatchValue.java
 * Joao Paulo D. S. Ferreira
 * CSIT 111 - Fundamentals of Programming I
 * Dr. Jiayin Wang
 * November 30, 2017 
 */

/* 
 * 5.4.2: Finding values in an array.
 * Set numMatches to the number of elements in 
 * userValues (having NUM_VALS elements) that equal matchValue. 
 */


public class FindMatchValue {
	public static void main (String [] args) {
		final int NUM_VALS = 4;
		int[] userValues = new int[NUM_VALS];
		int i = 0;
		int matchValue = 0;
		int numMatches = -99; // Assign numMatches with 0 before your for loop

		userValues[0] = 2;
		userValues[1] = 2;
		userValues[2] = 1;
		userValues[3] = 2;

		matchValue = 2;

		/* My Solution */
		numMatches = 0;
		for (i = 0; i < NUM_VALS; i++) {
			if (userValues[i] == matchValue) {
				numMatches++;
			}
     	}
		
		System.out.println("matchValue: " + matchValue + ", numMatches: " +     numMatches);
	}
}
