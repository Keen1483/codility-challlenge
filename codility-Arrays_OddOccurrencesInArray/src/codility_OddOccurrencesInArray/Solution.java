package codility_OddOccurrencesInArray;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class Solution {

	public static void main(String[] args) {
		int[] A = {9, 3, 9, 3, 9, 7, 9, 8, 8, 7, 5};
		int[] B = {3, 9, 3, 9, 3, 3, 4};
		int o = oddOccurrencesInArray(B);
		System.out.println(o);
	}
	
	public static int oddOccurrencesInArray(int[] A) {
		Set<Integer> set = new HashSet<>();
        boolean exits;
        for (int a : A) {
            exits = set.add(a);
            if (!exits) set.remove(a);
        }

        int odd = 0;
        Iterator<Integer> it = set.iterator();
        if (it.hasNext()) odd = it.next();

        return odd;
	}

}
