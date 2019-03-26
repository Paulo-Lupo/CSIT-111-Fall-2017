/*
 * Lab 2 - Circle.java
 * Joao Paulo D. S. Ferreira
 * CSIT 111 - Fundamentals of Programming I
 * Dr. Jiayin Wang
 * September 29, 2017 
 */


/* 
 * This program calculates the circumference of circles with
 * different radii. It also evaluates how the area and
 * circumference change as the radius changes.
 * The radius must be an integer in this problem.
 */
import java.util.Scanner;

public class Circle {
	public static void main(String[] args) {
		Scanner rad = new Scanner(System.in);
		final double PI = 3.14159;
		System.out.print("Please enter a value for the first radius: ");
		int radius = rad.nextInt();
		double area1 = PI * radius * radius;
    
		/* 
		 * declaring the variable circumference 
		 * to store the value of the Circumference 
		 */
		double circumference1 = 2 * PI * radius;
      
		System.out.println("The area of a circle with radius " + radius 
							+ " is " + area1);

		/* print statement for the circumference */
		System.out.println("The circumference of a circle with radius " 
							+ radius + " is " + circumference1);
     
		radius *= 2;
		double area2 = PI * radius * radius;
		double circumference2 = 2 * PI * radius;
		System.out.println("The area of a circle with radius " + radius 
							+ " is " + area2);
    

		/* print statement for the circumference */
		System.out.println("The circumference of a circle with radius " 
							+ radius + " is " + circumference2);
    
		/* 
		 * declaring the ratio between both area values 
		 * and both  circumference values. 
		 */
		double areaRatio = area2/area1;
		double circumferenceRatio = circumference2/circumference1;
		System.out.println("\nThe change in area when the " 
							+ "radius doubles is " + areaRatio
							+" times the initial area.");
		System.out.println("The change in circumference when the " 
							+ "radius doubles is " + circumferenceRatio 
							+ " times the initial circumference.");
	}
}

