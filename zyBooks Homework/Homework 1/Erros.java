/*
 * Homework 1 - Erros.java
 * Joao Paulo D. S. Ferreira
 * CSIT 111 - Fundamentals of Programming I
 * Dr. Jiayin Wang
 * September 19, 2017 
 */

/*
 * 1.6.1: Basic syntax errors.
 * Type the statements. Then, correct the one 
 * syntax error in each statement.
 * System.out.printl("Predictions are hard.");
 * System.out.print("Especially ');
 * System.out.println("about the future.").
 * System.out.println("Num is: " - userNum);
 */

public class Erros {
	public static void main (String [] args) {
		int userNum = 5;
     
		/* My solution */
		System.out.println("Predictions are hard.");
		System.out.print("Especially ");
     		System.out.println("about the future.");
     		System.out.println("Num is: " + userNum);
	}
}
