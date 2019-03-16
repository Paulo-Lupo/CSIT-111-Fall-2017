/*
 * Homework 8 - CountdownRocket.java
 * Joao Paulo D. S. Ferreira
 * CSIT 111 - Fundamentals of Programming I
 * Dr. Jiayin Wang
 * November 16, 2017 
 */

/* 
 * 4.5.3: For loop: Print N to 0.
 * Write code that prints: userNum ... 2 1 Blastoff! 
 * Your code should contain a for loop. 
 * Print a newline after each number and after Blastoff!.
 */

public class CountdownRocket {
	public static void main (String [] args) {
		int userNum = 0;
		int i = 0;

		userNum = 3;
		
		/* My Solution */
		for (i = userNum; i > 0; --i) {
			System.out.println(i);   
		}
      
		System.out.println("Blastoff!");
	}
}
