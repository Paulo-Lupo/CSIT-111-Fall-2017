/*
 * Lab 3 - Dice.java
 * Joao Paulo D. S. Ferreira
 * CSIT 111 - Fundamentals of Programming I
 * Dr. Jiayin Wang
 * October 8, 2017 
 */

/*
 * This program simulates the roll of two dice
 * and adds the sum of their faces
 */
import java.util.Random;

public class Dice {
	public static void main(String args[]) {

		// Declaring the variables
		Random generator = new Random();
		int die1;
		int die2;
		int dieSum;
            
		// Getting random values for each die
      	die1 = generator.nextInt(6) + 1;
      	die2 = generator.nextInt(6) + 1;
      
      	// Adding both results of the dice
      	dieSum = die1 + die2;
      
      	// Printing out the results
      	System.out.println("Frist die roll: " + die1);
      	System.out.println("Second die roll: " + die2);
      	System.out.println("Sum of the rolls: " + dieSum);
	}
}
