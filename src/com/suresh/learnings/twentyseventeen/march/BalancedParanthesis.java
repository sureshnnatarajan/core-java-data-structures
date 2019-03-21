package com.suresh.learnings.twentyseventeen.march;

import java.util.Stack;

public class BalancedParanthesis {
	
	public static char[][] TOKENS = new char[][] { {'{','}'}, {'(',')'}, {'[',']'} };
	
	public static char[] VALID_CHARACTERS = new char[] {'{','}', '(', ')', '[', ']' };

	public static void main(String[] args) {
		String input = "{}()[1";
		boolean output = isBalanced(input);
		System.out.println("Input " + input +" is a Balanaced String ? -->" + output);
	}
	
	public static boolean isBalanced(String expression) {
		Stack<Character> stack = new Stack<Character>();
		for (char c : expression.toCharArray()) {
			if (!isCharValid(c)) {
				continue;
			}
			if (isOpenTerm(c)) {
				stack.push(c);
			} else {
				if (stack.isEmpty() || !matches(stack.pop(), c)) {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}
	
	private static boolean isCharValid(char currentCharcter) {
		for (char c : VALID_CHARACTERS) {
			if (currentCharcter == c) {
				return true;
			}
		}
		return false;
	}

	private static boolean matches(char openTerm, char closeTerm) {
		for (char[] array : TOKENS) {
			if (array[0] == openTerm) {
				return array[1] == closeTerm;
			}
		}
		return false;
	}

	private static boolean isOpenTerm(char c) {
		for (char[] array : TOKENS) {
			if (array[0] == c) {
				return true;
			}
		}
		return false;
	}
}