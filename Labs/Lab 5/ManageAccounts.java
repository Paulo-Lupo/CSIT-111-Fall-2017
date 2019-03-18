/*
 * Lab 5 - ManageAccounts.java
 * Joao Paulo D. S. Ferreira
 * CSIT 111 - Fundamentals of Programming I
 * Dr. Jiayin Wang
 * November 1, 2017 
 */

/* 
 * This program uses the Account class to create and 
 * manage Sally and Joe's bank accounts.
 */

public class ManageAccounts {
	public static void main(String[] args) {
		Account acct1, acct2;
		//creates account1 for Sally with $1000
		acct1 = new Account(1000, "Sally", 1111);
	
		//creates account2 for Joe with $500
		acct2 = new Account(500, "Joe", 2222);
	
		//deposits $100 to Joe's account
		acct2.deposit(100);
	
		//prints Joe's new balance (use getBalance())
		System.out.println("Joe's balance after deposit: " 
							+ acct2.getBalance());
	
		//withdraws $50 from Sally's account
		acct1.withdraw(50);
	
		//prints Sally's new balance (use getBalance())
		System.out.println("Sallys's balance: after withdraw " 
							+ acct1.getBalance());
	
		//charges fees to both accounts and print their balances
		System.out.println("Sally's balance after fees: " 
							+ acct1.chargeFee());
		System.out.println("Joe's balance after fees: " 
							+ acct2.chargeFee());
	
		//changes the name on Joe's account to Joseph
		acct2.changeName("Joseph");
	
		//prints the account summary for both accounts
		System.out.println(acct1);
		System.out.println(acct2);
	}
}
