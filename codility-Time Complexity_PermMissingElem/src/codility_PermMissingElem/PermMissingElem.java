package codility_PermMissingElem;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class PermMissingElem {

	public static void main(String[] args) {
		int[] A = {2, 3, 1, 5};
		System.out.println(permMissingElem(A));
	}
	
	public static int permMissingElem(int[] A) {
		if (A.length == 1 && A[0] > 1) {
			return 1;
		}
		
		List<Integer> list = Arrays.stream(A).boxed().collect(Collectors.toList());
		Collections.sort(list);
		int i = 0;
		
		while (i < list.size() && i+1 == list.get(i)) {
			i++;
		}
		
		return i+1;
	}

}
