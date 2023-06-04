package codility_CountDiv;

public class Solution {

	public static void main(String[] args) {
		int A = 6, B = 13, K = 2;
		System.out.println(countDiv(A, B, K));
	}
	
	public static int countDiv(int A, int B, int K) {
		if (K == 1) {
			return B - A + 1;
		}
		
		int divisors = 0;
		int N = A;
		while (N <= B && N % K != 0) {
			N++;
		}
		
		if ( N <= B && N % K == 0) {
			divisors = (int) Math.floor((B - N) / K) + 1;
		}
		
		return divisors;
	}

}
