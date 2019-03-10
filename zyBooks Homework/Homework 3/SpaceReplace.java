/*
 * Homework 3 - SpaceReplace.java
 * Joao Paulo D. S. Ferreira
 * CSIT 111 - Fundamentals of Programming I
 * Dr. Jiayin Wang
 * October 8, 2017 
 */

/* 
 * 2.11.1: Reading and printing a string.
 * A user types a word and a number on a single line. 
 * Read them into the provided variables.
 * Then print: word_number. End with newline. 
 */

import java.util.Scanner;

public class SpaceReplace {
	public static void main (String [] args) {
		Scanner scnr = new Scanner(System.in);
		String userWord = "";
		int userNum = 0;
		
		/* My Solution */
		userWord = scnr.next();
		userNum = scnr.nextInt();
		System.out.println(userWord + '_' + userNum);
	}
}
