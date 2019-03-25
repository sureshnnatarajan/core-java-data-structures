package com.suresh.learnings.arrays;

public class RotateArrays {
	
	public int[] rotateRight(int[] sourceArray, int rotateTimes) {
		
		if (sourceArray == null || sourceArray.length <= 1 || rotateTimes < 1) {
			return sourceArray;
		}
		
		if (rotateTimes > 1 && (sourceArray.length % rotateTimes) > 0) {
			rotateTimes = sourceArray.length % rotateTimes;
		}
		
		for (int i = 0; i < rotateTimes; i++) {
			rotateRightOnePosition(sourceArray);
		}
		
		return sourceArray;
	}
	
	private void rotateRightOnePosition(int[] sourceArray) {
		int temp = sourceArray[sourceArray.length - 1];
		
		for (int i = sourceArray.length - 1; i > 0; i--) {
			sourceArray[i] = sourceArray[i - 1];
		}
		sourceArray[0] = temp;
	}
	
	public int[] rotateLeft(int[] sourceArray, int rotateTimes) {
		
		if (sourceArray == null || sourceArray.length <= 0 || rotateTimes <= 0) {
			return sourceArray;
		}
		
		for (int i = 0; i < rotateTimes; i++) {
			rotateLeftOnePosition(sourceArray);
		}
		
		return sourceArray;
	}

	private void rotateLeftOnePosition(int[] sourceArray) {
		
		int temp = sourceArray[0];
		
		for (int i = 0; i < sourceArray.length -1; i++) {
			sourceArray[i] = sourceArray[i + 1];
		}
		sourceArray[sourceArray.length - 1] = temp;
		
	}

	private static void printArray(int[] srcArray) {
		for (int i = 0; i < srcArray.length; i++) {
			System.out.print(srcArray[i]); 
			System.out.print(",");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		RotateArrays instance = new RotateArrays();
		
		int[] srcRightArray = {1, 2, 3, 4, 5};
		int[] srcLeftArray = {10, 9, 8, 7, 6};
		
		int rightRotateTimes = 2;
		int leftRotateTimes = 2;
		
		System.out.println("Right rotation starts for "+ rightRotateTimes + " ---->");
		
		printArray(srcRightArray);
		
		int[] destArray = instance.rotateRight(srcRightArray, rightRotateTimes);
		
		printArray(destArray);
		
		System.out.println("Left rotation starts for "+ leftRotateTimes + " ---->");
		
		printArray(srcLeftArray);
		
		int [] destLeftArray = instance.rotateLeft(srcLeftArray, leftRotateTimes);
		
		printArray(destLeftArray);
		
	}
}
