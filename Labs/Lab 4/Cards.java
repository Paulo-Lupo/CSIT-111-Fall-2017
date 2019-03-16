/*
 * Lab 4 - Cards.java
 * Joao Paulo D. S. Ferreira
 * CSIT 111 - Fundamentals of Programming I
 * Dr. Jiayin Wang
 * October 11, 2017 
 */

// This program is a simple game of cards that uses enumeration.

public class Cards {

	// Defines an enumerated type at the class level
	enum Rank {ace, two, three, four, five, six, seven, eight, nine, ten, jack, queen, king};
   
	public static void main(String args[]) {
      
		// Declares the variables of type Rank and assigning values to them 
		Rank highCard, faceCard, card1, card2;
		highCard = Rank.ace;
		faceCard = Rank.king;
		card1 = Rank.three;
		card2 = Rank.seven;
      
		// Prints a statement using the previous variables 
		System.out.println("A black jack hand: " + highCard + " and " + faceCard);
      
		// Declares variables and assigning the face value of the cards to them
		int card1Val, card2Val;
		card1Val = card1.ordinal()+1;
		card2Val = card2.ordinal()+1;
      
		// Prints out the cards and their sum 
		System.out.println("A two card hand: " + card1 + " and " + card2);
		System.out.println("Hand value: " + (card1Val + card2Val));
	}
}
