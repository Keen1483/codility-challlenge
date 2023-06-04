import java.util.Stack;

public class Solution {

	public static void main(String[] args) {
		String S = "(()(())())";
		
		System.out.println(properlyNested(S));
	}
	
	public static int properlyNested(String S) {
		if (S.length() % 2 != 0) {
			return 0;
		}
		
		Stack<Character> st = new Stack<>();
		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) == '(') {
				st.push(S.charAt(i));
			} else {
				if (st.isEmpty()) {
					return 0;
				}
				
				st.pop();
			}
		}
		
		if (!st.isEmpty()) {
			return 0;
		}
		
		return 1;
	}

}
