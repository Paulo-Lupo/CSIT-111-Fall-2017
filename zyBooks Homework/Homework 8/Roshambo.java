/*
 * Homework 8 - Roshambo.java
 * Joao Paulo D. S. Ferreira
 * CSIT 111 - Fundamentals of Programming I
 * Dr. Jiayin Wang
 * November 16, 2017 
 */

/* 
 * 3.5.1: Rock-paper-scissors.
 * Write a switch statement that checks nextChoice.
 * If 0, print "Rock". If 1, print "Paper". If 2, print "Scissors".
 * For any other value, print "Unknown". End with newline.
 */

public class Roshambo {
	public static void main (String [] args) {
		int nextChoice = 0;

		nextChoice = 2;
      
      /* My Solution */
		switch (nextChoice) {
         	case 0:
         		System.out.println("Rock");
         		break;
      
         	case 1:
         		System.out.println("Paper");
         		break;
            
         	case 2:
         		System.out.println("Scissors");
         		break;
            
         	default:
         		System.out.println("Unknown");
         		break;
		}
	}
}
