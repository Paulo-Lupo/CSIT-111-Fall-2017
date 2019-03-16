/*
 * Homework 6 - DetectSenior.java
 * Joao Paulo D. S. Ferreira
 * CSIT 111 - Fundamentals of Programming I
 * Dr. Jiayin Wang
 * October 25, 2017 
 */

/* 
 * 3.2.4: If-else statement: Print senior citizen.
 * Write an if-else statement that checks patronAge.
 * If 55 or greater, print "Senior citizen", 
 * otherwise print "Not senior citizen" (without quotes). 
 * End with newline.  
 */

public class DetectSenior {
	public static void main (String [] args) {
		int patronAge = 0;

		patronAge = 55;
      
		/* My Solution */
		if (patronAge >= 55) {
			System.out.println("Senior citizen");
		} else {
			System.out.println("Not senior citizen");
		}
   }
}
