package codility_PermCheck;

import java.util.HashSet;

public class Solution {

	public static void main(String[] args) {
		int[] A = {4,1,3, 2};
		System.out.println(permutation(A));
	}
	
	public static int permutation(int[] A) {
		HashSet<Integer> currentSet = new HashSet<>();
	    HashSet<Integer> perfectSet = new HashSet<>();
	
	    for (int i = 0; i < A.length; i++) {
	        currentSet.add(A[i]);
	        perfectSet.add(i+1);
	    }
	    
	    for (int a : perfectSet) {
	        if (!currentSet.contains(a)) return 0;
	    }
	
	    return 1;
	}

}
