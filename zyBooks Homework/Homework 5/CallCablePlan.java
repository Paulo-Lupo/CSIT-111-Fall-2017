/*
 * Homework 5 - CallCablePlan.java
 * Joao Paulo D. S. Ferreira
 * CSIT 111 - Fundamentals of Programming I
 * Dr. Jiayin Wang
 * October 19, 2017 
 */

/* 
 * 7.8.1.1: The this implicit parameter.
 * Define the missing method. 
 * Use "this" to distinguish the local member from the parameter name. 
 */

// ===== Code from file CallCablePlan.java =====
public class CallCablePlan {
	public static void main (String [] args) {
		CablePlan house1Plan = new CablePlan();
	   
		/* My Solution */
		house1Plan.setNumDays(30);
      	System.out.println(house1Plan.getNumDays());
   	}
}
// ===== end =====

