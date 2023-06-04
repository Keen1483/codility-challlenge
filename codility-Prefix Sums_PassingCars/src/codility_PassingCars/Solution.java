package codility_PassingCars;

public class Solution {

	public static void main(String[] args) {
		int[] A = {0,1,0,1,1};
		System.out.println(numberOfPairs(A));
	}
	
	public static int numberOfPairs(int[] A) {
		int countOfZeros = 0, pairs = 0;
		
		for (int i = 0; i < A.length; i++) {
			if (A[i] == 0) countOfZeros++;
			if (A[i] == 1) pairs += countOfZeros;
			if (pairs > 1_000_000_000) return -1;
		}
		return pairs;
	}

}
