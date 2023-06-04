package codility_MissingInteger;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

	public static void main(String[] args) {
		int[] A = {-1000000, 1000000};
		System.out.println(smallestPositiveInteger(A));
	}
	
	public static int smallestPositiveInteger(int[] A) {
		List<Integer> list = Arrays.stream(A).boxed().collect(Collectors.toList());
		Collections.sort(list);
		
		int max = list.get(list.size() - 1);
		int min = list.get(0);
		
		if (min > 1 || max < 0) {
			return 1;
		}
		
		for (int i=0; i<list.size() - 1; i++) {
			if (list.get(i+1) - list.get(i) > 1) {
				if (list.get(i) >= 0) {
					return list.get(i) + 1;
				}
				if (list.get(i) < 0 && list.get(i+1) > 1) {
					return 1;
				}
			}
		}
		
		return max+1;
	}

}
