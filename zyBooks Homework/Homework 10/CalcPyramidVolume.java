/*
 * Homework 10 - CalcPyramidVolume.java
 * Joao Paulo D. S. Ferreira
 * CSIT 111 - Fundamentals of Programming I
 * Dr. Jiayin Wang
 * December 5, 2017 
 */

/* 
 * 6.3.3: Method definition: Volume of a pyramid.
 * Define a method pyramidVolume with double parameters 
 * baseLength, baseWidth, and pyramidHeight, that returns 
 * as a double the volume of a pyramid with a rectangular base. 
 */

public class CalcPyramidVolume {

	/* My Solution */
	public static double pyramidVolume(double baseLength, double baseWidth, double pyramidHeight){
		
		return baseLength*baseWidth*pyramidHeight/3;     
	}

	public static void main (String [] args) {
		System.out.println("Volume for 1.0, 1.0, 1.0 is: " + pyramidVolume(1.0, 1.0, 1.0));
	}
}
