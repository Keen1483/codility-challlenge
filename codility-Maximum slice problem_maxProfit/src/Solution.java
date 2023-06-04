
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int maxProfit(int[] A) {
		int minVal = 200_000;
	    int maxProfit = 0;
	
	    for (int i = 0; i < A.length; i++) {
	        if (minVal < A[i]) {
	            maxProfit = Math.max(maxProfit, A[i] - minVal);
	        } else {
	            minVal = A[i];
	        }
	    }
	
	    return maxProfit;
	}

}
