/*
 * Homework 5 - CablePlan.java
 * Joao Paulo D. S. Ferreira
 * CSIT 111 - Fundamentals of Programming I
 * Dr. Jiayin Wang
 * October 19, 2017 
 */

/* 
 * 7.8.1.2: The this implicit parameter.
 * Define the missing method. 
 * Use "this" to distinguish the local member from the parameter name. 
 */


// ===== Code from file CablePlan.java =====
public class CablePlan {
	private int numDays;

	// FIXME: Define setNumDays() method, using "this" implicit parameter.
	public void setNumDays(int numDays) {

		/* MySolution */
		this.numDays = numDays;
	}

	public int getNumDays() {
		return numDays;
	}
}
// ===== end =====
