/*
 * Homework 4 - GravityCalculation.java
 * Joao Paulo D. S. Ferreira
 * CSIT 111 - Fundamentals of Programming I
 * Dr. Jiayin Wang
 * October 12, 2017 
 */

/* 
 * 2.5.2: Acceleration of Gravity
 * Compute the acceleration of gravity 
 * for a given distance from the earth's center 
 */

public class GravityCalculation {
	public static void main (String [] args) {
		double G            = 6.673e-11;
		double M            = 5.98e24;
		double accelGravity = 0.0;
		double distCenter   = 0.0;

		distCenter = 6.38e6;
      
		/* My Solution */
		accelGravity = G * M / Math.pow(distCenter, 2);

		System.out.println("Acceleration of gravity: " + accelGravity);
	}
}
