package com.suresh.hackerrank.solutions.practice.easy;

import java.util.SortedMap;
import java.util.TreeMap;

public class BirthdayCakeCandles {

	// Complete the birthdayCakeCandles function below.
    static int birthdayCakeCandles(int[] arr) {

    	int candleCount = 0;
    	
    	if (null == arr || arr.length <= 0) {
    		return candleCount;
    	}
    	
    	SortedMap<Integer, Integer> valueCounter = new TreeMap<>();
    	
    	System.out.println("Line Break ===> ");
    	
    	for (int i = 0; i < arr.length; i++) {
    		
    		if (null == valueCounter.get(arr[i])) {
    			valueCounter.put(arr[i], 1);
    		} else {
    			valueCounter.put(arr[i], valueCounter.get(arr[i])+1);
    		}
    	}
    	
    	System.out.println(valueCounter);
    	
    	for (Integer key : valueCounter.keySet()) {
    		
    		if (valueCounter.get(key) >= candleCount) {
    			candleCount = valueCounter.get(key);
    		}
    	}
    	
    	System.out.println(candleCount);
    	
    	return candleCount;
    }
    
	public static void main(String[] args) {
		
		int[] arr = {1, 5, 3, 5, 5};
		birthdayCakeCandles(arr);
	}

}
