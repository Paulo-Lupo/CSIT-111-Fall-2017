/*
 * Homework 1 - Erros2.java
 * Joao Paulo D. S. Ferreira
 * CSIT 111 - Fundamentals of Programming I
 * Dr. Jiayin Wang
 * September 19, 2017 
 */

/*
 * 1.6.2: More systax erros.
 * Retype the statements, correcting the syntax errors.
 * System.out.println("Num: " + songnum);
 * System.out.println(int songNum);
 * System.out.println(songNum " songs"); 
 */

public class Erros2 {
	public static void main (String [] args) {
		int songNum;
 
		songNum = 5;
     
		/* My solution */
		System.out.println("Num: " + songNum);
		System.out.println(songNum);
		System.out.println(songNum +" songs");
	}
}
