/*
 * Homework 5 - CallPersonInfo.java
 * Joao Paulo D. S. Ferreira
 * CSIT 111 - Fundamentals of Programming I
 * Dr. Jiayin Wang
 * October 19, 2017 
 */

/* 7.2.2.1: Basic class use.
 * Print person1's kids, apply the incNumKids() method, 
 * and print again, outputting text as below. 
 * End each line with newline.
 * Sample output for below program: 
 * Kids: 3
 * New baby, kids now: 4 
 */

// ===== Code from file CallPersonInfo.java =====
public class CallPersonInfo {
	public static void main (String [] args) {
	   PersonInfo person1 = new PersonInfo();

      	person1.setNumKids(3);
      
      	/* My Solution */
      	System.out.println("Kids: " + person1.getNumKids());
      
     	person1.incNumKids();
      	System.out.println("New baby, kids now: " + person1.getNumKids());
   	}
}
// ===== end =====
