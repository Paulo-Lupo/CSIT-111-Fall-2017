/*
 * Lab 3 - Distance.java
 * Joao Paulo D. S. Ferreira
 * CSIT 111 - Fundamentals of Programming I
 * Dr. Jiayin Wang
 * October 8, 2017 
 */

/* computes the distance between two points */

import java.util.Scanner;

public class Distance {
	public static void main (String[] args) {
		double x1, y1, x2, y2; 	// coordinates of two points
		double distance; 		// distance between the points
		Scanner scan = new Scanner(System.in);
		
		/* reads in the two points */
		System.out.print ("Enter the coordinates of the first point " 
						  + "(put a space between them): ");
		x1 = scan.nextDouble();
		y1 = scan.nextDouble();
		
		System.out.print("Enter the coordinates of the second point: ");
		x2 = scan.nextDouble();
		y2 = scan.nextDouble();
      
		/* computes the distance */
		System.out.print("The distance between the points is: ");
		distance = Math.sqrt(Math.pow(x1-x2, 2)+ Math.pow(y1-y2, 2));
      
		/* prints out the answer */
		System.out.println(distance);
	}
}
