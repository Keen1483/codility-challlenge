package codility_test;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		int[] A = {15, 10, 3};
		int[] B = {75, 30, 5};
		System.out.println(solution(A, B));

	}
	
	public static int solution(int[] A, int[] B) {
        int Z = A.length;
        int min; int max;
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < Z; i++) {
        	if (A[i] != 1 && B[i] != 1) {
        		if (A[i] == B[i]) return i + 1;
        		if (!isPrime(A[i]) || !isPrime(B[i])) {
        			if (A[i] < B[i]) {
        				min = A[i];
        				max = B[i];
        			} else {
        				min = B[i];
        				max = A[i];
        			}
        			
        			if (max % min == 0) {
        				for (int n = 2; n < min - 1; n++) {
        					if (min % n == 0 && isPrime(n)) list.add(n);
        				}
        				for (int n = min + 1; n < max - 1; n++) {
        					if (max % n == 0 && isPrime(n)) {
        						list = new ArrayList<>();
        						break;
        					}
        				}
        				
        				if (list.size() > 0) {
        					boolean ok = true;
        					for (int n : list) {
        						if (max % n != 0) {
        							ok = false;
        							break;
        						}
        					}
        					if (ok) return i + 1;
        				}
        			}
        		}
        	}
        }
        return 1;
    }
	
	public static boolean isPrime(int n) {
		for (int p = 2; p <= n - 1; p++) {
			if (n % p == 0) return false;
		}
		return true;
	}

}
