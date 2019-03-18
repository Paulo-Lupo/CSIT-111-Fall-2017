/*
 * Lab 10 - Account.java
 * Joao Paulo D. S. Ferreira
 * CSIT 111 - Fundamentals of Programming I
 * Dr. Jiayin Wang
 * December 7, 2017 
 */

// A bank account class with methods to deposit, withdraw, and check the balance.

public class Account {
	
    private double balance;
    private String name;
    private long acctNum;
    private static int numAccounts;

    // Constructor -- initializes balance and owner; generates random account number
    public Account(double initBal, String owner) {
    	balance = initBal;
        name = owner;
        acctNum = (int) (Math.random() * Integer.MAX_VALUE);
        numAccounts = numAccounts+ 1;
    }
    
    // returns the total number of accounts created so far
    public static int getNumAccounts() {
    	return numAccounts;
    }
          
    /* 
     * checks to see if balance is sufficient for withdrawal.
     * If so, decrements balance by amount; if not, prints message.
     */
    public void withdraw(double amount) {
        if (balance >= amount)
            balance -= amount;
        else
            System.out.println("Insufficient funds");
    }


    /* 
     * checks to see if balance is sufficient for withdrawal.
     * If so, decrements balance by amount; if not, prints message.
     * Also deducts fee from account. 
     */
    public void withdraw(double amount, double fee)
    {
        if (balance >= amount){
            balance -= amount;
            balance -= fee;
        }
        else {
        	System.out.println("Insufficient funds");
        }
    }

    // adds deposit amount to balance.
    public void deposit(double amount) {
        balance += amount;
    }

    // returns balance.
    public double getBalance() {
        return balance;
    }

    // returns account number 
    public double getAcctNumber() {
        return acctNum;
    }

    // returns a string containing the name, acct number, and balance.
    public String toString() {
        return "Name: " + name + "\nAcct #: " + acctNum + "\nBalance: " + balance;
    }

    // closes this account.
    public void close() {
    	name = "CLOSED";
    	balance = 0;
    	numAccounts = numAccounts -1;
    }

    /* 
     * creates a new account whose balance is the sum of 
     * the two given accounts, and close the given accounts. 
     */
    public static Account consolidate(Account acct1, Account acct2) {
    	String name = acct1.name;
    	
    	// checks if the accounts have the same name and different account number
    	if (name.equalsIgnoreCase(acct2.name) && acct1.acctNum != acct2.acctNum) {
    		Account nAcc = new Account(0, "");
    		
    		nAcc.balance = acct1.balance + acct2.balance;	
    		nAcc.name = acct1.name;
    		acct1.close();
			acct2.close();
			return nAcc;		
    	}
    	else {
        	// checks if the accounts has different names
        	if (!name.equalsIgnoreCase(acct2.name)) {
        		System.out.println("Accounts with different names cannot be consolidated");
        		
        	}
        	// checks if the accounts have the same account number
        	else if (acct1.acctNum == acct2.acctNum) {
        		System.out.println("Accounts with the same numbers cannot be consolidated");
        	} 
        	return null;
        	
    	}
    }
}
