/*
 * Homework 5 - PersonInfo.java
 * Joao Paulo D. S. Ferreira
 * CSIT 111 - Fundamentals of Programming I
 * Dr. Jiayin Wang
 * October 19, 2017 
 */

/* 
 * 7.2.2.2: Basic class use.
 * Print person1's kids, apply the incNumKids() method, 
 * and print again, outputting text as below.
 * End each line with newline.
 * Sample output for below program:
 * Kids: 3
 * New baby, kids now: 4 
 */

// ===== Code from file PersonInfo.java =====
public class PersonInfo {
   private int numKids;

   public void setNumKids(int personsKids) {
      numKids = personsKids;
      return;
   }

   public void incNumKids() {
      numKids = numKids + 1;
      return;
   }

   public int getNumKids() {
      return numKids;
   }
}
// ===== end =====

