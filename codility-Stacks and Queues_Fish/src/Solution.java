import java.util.Stack;

public class Solution {

	public static void main(String[] args) {
		int[] A = {2,4,3,2,1,5}, B = {0,1,0,0,1,1};
		System.out.println(fishAlive(A, B));
	}
	
	public static int fishAlive(int[] A, int[] B) {
		if (A.length == 0) {
			return 0;
		}
		
		int numAlive = A.length;
		Stack<Integer> stack = new Stack<>();
		
		for (int i = 0; i < A.length; i++) {
			if (B[i] == 1) {
				stack.push(A[i]);
			}
			
			if (B[i] == 0) {
				while (!stack.isEmpty()) {
					if (stack.peek() < A[i]) {
						numAlive--;
						stack.pop();
					} else {
						numAlive--;
						break;
					}
				}
			}
		}
		
		return numAlive;
	}

}
