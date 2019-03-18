/*
 * Lab 9 - Square.java
 * Joao Paulo D. S. Ferreira
 * CSIT 111 - Fundamentals of Programming I
 * Dr. Jiayin Wang
 * November 30, 2017 
 */

/* 
 * This program defines a Square class with methods to create 
 * and read in info for a square matrix and to compute 
 * the sum of a row, a col, either diagonal, and whether it is magic.
 */

import java.util.Scanner;

public class Square{
    int[][] square;
    int x;
    int i;
    int j;
    
    // Constructor -- creates new square of given size
    public Square(int size) {
        x = size;
        int col = x, row = x;
        square = new int[row][col];
    }
    
    // returns the sum of the values in the given row
    public int sumRow(int row) {
    	int sumRow = 0;
    	for(i=0; i < x; i++ ) {
        	 sumRow = sumRow + square[row][i];
    	}
    	return sumRow;
    }
    
    // returns the sum of the values in the given column
    public int sumCol(int col) {
    	int sumCol = 0;
    	for(i=0; i < x; i++) {
    		sumCol = sumCol + square[i][col];
      	}
        return sumCol;
    }
    

    //return the sum of the values in the main diagonal
    public int sumMainDiag() {
    	int sumMD = 0;
        for(i=0; i < x; i++ ) {
        	sumMD = sumMD + square[i][i];
        }
        return sumMD;
    }
    
    //returns the sum of the values in the other ("reverse") diagonal
    public int sumOtherDiag() {
    	int sumOD = 0;
    	for(i=0; i < x; i++) {
    		for(j=0; j < x; j++) {
    			if(i+j == x-1) {
    				sumOD = sumOD + square[i][j];
    			} // end if
    		} // end middle for
    	} // end outer for
    	
    	return sumOD;
    }


    /* 
     * returns trues if the square is magic (all rows, cols, 
     * and diags have same sum), false otherwise 
     */
    public boolean magic() {
    	int w;
    	int z;
    	boolean y = true;
    	for(w=0; w < x; w++) {
    		for(z = 0; z < x; z++) {
    			if(sumCol(w) == sumRow(z) && sumOtherDiag() == sumMainDiag() 
    				&& sumRow(w) == sumMainDiag()) {
    				
    				y = true;
    			} else {
    				y = false;
    				
    			} // end if-else
    		} // end middle for
    	} // end outer for
    	
    	return y;
    }

    // reads info into the square from the input stream associated with the Scanner parameter
    public void readSquare(Scanner scan) {
        for(int row = 0; row < square.length; row++)
            for(int col = 0; col < square.length; col ++)
                square[row][col] = scan.nextInt();
    }

    // prints the contents of the square, neatly formatted
    public void printSquare() {
    	for (int row = 0; row < square.length; row++) {
            System.out.println();
            for (int col = 0; col < square.length; col ++) {
            	if (square[row][col] < 10 && square[row][col] >= 0) {
            		System.out.print(square[row][col] + "  ");
            	} else if (square[row][col] >= 10) {
            		System.out.print(square[row][col] + " ");
            		
            	} // end if-else if
            } // end middle for
        } // end outer for
    } // end printSquare()
}
