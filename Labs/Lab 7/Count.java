/*
 * Lab 7 - Count.java
 * Joao Paulo D. S. Ferreira
 * CSIT 111 - Fundamentals of Programming I
 * Dr. Jiayin Wang
 * November 15, 2017 
 */

/*
 * This program reads in strings (phrases) and counts the
 * number of blank characters and certain other letters in the phrase.
 */

import java.util.Scanner;

public class Count {
	public static void main (String[] args) {
		String phrase; 		// a string of characters
		int countBlank;	 	// the number of blanks (spaces) in the phrase
		int length; 		// the length of the phrase
		char ch; 			// an individual character in the string
		
		Scanner scan = new Scanner(System.in);
		
		// prints a program header
		System.out.println();
		System.out.println("Character Counter");
		System.out.println();
		
		phrase = "";
		
		// continues asking for the user's input until they type quit.
		while (!phrase.equalsIgnoreCase("quit")) {
		
			// reads in a string and find its length
			System.out.print ("Enter a sentence or phrase, or quit to quit: ");
			phrase = scan.nextLine();
			length = phrase.length();
		
			// initializes counts		
			countBlank = 0;
			int countA = 0;
			int countE = 0;
			int countS = 0;
			int countT = 0;
			int i = 0;
		
			/* 
			 * for loop to goes through the string character by character 
			 * and counts the number of certain characters and blank spaces 
			 */
			for (i = 0; i < length; ++i) {
				ch = phrase.charAt(i);
				
				switch (ch) {
				case ' ':
					++countBlank;
					break;
				case 'a':
				case 'A':
					++countA;
					break;
				case 'e':
				case 'E':
					++countE;
					break;
				case 's':
				case 'S':
					++countS;
					break;
				case 't':
				case 'T':
					++countT;
					break;
				} // end switch
			} // end for
		
		// prints the results
		System.out.println();
		System.out.println("Number of blank spaces: " + countBlank);
		System.out.println("Number of a's: " + countA);
		System.out.println("Number of e's: " + countE);
		System.out.println("Number of s's: " + countS);
		System.out.println("Number of t's: " + countT);
		} // end while
	} // end main
}
