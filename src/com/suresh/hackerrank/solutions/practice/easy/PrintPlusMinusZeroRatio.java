package com.suresh.hackerrank.solutions.practice.easy;

public class PrintPlusMinusZeroRatio {

	
	public static void main(String[] args) {
	
		int[] input = {6, 7, 1, 1, 2, 1};
		
		plusMinus(input);

	}
	
	// Complete the plusMinus function below.
    static void plusMinus(int[] arr) {

        if ( null == arr || arr.length <= 0) {
            return ;
        }

        float[] ratio = { 0.0f, 0.0f, 0.0f };
        
        int countOfInputArray = arr.length;
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        for (int input : arr) {
            if (input > 0 ) {
                positiveCount = positiveCount + 1;
            }
            if (input < 0) {
                negativeCount = negativeCount + 1;
            }
            if (input == 0) {
                zeroCount = zeroCount + 1;
            }
        }

        if (positiveCount > 0) {
            ratio[0] = (float) positiveCount / countOfInputArray;
        }

        if (negativeCount > 0) {
            ratio[1] = (float) negativeCount / countOfInputArray;
        }

        if (zeroCount > 0) {
            ratio[2] = (float) zeroCount / countOfInputArray;
        }
        
        for (int i = 0; i < 3; i++ ) {
        	System.out.printf("%.6f \n", ratio[i]);
        }
    }

}
