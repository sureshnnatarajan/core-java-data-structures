package com.suresh.learnings.arrays;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FirstNonRepeatingCharacter {

	//public static char[] CHARACTERS = {'A', 'B', 'C', 'D','E', 'F', 'G', 'H','I', 'J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'}; 
	
	public static void main(String[] args) {
		FirstNonRepeatingCharacter charObj = new FirstNonRepeatingCharacter();
		
		Character first = charObj.findNonRepeatingCharacterV2("AEIOU");
		System.out.println("First ====>" + first);
	}
	
	//First Version - Does not work.
	public Character findNonRepeatingCharacterV1(String sourceString) {
		Character nonRepeatingCharacter = new Character(' ');
		
		if (sourceString == null || sourceString.isEmpty()) {
			return nonRepeatingCharacter;
		}
		
		List<Character> repeatingCharList = new ArrayList<Character>(10);
		List<Character> nonRepeatingCharList = new ArrayList<Character>(10);
		
		String upperCaseSource = sourceString.toUpperCase();
		
		for(Character charValue : upperCaseSource.toCharArray()) {
			
			if (repeatingCharList.isEmpty()) {
				repeatingCharList.add(charValue);
				continue;
			} else {
				if (!repeatingCharList.contains(charValue)) {
					repeatingCharList.add(charValue);
				} else {
					if (nonRepeatingCharList.isEmpty()) {
						nonRepeatingCharList.add(charValue);
						continue;
					}
					if (nonRepeatingCharList.contains(charValue)) {
						nonRepeatingCharList.add(charValue);
					}
				}
			}
		}
		nonRepeatingCharacter = nonRepeatingCharList.get(0);
		return nonRepeatingCharacter;
	}

	//Second Version - Works if there are repeating characters. Does not work if there are NO repeating characters. Ex: "AEIOU"
	public Character findNonRepeatingCharacterV2(String sourceString) {
		Character nonRepeatingCharacter = new Character(' ');
		
		Queue<Character> nonRepeatCharQueue = new LinkedList<Character>();
		List<Character> repeatingCharList = new ArrayList<Character>(10);
		
		String upperCaseSource = sourceString.toUpperCase();
		
		for(Character charValue : upperCaseSource.toCharArray()) {
			
			if (nonRepeatCharQueue.isEmpty()) {
				nonRepeatCharQueue.add(charValue);
				continue;
			} 
			if (!nonRepeatCharQueue.contains(charValue)) {
				nonRepeatCharQueue.add(charValue);
			} else {
				repeatingCharList.add(charValue);
			}
		}
		
		if (repeatingCharList.isEmpty() || nonRepeatCharQueue.isEmpty()) {
			return nonRepeatingCharacter;
		}
		
		for (Character rptChar : repeatingCharList) {
		
			if (nonRepeatCharQueue.contains(rptChar)) {
				nonRepeatCharQueue.remove(rptChar);
			}
		}
		
		nonRepeatingCharacter = nonRepeatCharQueue.peek();
		
		return nonRepeatingCharacter;
	}
}
