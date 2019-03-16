/*
 * Homework 7 - AutoBidder.java
 * Joao Paulo D. S. Ferreira
 * CSIT 111 - Fundamentals of Programming I
 * Dr. Jiayin Wang
 * November 8, 2017 
 */

/* 
 * 4.3.1: Bidding Example.
 * Write an expression that continues 
 * to bid until the user enters 'n'. 
 */
   
import java.util.Random;
import java.util.Scanner;

public class AutoBidder {
	public static void main (String [] args) {
		Scanner scnr = new Scanner(System.in);
		Random randGen = new Random();
		char keepGoing = '-';
		int nextBid = 0;

		randGen.setSeed(5);
		
		/* My Solution */
		while (keepGoing != 'n') {
			nextBid = nextBid + (randGen.nextInt(10) + 1);
			System.out.println("I'll bid $" + nextBid + "!");
			System.out.print("Continue bidding? (y/n) ");
			keepGoing = scnr.next().charAt(0);
		}
	}
}
