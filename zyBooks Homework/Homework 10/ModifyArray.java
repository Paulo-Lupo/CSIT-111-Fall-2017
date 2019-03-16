/*
 * Homework 10 - ModifyArray.java
 * Joao Paulo D. S. Ferreira
 * CSIT 111 - Fundamentals of Programming I
 * Dr. Jiayin Wang
 * December 5, 2017 
 */

/* 
 * 6.9.1: Modify an array parameter.
 * Write a method swapArrayEnds() that swaps 
 * the first and last elements of its array parameter.
 */

public class ModifyArray {
	
	/* My Solution */
	public static void swapArrayEnds(int[] arr, int arrSize) {
		int tempStore = 0;
      
		tempStore = arr[0];
		arr[0] = arr[arrSize-1];
		arr[arrSize-1] = tempStore;
 	}

	public static void main (String [] args) {
		int numElem = 4;
		int[] sortArray = new int[numElem];
		int i = 0;

		sortArray[0] = 10;
		sortArray[1] = 20;
		sortArray[2] = 30;
		sortArray[3] = 40;

		swapArrayEnds(sortArray, numElem);

		for (i = 0; i < numElem; ++i) {
			System.out.print(sortArray[i]);
			System.out.print(" ");
		}
	}
}
