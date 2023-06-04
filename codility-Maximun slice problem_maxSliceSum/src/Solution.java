
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int maxSliceSum(int[] A) {
		int max_1 = Integer.MIN_VALUE;
	    int max_2 = Integer.MIN_VALUE;
	    int currentSum = 0;
	
	    for (int i = 0; i < A.length; i++) {
	        max_1 = Math.max(max_1, A[i]);
	        currentSum += A[i];
	        max_1 = Math.max(max_1, currentSum);
	    }
	
	    currentSum = 0;
	    for (int i = A.length-1; i >= 0; i--) {
	        max_2 = Math.max(max_2, A[i]);
	        currentSum += A[i];
	        max_2 = Math.max(max_2, currentSum);
	    }
	
	    return Math.max(max_1, max_2);
	}

}
