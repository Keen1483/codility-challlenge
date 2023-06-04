package codility_MaxCounters;


public class Solution {

	public static void main(String[] args) {
		int[] A = {3,4,4,6,1,4,4};
		int[] counters = maxCounters(5, A);
		for (int n : counters) {
			System.out.print(n + " ");
		}
	}
	
	public static int[] maxCounters(int N, int[] A) {
		int[] counters = new int[N];
		int max = 0;
		for (int i = 0; i < A.length; i++) {
			if (1 <= A[i] && A[i] <= N) {
				counters[A[i] - 1] += 1;
				
				if (counters[A[i] - 1] > max) {
					max = counters[A[i] - 1];
				}
			} else {
				for (int j = 0; j < N; j++) {
					counters[j] = max;
				}
			}
		}
		
		return counters;
	}

}
