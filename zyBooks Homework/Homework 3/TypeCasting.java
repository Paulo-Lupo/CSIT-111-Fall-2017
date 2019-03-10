/*
 * Homework 3 - TypeCasting .java
 * Joao Paulo D. S. Ferreira
 * CSIT 111 - Fundamentals of Programming I
 * Dr. Jiayin Wang
 * October 8, 2017 
 */

/* 
 * 2.8.1: Type casting: Computing average kids per family.
 * Compute the average kids per family. 
 * Note that the integers should be type cast to doubles. 
 */

public class TypeCasting {
	public static void main (String [] args) {
		int numKidsA = 1;
		int numKidsB = 4;
		int numKidsC = 5;
		int numFamilies = 3;
		double avgKids = 0.0;
		
		/* My Solution */
		avgKids = (double) (numKidsA + numKidsB + numKidsC) / numFamilies;

		System.out.print("Average kids per family: ");
		System.out.println(avgKids);
	}
}
