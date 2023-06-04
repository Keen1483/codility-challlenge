import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		int[] A = {-3,1,2,-2,5,6};
		System.out.println(maximalProduct(A));
	}
	
	public static int maximalProduct(int[] A) {
		Arrays.sort(A);
		
		int max_1 = A[A.length-3] * A[A.length-2] * A[A.length-1];
		int max_2 = A[0] * A[1] * A[A.length-1];
		
		int max = Math.max(max_1, max_2);
		
		return max;
	}

}
