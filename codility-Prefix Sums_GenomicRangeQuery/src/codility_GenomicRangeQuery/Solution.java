package codility_GenomicRangeQuery;


public class Solution {

	public static void main(String[] args) {
		String S = "CAGCCTA";
		int[] P = {2, 5, 0};
		int[] Q = {4, 5, 6};
		
		int[] nucleo = minimalNucleotides(S, P, Q);
		for (int n : nucleo) {
			System.out.print(n + " ");
		}
	}
	
	public static int[] minimalNucleotides(String S, int[] P, int[] Q) {
		//used jagged array to hold the prefix sums of each A, C and G genoms
	    //we don't need to get prefix sums of T, you will see why.
		int[][] genoms = new int[3][S.length()+1];
		//if the char is found in the index i, then we set it to be 1 else they are 0
	    //3 short values are needed for this reason
		short a, c, g;
		for (int i = 0; i < S.length(); i++) {
			a = 0; c = 0; g = 0;
			if ('A' == S.charAt(i)) {
				a = 1;
			}
			if ('C' == S.charAt(i)) {
				c = 1;
			}
			if ('G' == S.charAt(i)) {
				g = 1;
			}
			//here we calculate prefix sums. To learn what's prefix sums look at here https://codility.com/media/train/3-PrefixSums.pdf
			genoms[0][i+1] = genoms[0][i] + a;
			genoms[1][i+1] = genoms[1][i] + c;
			genoms[2][i+1] = genoms[2][i] + g;
		}
		
		int[] result = new int[P.length];
		//here we go through the provided P[] and Q[] arrays as intervals
		for (int i = 0; i < P.length; i++) {
			int fromIndex = P[i];
			//we need to add 1 to Q[i], 
	        //because our genoms[0][0], genoms[1][0] and genoms[2][0]
	        //have 0 values by default, look above genoms[0][i+1] = genoms[0][i] + a; 
			int toIndex = Q[i] + 1;
			if (genoms[0][toIndex] - genoms[0][fromIndex] > 0) {
				result[i] = 1;
			} else if (genoms[1][toIndex] - genoms[1][fromIndex] > 0) {
				result[i] = 2;
			} else if (genoms[2][toIndex] - genoms[2][fromIndex] > 0) {
				result[i] = 3;
			} else {
				result[i] = 4;
			}
		}
		
		return result;
	}

}
