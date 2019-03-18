/*
 * Lab 10 - TestAccounts2.java
 * Joao Paulo D. S. Ferreira
 * CSIT 111 - Fundamentals of Programming I
 * Dr. Jiayin Wang
 * December 7, 2017 
 */

// A simple program to test the closing and consolidation features of the Account class.

import java.util.Scanner;

public class TestAccounts2 {
	public static void main(String[] args) {
		String name;
		Account acct1, acct2, acct3, acct4;
		Scanner scan = new Scanner(System.in);
	
		// creates first account
		System.out.print("\nEnter name for first account: ");
		name = scan.next();
		acct1 = new Account(100, name);
		System.out.println("Created account for " + name + " with balance $100.");
	
		// creates second account
		System.out.print("\nEnter name for second account: ");
		name = scan.next();
		acct2 = new Account(100, name);
		System.out.println("Created account for " + name + " with balance $100.");
	
		// creates third account
		System.out.print("\nEnter name for third account: ");
		name = scan.next();
		acct3 = new Account(100, name);
		System.out.println("Created account for " + name + " with balance $100.");
		
		// closes first account
		System.out.println("Closing first account.");
		acct1.close();
	
		// consolidates second and third accounts
		System.out.println("Trying to consolidate second and third accounts.");
		acct4 = Account.consolidate(acct2, acct3);
		System.out.println("Result account is " + acct4);
	
		// prints the number of accounts existing
		System.out.println("Number of accounts is now " + Account.getNumAccounts());
    }
}
