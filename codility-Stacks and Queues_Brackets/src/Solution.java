import java.util.Stack;

public class Solution {

	public static void main(String[] args) {
		String S = "({{({}[]{})}}[]{})";
		System.out.println(properlyNested(S));
	}
	
	public static int properlyNested(String S) {
		if (S.length() % 2 != 0) {
			return 0;
		}
		
		Stack<Character> stack = new Stack<>();
		char currentChar, popedChar;
		for (int i = 0; i < S.length(); i++) {
			currentChar = S.charAt(i);
			
			if (isOpened(currentChar)) {
				stack.push(currentChar);
			} else {
				if (stack.isEmpty()) {
					return 0;
				}
				
				popedChar = stack.pop();
				if (isBrackets(popedChar, currentChar)) {
					continue;
				}
				
				return 0;
			}
		}
		
		if (stack.isEmpty()) {
			return 1;
		}
		
		return 0;
	}
	
	public static boolean isBrackets(char open, char close) {
		if (open == '(' && close == ')') {
			return true;
		} else if (open == '{' && close == '}') {
			return true;
		} else if (open == '[' && close == ']') {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean isOpened(char c) {
		if (c == '{' || c == '(' || c == '[') {
			return true;
		}
		
		return false;
	}

}
