/*
 * Homework 6 - YearChecker.java
 * Joao Paulo D. S. Ferreira
 * CSIT 111 - Fundamentals of Programming I
 * Dr. Jiayin Wang
 * October 25, 2017 
 */

/* 
 * 3.3.3: Multiple branch If-else statement: Print century.
 * Write an if-else statement with multiple branches. 
 * If givenYear is 2100 or greater, print "Distant future" (without quotes). 
 * Else, if givenYear is 2000 or greater (2000-2099), print "21st century". 
 * Else, if givenYear is 1900 or greater (1900-1999), print "20th century". 
 * Else (1899 or earlier), print "Long ago". 
 * Do NOT end with newline. 
 */

public class YearChecker {
	public static void main (String [] args) {
		int givenYear = 0;

		givenYear = 1776;
      
		/* My Solution */
		if (givenYear >= 2100) {
			System.out.print("Distant future"); 
			
		} else if (givenYear >= 2000) {
			System.out.print("21st century");  
			
		} else if (givenYear >= 1900) {
			System.out.print("20th century");
			
		} else {
			System.out.print("Long ago");
		}
	}
}
