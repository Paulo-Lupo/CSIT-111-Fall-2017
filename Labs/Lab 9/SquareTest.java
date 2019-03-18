/*
 * Lab 9 - SquareTest.java
 * Joao Paulo D. S. Ferreira
 * CSIT 111 - Fundamentals of Programming I
 * Dr. Jiayin Wang
 * November 30, 2017 
 */

/* 
 * This program uses the Square class to read in square data 
 * and tell if each square is magic. 
 */

import java.util.Scanner;
import java.io.*;

public class SquareTest {
	public static void main(String[] args) throws IOException {    
		int i=0;
		int j=0;
		
		// opens the file called magicData  that cointains the test data
        Scanner scan = new Scanner(new File("magicData"));
        int count = 1; 				//counts which square we're on
        int size = scan.nextInt(); 	//size of next square
        
        // Expecting -1 at bottom of input file
        while (size != -1) {
        	
        	// creates a new Square of the given size
        	Square ss = new Square(size);
         
            // calls its read method to read the values of the square         
        	ss.readSquare(scan);
         
            System.out.println("\n******** Square " + count + " ********");

            // prints the square
            ss.printSquare();
            System.out.println("\n");

            // prints the sums of its rows
            for (i=0; i < size; i++) {
            	System.out.println("Sum of row " + (i+1) + " is: " + ss.sumRow(i));
            }
            
            // prints the sums of its columns
            System.out.println();
            for (i=0; i < size; i++) {
            	System.out.println("Sum of column " + (i+1) + " is: " + ss.sumCol(i));
            }


            // prints the sum of the main diagonal
            System.out.println("\nSum of main Diagonal is: " + ss.sumMainDiag());

            // prints the sum of the other diagonal
            System.out.println("\nSum of other Diagonal is: " + ss.sumOtherDiag());

            // determines and print whether it is a magic square or not
            boolean magic = ss.magic();
            if (magic == true) {
            	System.out.println("\n**This is a Magic Square**");
            } else {
            	System.out.println("\nThis is not a magic square");
            }

            // gets the size of next square
            size = scan.nextInt();
            count++;
        }
    }
}
