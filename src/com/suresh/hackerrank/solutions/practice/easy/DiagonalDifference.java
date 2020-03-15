package com.suresh.hackerrank.solutions.practice.easy;

import java.util.ArrayList;
import java.util.List;

public class DiagonalDifference {

	/*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
    	// Write your code here
    	int result = 0;
    	
    	if (null == arr || arr.size() <= 0) {
    		return result;
    	}
    	
    	/**
    	 * Identify the cell value for left diagonal and right diagonal.
    	 * 	Iterate each Integer list till length of the list. 
    	 * 	Store first value in left diagonal array.
    	 * 	Store last value in right diagonal array.
    	 * 	Increment left pointer by 1 and decrement right pointer by 1.
    	 * Repeat this till end of input array.
    	 * Sum each values in the left & right diagonal array.
    	 * Return the difference between left and right diagonal.
    	 * 
    	 */

    	List<Integer> leftDiagonal = new ArrayList<>();
    	List<Integer> rightDiagonal = new ArrayList<>();
    	
    	int leftDiagonalCounter = 0;
    	int rightDiagonalCounter = arr.size()-1;
    	
    	for (List<Integer> row : arr) {
    		System.out.println(row);
    		leftDiagonal.add(row.get(leftDiagonalCounter));
    		rightDiagonal.add(row.get(rightDiagonalCounter));
    		
    		leftDiagonalCounter = leftDiagonalCounter + 1;
    		rightDiagonalCounter = rightDiagonalCounter - 1;
    		
    		if (leftDiagonalCounter == arr.size() || rightDiagonalCounter < 0) {
    			break;
    		}
    	}
    	
    	System.out.println("leftDiagonal-->" + leftDiagonal);
    	
    	System.out.println("rightDiagonal-->" + rightDiagonal);
    	
    	int leftDiagonalSum = 0, rightDiagonalSum = 0;
    	
    	for (int i = 0; i < leftDiagonal.size(); i++) {
    		leftDiagonalSum = leftDiagonalSum + leftDiagonal.get(i);
    		rightDiagonalSum = rightDiagonalSum + rightDiagonal.get(i);
    	}
    	
    	System.out.println("leftDiagonalSum-> " + leftDiagonalSum + " rightDiagonalSum-->" + rightDiagonalSum);
    	
    	if (leftDiagonalSum > rightDiagonalSum) {
    		result = leftDiagonalSum - rightDiagonalSum;
    	} else {
    		result = rightDiagonalSum - leftDiagonalSum;
    	}
    	
    	System.out.println("result ==> " + result);
    	
    	return result;
    }

	public static void main(String[] args) {
		
		List<List<Integer>> arr = new ArrayList<>();
		
		List<Integer> firstRow = new ArrayList<>();
		
		firstRow.add(11);
		firstRow.add(2);
		firstRow.add(4);
		
		List<Integer> secondRow = new ArrayList<>();
		
		secondRow.add(4);
		secondRow.add(5);
		secondRow.add(6);
		
		List<Integer> thirdRow = new ArrayList<>();
		
		thirdRow.add(10);
		thirdRow.add(8);
		thirdRow.add(-12);
		
		arr.add(firstRow);
		arr.add(secondRow);
		arr.add(thirdRow);
		
		diagonalDifference(arr);
	}

}
