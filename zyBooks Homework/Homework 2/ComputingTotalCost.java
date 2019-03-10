/*
 * Homework 2 - ComputingTotalCost.java
 * Joao Paulo D. S. Ferreira
 * CSIT 111 - Fundamentals of Programming I
 * Dr. Jiayin Wang
 * September 23, 2017 
 */

/* 
 * 2.4.3: Total cost.
 * A drink costs 2 dollars. A taco costs 3 dollars. 
 * Given the number of each, compute total cost 
 * and assign totalCost with the result. 
 */

public class ComputingTotalCost {
	public static void main (String [] args) {
		int numDrinks;
     		int numTacos;
     		int totalCost;

     		numDrinks = 4;
     		numTacos  = 6;
      
     		/* My solution */
     		totalCost = numDrinks*2 + numTacos*3;

     		System.out.println("Total cost: " + totalCost);
   	}
}
