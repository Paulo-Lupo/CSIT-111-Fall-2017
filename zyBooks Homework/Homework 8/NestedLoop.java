/*
 * Homework 8 - NestedLoop.java
 * Joao Paulo D. S. Ferreira
 * CSIT 111 - Fundamentals of Programming I
 * Dr. Jiayin Wang
 * November 16, 2017 
 */

/* 
 * 4.6.1: Nested loops: Indent text.
 * Print numbers 0, 1, 2, ..., userNum as shown, 
 * with each number indented by that number of spaces. 
 * For each printed line, print the leading spaces, 
 * then the number, and then a newline.
 */

public class NestedLoop {
	public static void main (String [] args) {
		int userNum  = 0;
		int i = 0;
		int j = 0;
		
		/* My Solution */
		for (i = 0; i < userNum; ++i) {
			System.out.println(i);
			for (j = 0; j <= i; ++j) {
				System.out.print(" ");
			}
		}
		System.out.println(userNum);
	}
}
