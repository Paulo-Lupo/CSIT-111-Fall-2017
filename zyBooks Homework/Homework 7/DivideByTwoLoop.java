/*
 * Homework 7 - DivideByTwoLoop.java
 * Joao Paulo D. S. Ferreira
 * CSIT 111 - Fundamentals of Programming I
 * Dr. Jiayin Wang
 * November 8, 2017 
 */

/* 
 * 4.2.3: Basic while loop expression.
 * Write a while loop that prints userNum 
 * divided by 2 (integer division) until reaching 1. 
 * Follow each number by a space.
 */

public class DivideByTwoLoop {
	public static void main (String [] args) {
		int userNum = 0;

		userNum = 40;
		
      	/* My Solution */
		while (userNum >= 2) {
			userNum = userNum/2;
			System.out.print(userNum + " ");
		}
	}
}
