/*
 * Homework 6 - AgeChecker.java
 * Joao Paulo D. S. Ferreira
 * CSIT 111 - Fundamentals of Programming I
 * Dr. Jiayin Wang
 * October 25, 2017 
 */

/* 
 * 3.4.2: Detect number range.
 * Write an expression that prints "Eligible" 
 * if userAge is between 18 and 25 inclusive.  
 */

public class AgeChecker {
	public static void main (String [] args) {
		int userAge = 0;

      	userAge = 17;
      	
      	/* My Solution */
      	if((userAge >= 18) && (userAge <=25) ){
          	System.out.println("Eligible");
      	}
      	else{
          	System.out.println("Ineligible");
      	}
	}
}
