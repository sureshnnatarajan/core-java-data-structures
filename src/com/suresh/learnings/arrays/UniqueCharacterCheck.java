package com.suresh.learnings.arrays;

public class UniqueCharacterCheck {

	public static void main(String[] args) {
		String inputString = "abca";
		
		//checkUniqueness(inputString);
		
		//crackCheckUniqueness(inputString);
		
		checkUniqueChar(inputString);
	}
	
	//Third approach - Brute force
	private static void checkUniqueChar(final String inputString) {
		
		if (null == inputString || inputString.isEmpty()) {
			return;
		}
		
		int len = inputString.length();
		
		for (int i = 0; i < len; i++ ) {	
			for (int j = i + 1; j < len; j++) {
				if (inputString.charAt(i) == (inputString.charAt(j))) {
					System.out.println("Input string does not contain unique characters!!!");
					return ;
				}
			}
		}
		
		System.out.println("Input string contains unique characters --> " + inputString);
	}

	//Second approach from CrackingCoding - Drastic bug. - Failed
	private static void crackCheckUniqueness(final String inputString) {
		
		if (null == inputString || inputString.isEmpty()) {
			return;
		}
		
		boolean[] char_set = new boolean[inputString.length()];
		
		int length = inputString.length();
		
		for (int i = 0; i < length; i++) {
			
			int val = inputString.charAt(i);
			
			if (char_set[val]) {
				System.out.println("The given string does not have unique characters!!!" + inputString);
				return;
			}
			
			char_set[val] = true;
 		}
		
		System.out.println("The given string has unique characters!!!" + inputString);
	}
	
	//First approach - Failed
	private static void checkUniqueness(final String inputString) {
		
		if (null == inputString || inputString.isEmpty()) {
			return;
		}
		
		char[] charactersFound = new char[inputString.length()];
		
		for (int i = 0; i < inputString.length(); i++) {
			
			char c = inputString.charAt(i);
			
			if (charactersFound[i] == c) {
				System.out.println("My approach : Duplicate found -->" + c);
				return;
			} else {
				charactersFound[i] = c;
			}
		}
		
		System.out.println("My approach : No Duplicates found -->");
	}
}
