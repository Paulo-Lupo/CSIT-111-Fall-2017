/*
 * Homework 4 - ShippingCalculator.java
 * Joao Paulo D. S. Ferreira
 * CSIT 111 - Fundamentals of Programming I
 * Dr. Jiayin Wang
 * October 12, 2017 
 */

/* 
 * 2.6.1: Using constants in expressions
 * Compute the cost to ship a package based on its weight. 
 */

public class ShippingCalculator {
  	public static void main (String [] args) {
  		int shipWeightPounds = 10;
  		int shipCostCents = 0;
  		final int FLAT_FEE_CENTS = 75;
		final int CENTS_PER_POUND = 25;

  		/* My Solution */
  		shipCostCents = FLAT_FEE_CENTS + shipWeightPounds * CENTS_PER_POUND;

  		System.out.println("Weight(lb): " + shipWeightPounds);
  		System.out.println("Flat fee(cents): " + FLAT_FEE_CENTS);
  		System.out.println("Cents per pound: " + CENTS_PER_POUND);
  		System.out.println("Shipping cost(cents): " + shipCostCents);
  	}
}
