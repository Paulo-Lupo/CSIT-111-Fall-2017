/*
 * Final Project - Histogram.java
 * Joao Paulo D. S. Ferreira
 * CSIT 111 - Fundamentals of Programming I
 * Dr. Jiayin Wang
 * December 15, 2017 
 */

// prints a histogram of frequencies

public class Histogram {
    private int [] values;
    private int minIndex;
    private int maxIndex;
    private int maxLength;


    /* 
     * constructor for histogram drawing class
     * values: the array of integer values to draw
     * minIndex: the lowest index in the array for the range to draw
     * maxIndex: the highest index in the array for the range to draw
     * maxLength: the length of line to draw for the largest value
     */
    public Histogram (int[] values, int minIndex, int maxIndex, int maxLength) {
    	
        // initializes the values of the instance variables from the constructor parameters
        this.values = new int [maxIndex + 1];  // allocates memory for a copy of the values array
        this.minIndex = minIndex;
        this.maxIndex = maxIndex;
        this.maxLength = maxLength;

        // step 6: finds the largest number in values array for scaling length of bars
        int maxValue = 0;
        for (int i = this.minIndex; i <= this.maxIndex; i++) {
        	if (values[i] > maxValue) {
        		maxValue = values[i];
        	}
        }
        
        /* 
         * step 7: copies data from values array to this.values array 
         * while scaling to maximum length of bars 
         */
        for (int i = this.minIndex; i <= this.maxIndex; i++) {        	
        	this.values[i]= values[i]*this.maxLength/maxValue;
        }
    }
    
    // method to draw the horizontal bars of the histogram
    public void drawHor (){
        // step 8: draws horizontal bar graph (one line per roll value)
    	for (int i = minIndex; i <= maxIndex; i++) {
    		System.out.print("Value " + i + ":\t");
    		for (int j = 1; j <= this.values[i]; j++) {
    			System.out.print("*");
    		}
    		System.out.println(" " + this.values[i]);
    	}
    }
}
