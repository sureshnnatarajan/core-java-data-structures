package com.suresh.learnings.twentynineteen.march;

public class RandomMaskDriver {
	
	public static void main(String[] args) {
		String input = "1234567890"; 
		int maskDigitLength = 3;
		createMaskedNumber(input, maskDigitLength);
	}

	private static void createMaskedNumber(String input, int maskDigitLength) {
		RandomNumberMasker randNumbObj = new RandomNumberMasker();
		String maskedMobileNumber = randNumbObj.generateMaskedNumber(input, maskDigitLength);
		System.out.println("Input mobile number  -->" + input);
		System.out.println("Masked mobile number -->" + maskedMobileNumber);
	}
}
