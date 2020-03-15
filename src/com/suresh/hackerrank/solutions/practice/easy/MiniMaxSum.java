package com.suresh.hackerrank.solutions.practice.easy;

import java.util.Arrays;

public class MiniMaxSum {

	// Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {

    	if (null == arr || arr.length <= 0) {
    		return;
    	}

    	Arrays.sort(arr);
    	
    	long minSum = 0, maxSum = 0;
    	
    	for (int i = 0; i < arr.length; i++) {
    		
    		if (i != arr.length - 1) {
    			minSum = minSum + arr[i];
    		}
    		if (i != 0) {
    			maxSum = maxSum + arr[i];
    		}
    	}
    	
    	System.out.println(minSum + " " + maxSum);
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 3, 5, 4, 2};
		
		miniMaxSum(arr);
	}

}
