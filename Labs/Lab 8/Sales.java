/*
 * Lab 8 - Sales.java
 * Joao Paulo D. S. Ferreira
 * CSIT 111 - Fundamentals of Programming I
 * Dr. Jiayin Wang
 * November 22, 2017 
 */

/*
 * This program reads in and stores sales for each of 5 salespeople. 
 * Displays sales entered by salesperson id
 * and total sales for all salespeople.
 */

import java.util.Scanner; 
public class Sales { 
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); 
		
		// asks the user to enter the number of salespeople
		System.out.print("Enter the number of salespeople: ");
		int SALESPEOPLE = scan.nextInt(); 
		
		int[] sales = new int[SALESPEOPLE]; 
		int sum;
		
		// gets the input from the user for each salesperson sales
		for (int i=0; i<sales.length; i++) {
			System.out.print("Enter sales for salesperson " 
                           	 + (i+1) +": ");
			sales[i] = scan.nextInt();
		}
		
		// initializes min an max values and indexes
		int min = sales[0];
		int max = sales[0];
		int maxi = 1;
		int mini = 1;
		
		// prints each salesperson sales
		System.out.println("\nSalesperson Sales");
		System.out.println(" ------------------ "); 
		sum = 0;
		
		// Computes and prints the total sales
		for (int i=0; i<sales.length; i++)
		{
			System.out.println(" " + (i+1) + " " + sales[i]);
			sum += sales[i];
			
			// Checks the max and min sales
			if (sales[i] > max) {
				max = sales[i];
				maxi = i+1;
			}
			if (sales [i] < min) {
				min = sales[i];
				mini = i+1;
			}
		}
		
		// Prints total, average, highest and lowest sales
		System.out.println("\nTotal sales: " + sum);
		
		double avrg = (double) sum /SALESPEOPLE;
		System.out.println("\nAverage sales: " + avrg);
		
		System.out.println("\nSalesperson " + maxi 
							+ " had the highest sale with $" + max + ".");
		System.out.println("\nSalesperson " + mini 
							+ " had the lowest sale with $" + min+ ".");
		
		// asks the user to enter a threshold value
		System.out.print("\nEnter a minimum value for sales: ");
		int minSale = scan.nextInt();
		int minCount = 0;
		
		System.out.println("\nSalesperson Sales who exceeded "
                     + "the mininum sales");
		System.out.println(" ------------------ "); 
		
		// checks which salesperson met the threshold and prints their data
		for (int i = 0; i < sales.length; ++i)
		{
			if (sales[i] >= minSale) {
				System.out.println(" " + (i+1) + " " + sales[i]);
				++minCount;
			}
		}
		System.out.println("\nAmount of sales people who exceeded " 
							+ "the minimum sales: " + minCount);
	}
}
