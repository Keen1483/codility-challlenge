import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		int[] A = {10,2,5,1,8,20};
		System.out.println(triangularTriplet(A));
	}
	
	public static int triangularTriplet(int[] A) {
		if (A.length < 3) {
			return 0;
		}
		
		Arrays.sort(A);
		for (int i = 0; i < A.length - 2; i++) {
			if (A[i] > 0 && A[i] > A[i+2] - A[i+1]) {
				return 1;
			}
		}
		
		return 0;
	}

}
