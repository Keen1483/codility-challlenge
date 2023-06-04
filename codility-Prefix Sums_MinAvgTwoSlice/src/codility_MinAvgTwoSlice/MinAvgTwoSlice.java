package codility_MinAvgTwoSlice;


public class MinAvgTwoSlice {
	
	public static void main(String[] args) {
		int[] A = {4, 2, 2, 5, 1, 5, 8};
		
		System.out.println(minAverage(A));
	}
	
	public static int minAverage(int[] A) {
		double minAvg = Double.MAX_VALUE;
		int minIndex = 0;
		
		// if array is > 2 elements
		for (int i = 0; i < A.length - 2; i++) {
			if ((A[i] + A[i+1]) / 2.0d < minAvg) {
				minAvg = (A[i] + A[i+1]) / 2.0d;
				minIndex = i;
			}
			
			if ((A[i] + A[i+1] + A[i+2]) / 3.0d < minAvg) {
				minAvg = (A[i] + A[i+1] + A[i+2]) / 3.0d;
				minIndex = i;
			}
		}
		
		if ((A[A.length-2] + A[A.length-1]) / 2.0d < minAvg) {
			minAvg = (A[A.length-2] + A[A.length-1]) / 2.0d;
			minIndex = A.length-2;
		}
		
		return minIndex;
	}

}
