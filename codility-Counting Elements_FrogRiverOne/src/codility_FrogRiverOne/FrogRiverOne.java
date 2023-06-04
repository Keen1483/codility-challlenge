package codility_FrogRiverOne;

import java.util.Set;
import java.util.TreeSet;

public class FrogRiverOne {

	public static void main(String[] args) {
		int[] A = {1, 3, 1, 3, 2, 1, 3};
		int[] B = {3};
		System.out.println(earliestTime(5, B));
		System.out.println(Integer.MAX_VALUE);
	}
	
	public static int earliestTime(int X, int[] A) {
		Set<Integer> set = new TreeSet<>();
		int i = 0;
		set.add(A[i]);
		 while (i < A.length-1 && set.size() < X) {
			 i++;
			 set.add(A[i]);
		 }
		 
		 if (set.size() == X) {
			 return i;
		 } else {
			 return -1;
		 }
	}
	

}
