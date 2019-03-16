/*
 * Homework 8 - CountToNum.java
 * Joao Paulo D. S. Ferreira
 * CSIT 111 - Fundamentals of Programming I
 * Dr. Jiayin Wang
 * November 16, 2017 
 */

/* 
 * 4.5.2: For loop: Print 1 to N.
 * Write a for loop that prints: 1 2 .. userNum.
 * Print a space after each number, 
 * including after the last number. 
 * */

import java.util.Scanner;

public class CountToNum {
	public static void main (String [] args) {
		int userNum = 0;
		int i = 0;

		userNum = 4;
        
		/* My Solution */
		for (i = 1; i <= userNum; ++i) {
			System.out.print(i + " ");
         
		}
  	}
}
