/*
 * Final Project - Craps.java
 * Joao Paulo D. S. Ferreira
 * CSIT 111 - Fundamentals of Programming I
 * Dr. Jiayin Wang
 * December 15, 2017 
 */

/* 
 * This program: Rolls two dies for N times (N is given by the users).
 * Generates an array of values for the sum of two dice rolls.
 * Calculates the probabilities of win, lose and roll again.
 * Call the Histogram class to print a histogram of the frequencies of each value 
 */

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;


public class Craps {

    private static final int MIN_ROLL = 2;      //minimum value of a roll
    private static final int MAX_ROLL = 12;     //maximum value of a roll
    private static final int MAX_LENGTH = 36;   //maximum length of bars
    private static int i = 0;

    /*
     * main method:
     * asks the user how many dice rolls to make during this run,
     * counts occurances for each value of the throw of the dice
     * and draws a horizontal histogram of the counts
     */
    public static void main (String[] args) {
    	
        /* 
         * step 1: declares an int array named "counts" to count dice roll occurrences,
         * ignores the 0th and 1th array elements (those values can't occur) 
         */
        int[] counts = new int [MAX_ROLL + 1];
        
        //step 2: initialize all of the values in the array to 0
        for (i=MIN_ROLL; i<= MAX_ROLL; i++) {
        	counts[i] = 0;
        }

        // instantiates two dice: myDie1 and myDie2
        Die myDie1 = new Die();
        Die myDie2 = new Die();

        // asks the user for the number of rolls to make during this run
        Scanner scan = new Scanner(System.in);
        System.out.print("How many dice rolls do you want? ");
        int total = scan.nextInt();
        
        // step 3: rolls the two dice and count the total of the two rolls N times
        for (i = 0; i < total; i++) {
        	myDie1.roll();
        	myDie2.roll();
        	int sum = myDie1.getFaceValue() + myDie2.getFaceValue();
        	counts[sum] = counts[sum] + 1;
        }
        
        //step 4: prints out the estimated probabilities of win, lose, and roll again           
        float winChance = (float) (counts[7] + counts[11])/total;
        float loseChance = (float) (counts[2]+counts[3]+counts[12])/total;
        float rollAgainChance = (float) (counts[4]+counts[5]+counts[6]+counts[8]+counts[9]+counts[10])/total;
        DecimalFormat decimal = new DecimalFormat("#.###");
        
        System.out.println("\nEstimate probabilities for outcome of the first roll: ");
        System.out.println("Win:\t\t\t" + decimal.format(winChance));
        System.out.println("Lose:\t\t\t" + decimal.format(loseChance));
        System.out.println("Roll again:\t" + decimal.format(rollAgainChance) + "\n\n");

        
        /* 
         * step 5: instantiate an object of the Histogram class and
         * calls its two draw methods to draw the two histograms
         * with the array to be drawn, the indices of valid data,
         * and the maximum length of the bars in the histogram 
         */
        Histogram hist = new Histogram(counts, MIN_ROLL, MAX_ROLL, MAX_LENGTH);
        hist.drawHor();
    }
}
