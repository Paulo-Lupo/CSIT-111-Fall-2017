/*
 * Homework 4 - SphereVolumeCalculator.java
 * Joao Paulo D. S. Ferreira
 * CSIT 111 - Fundamentals of Programming I
 * Dr. Jiayin Wang
 * October 12, 2017 
 */

/* 
 * 2.5.1: Sphere Volume
 * Compute the volume of a sphere and assign to sphereVolume. 
 */

public class SphereVolumeCalculator {
	public static void main (String [] args) {
		double piVal = 3.14159;
     	double sphereVolume = 0.0;
     	double sphereRadius = 0.0;

     	sphereRadius = 1.0;
      
     	/* My Solution */
     	sphereVolume = (4.0 / 3.0) * piVal * Math.pow(sphereRadius, 3);

     	System.out.println("Sphere volume: " + sphereVolume);
	}
}
