package com.suresh.learnings.twentynineteen.april;

import java.util.ArrayList;
import java.util.List;

public class RomanLetterGenerator {

    public static String[] HUNDREDS = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
   
    public static String[] TENS = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
    
    public static String[] ONES = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
   
    public static List<String> romanizer(List<Integer> numbers) {
        List<String> romanizedList = null;
        
        if (numbers == null || numbers.isEmpty()) {
            return new ArrayList<String>(1);
        }

        String romanNumber = "";
        romanizedList = new ArrayList<String>(10);

        for (Integer number : numbers) {
        	romanNumber = "";
        	
        	while (number >= 1000) {
        		romanNumber = romanNumber + "M";
        		number -= 1000;
        	}
        	
        	romanNumber = romanNumber + HUNDREDS[number / 100];
        	number = number % 100;
        	
        	romanNumber = romanNumber + TENS [number / 10];
        	number = number % 10;
        	
        	romanNumber = romanNumber + ONES[number];
        	
        	romanizedList.add(romanNumber);
        }

        return romanizedList; 
    }
	
	public static void main(String[] args) {
		 List<Integer> numbers = new ArrayList<Integer>();
		 numbers.add(1); numbers.add(2); numbers.add(3); numbers.add(42);numbers.add(100);
		 
		 List<String> result = RomanLetterGenerator.romanizer(numbers);
		 
		 System.out.println(result);
	}

}
