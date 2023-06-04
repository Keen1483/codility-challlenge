package news_in_java;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
	
	public static void main(String[] args) {
		int[] A = {1, 3, 6, 4, 1, 2};
		int[] B = {1, 2, 3};
		int[] C = {-1, -3};
		System.out.println(minIntGreaterThanZero(A));
		System.out.println(minIntGreaterThanZero(B));
		System.out.println(minIntGreaterThanZero(C));
		
	}
	
	public static int solution(int[] A) {
        int max = A[0];
        
        return max + 1;
    }
	
	public static int minIntGreaterThanZero(int[] A) {
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0; i<A.length; i++) {
			list.add(A[i]);
		}
		Collections.sort(list);
		
		if (list.get(0) > 1 || list.get(list.size() - 1) <= 0) {
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
		
		return list.get(list.size() - 1) + 1;
	}
}
