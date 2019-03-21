package com.suresh.learnings.twentynineteen.march;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RandomNumberMasker {

	private List<String> zeroToNineDigitsList;

	public RandomNumberMasker() {
		super();
		this.zeroToNineDigitsList = new ArrayList<String> (10);
	}
	
	public List<String> generateSequentialNumberList() {
		
		for (int i = 0; i < 10; i++) {
			this.zeroToNineDigitsList.add("" + i);
		}
		
		return this.zeroToNineDigitsList;
	}
	
	/**
	 * <ul>
	 * 	<li> 1. Generate sequential number list.</li>
	 * 	<li> 2. Shuffle the sequential number list.</li>
	 * 	<li> 3. Extract the first number in the list.</li>
	 * 	<li> 4. When the first number in the shuffled list is greater than the length 
	 *    of the string to be masked then subtract it with the mask digit length.</li>
	 * 	<li> 5. Since the digits has to be masked continuously for the given length,
	 *    identify the indexes to be masked.</li>
	 * 	<li> 6. Once the continuous indexes are identified replace the index positions with
	 *    masked character ('X')</li>
	 * 	<li> 7. Return the masked input.</li>
	 * </ul>   
	 */
	public String generateMaskedNumber(String input, int maskDigitLength) {
		String maskedInput = null;
		
		if (input == null || input.length() < 10) {
			System.out.println("Invalid Input!!!");
			return maskedInput;
		}
		
		if (maskDigitLength < 3) {
			System.out.println("Invalid Mask digit length!!!");
			return maskedInput;
		}
		
		maskedInput = performInputMasking(input, maskDigitLength);
		
		return maskedInput;
	}

	private String performInputMasking(String input, int maskDigitLength) {
		String maskedInput = null;
		
		List<String> shuffledList = generateShuffledList();
		
		if (shuffledList == null || shuffledList.size() < 1) {
			System.out.println("Invalid Shuffled list-->");
			return maskedInput;
		}
		int[] maskNumberSeq;
		
		maskNumberSeq = identifyIndexPositions(shuffledList, input, maskDigitLength);
		
		maskedInput = maskInputWithIndexPosition(maskNumberSeq, input, maskDigitLength);
		
		return maskedInput;
	}

	private String maskInputWithIndexPosition(int[] maskNumberSeq, String input, int maskDigitLength) {
		char[] charArrayList = new char[10];
		charArrayList = input.toCharArray();
		int maskCountSeq = 0;
		char[] maskedInput = new char[10];
		for (int i = 0; i < charArrayList.length; i++) {
			if (maskCountSeq < maskDigitLength && i == maskNumberSeq[maskCountSeq]) {
				charArrayList[i] = 'X';
				++maskCountSeq;
			}
			maskedInput[i] = charArrayList[i];
			//System.out.print(maskedInput[i]);
		}
		return String.valueOf(maskedInput);
	}

	private int[] identifyIndexPositions(List<String> shuffledList, String input, int maskDigitLength) {
		int[] maskNumberSeq = new int[3];
		
		int startPosition = 0;
		
		Integer firstValue = Integer.valueOf(shuffledList.get(0));
		
		if (firstValue.intValue() > (input.length() - maskDigitLength)) {
			startPosition = input.length() - maskDigitLength;
			System.out.println("startPosition-->" + startPosition);
		} else {
			startPosition = firstValue.intValue();
		}
		
		for (int i = 0; i < maskDigitLength; i++) {
			maskNumberSeq[i] = startPosition++;
			System.out.println("maskNumberSeq["+ i + "]" + maskNumberSeq[i]);
		}
		
		return maskNumberSeq;
	}

	private List<String> generateShuffledList() {
		List<String> shuffledList = null;
		shuffledList = this.generateSequentialNumberList();
		Collections.shuffle(shuffledList);
		return shuffledList;
	}

	public List<String> getZeroToNineDigitsList() {
		return zeroToNineDigitsList;
	}

	public void setZeroToNineDigitsList(List<String> zeroToNineDigitsList) {
		this.zeroToNineDigitsList = zeroToNineDigitsList;
	}

}