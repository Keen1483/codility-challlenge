package codility_TapeEquilibrium;


public class TapeEquilibrium {

	public static void main(String[] args) {
		int[] A = {3, 1, 2, 4, 3};
		int[] B = {1,6};
		System.out.println(minimalDifference(A));
	}
	
	public static int minimalDifference(int[] A) {
		if (A.length == 2) return Math.abs(A[0] - A[1]);
	
	    int entireSum = 0;
	    for (int i = 0; i < A.length; i++) entireSum += A[i];
	
	    int leftSum = 0;
	    int rightSum = 0;
	    int currentDiff;
	    int minDiff = Integer.MAX_VALUE;
	    for (int p = 0; p < A.length-1; p++) {
	        leftSum += A[p];
	        rightSum = entireSum - leftSum;
	        currentDiff = Math.abs(rightSum - leftSum);
	        minDiff = Math.min(minDiff, currentDiff);
	    }
	
	    return minDiff;
	}
	
	public static String formatArray(int[] A) {
		String str = "[ ";
		for (int n : A) str += n + " ";
		str += "]";
		return str;
	}

}
