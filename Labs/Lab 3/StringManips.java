/*
 * Lab 3 - StringManips.java
 * Joao Paulo D. S. Ferreira
 * CSIT 111 - Fundamentals of Programming I
 * Dr. Jiayin Wang
 * October 8, 2017 
 */

// This program tests several methods for manipulating String objects

import java.util.Scanner;

public class StringManips {
	public static void main (String[] args) {

		String phrase = new String ("This is a String test.");
   
		int phraseLength; 		// number of characters in the phrase String
		int middleIndex; 		// index of the middle character in the String
		String firstHalf; 		// first half of the phrase String
		String secondHalf; 		// second half of the phrase String
		String switchedPhrase; 	//new phrase with original halves switched
      
		// declares three new variables: middle3, city and state of type String
		String middle3;
		String city;  
		String state;
      
		// creates a new Scanner object
		Scanner strng = new Scanner(System.in);
      
		// computes the length and middle index of the phrase
		phraseLength = phrase.length();
		middleIndex = phraseLength / 2;
   
		// gets the substring for each half of the phrase
		firstHalf = phrase.substring(0,middleIndex);
      	secondHalf = phrase.substring(middleIndex, phraseLength);
      
      	// gets the middle 3 characters
      	middle3 = phrase.substring(middleIndex - 1, middleIndex + 2);
      	System.out.println("The middle three indexes are: " + middle3);
      
      	// concatenates the firstHalf at the end of the secondHalf
      	switchedPhrase = secondHalf.concat(firstHalf);
      
      	// replaces all blank characters in switchedPhrase with asterisks
      	switchedPhrase = switchedPhrase.replace(' '  , '*');
   
      	// prints the information about the phrase
      	System.out.println();
      	System.out.println ("Original phrase: " + phrase);
      	System.out.println ("Length of the phrase: " + phraseLength 
      						+ " characters");
      	System.out.println ("Index of the middle: " + middleIndex);
      	System.out.println ("Character at the middle index: " 
      						+ phrase.charAt(middleIndex));
      	System.out.println ("Switched phrase: " + switchedPhrase);
      	System.out.println();
      
      	// prompts for and read in the home town, city and state
      	System.out.print("Enter your hometown City: ");
      	city = strng.nextLine();
      	System.out.print("Enter your hometwon State: ");
      	state = strng.nextLine();
      
      	// converts the city name to lower case letters
      	state = state.toUpperCase();
      
      	// converts the state name to upper case letters
      	city = city.toLowerCase();
      
      	/* 
      	 * prints state name followed by the city name 
      	 * followed again by the state name 
      	 */
      	System.out.println(state+city+state);
	}
}
