package com.suresh.hackerrank.solutions.practice.easy;

public class Staircase {

	// Complete the staircase function below.
    static void staircase(int n) {
    	
    	if (0 >= n) {
    		return;
    	}

    	/*
    	 * Initialize space count to input.
    	 * Initialize symbol count  to 1.
    	 * Repeat until symbol counter reaches input
    	 * Print spaces till input - 1.
    	 * Print symbol till the symbol counter.
    	 * 
    	 * Print new line
    	 * 
    	 * Increment symbol count, decrement space count.
    	 */
    	
    	int spaceCounter = n;
    	int symbolCounter = 1;
    	
    	for (int i = 0 ; i < n; i++) {
    		
    		for (int j = 0; j < spaceCounter-1; j++) {
    			System.out.print(" ");
    		}
    		spaceCounter = spaceCounter - 1;
    		for (int k = 0; k < symbolCounter; k++) {
    			System.out.print("#");
    		}
    		symbolCounter = symbolCounter + 1;
    		System.out.println();
    	}
    }
	
	public static void main(String[] args) {

		staircase(2);
	}

}
