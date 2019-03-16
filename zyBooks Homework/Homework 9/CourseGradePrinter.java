/*
 * Homework 9 - CourseGradePrinter.java
 * Joao Paulo D. S. Ferreira
 * CSIT 111 - Fundamentals of Programming I
 * Dr. Jiayin Wang
 * November 30, 2017 
 */

/* 
 * 5.2.3: Printing array elements with a for loop.
 * Write a for loop to print all elements in courseGrades, 
 * following each element with a space (including the last). 
 * Print forwards, then backwards. End each loop with a newline. 
 */

import java.util.Scanner;

public class CourseGradePrinter {
	public static void main (String [] args) {
		final int NUM_VALS = 4;
		int[] courseGrades = new int[NUM_VALS];
		int i = 0;

		courseGrades[0] = 7;
		courseGrades[1] = 9;
		courseGrades[2] = 11;
		courseGrades[3] = 10;

		/* My Solution */
      
		for (i = 0; i < NUM_VALS; i++) {
			System.out.print(courseGrades[i] + " ");
		}
      	System.out.println();
         
      	for (i = NUM_VALS - 1; i >= 0; --i) {
      		System.out.print(courseGrades[i] + " ");
      	}
	}
}
