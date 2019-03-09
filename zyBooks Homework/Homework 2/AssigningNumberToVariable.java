/*
 * Homework 2 - AssigningNumberToVariable.java
 * Joao Paulo D. S. Ferreira
 * CSIT 111 - Fundamentals of Programming I
 * Dr. Jiayin Wang
 * September 23, 2017 
 */

/* 
 * 2.2.4: Adding number to a variable
 * Write a statement that increases numPeople by 5. 
 */

public class AssigningNumberToVariable {
	public static void main (String [] args) {
		int numPeople = 0;

		numPeople = 10;
      
		/* My solution */
		numPeople = numPeople + 5;

		System.out.println("There are " + numPeople + " people.");
	}
}
