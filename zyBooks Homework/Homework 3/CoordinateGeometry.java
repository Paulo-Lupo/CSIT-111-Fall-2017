/*
 * Homework 3 - CoordinateGeometry.java
 * Joao Paulo D. S. Ferreira
 * CSIT 111 - Fundamentals of Programming I
 * Dr. Jiayin Wang
 * October 8, 2017 
 */

/* 
 * 2.7.1: Coordinate geometry.
 * Determine the distance between point (x1, y1) and point (x2, y2),
 * and assign the result to pointsDistance. 
 */

import java.lang.Math;

public class CoordinateGeometry {
	public static void main(String [] args) {
		double x1 = 1.0;
		double y1 = 2.0;
		double x2 = 1.0;
		double y2 = 5.0;
		double pointsDistance = 0.0;

		/* My solution */
		pointsDistance = Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2));

		System.out.println("Points distance: " + pointsDistance);
	}
}
