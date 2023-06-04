package codility_CyclicRotation;


public class CyclicRotation {

	public static void main(String[] args) {
		int[] A = {};
		A = cyclicRotation(A, 4);
		System.out.println(formatArrayToString(A));
	}
	
	public static int[] cyclicRotation(int[] A, int K) {
		if (A.length == 0) {
			return A;
		}
		
		K %= A.length;
		int lastItem;
		for (int i = 0; i < K; i++) {
			lastItem = A[A.length-1];
			for (int j = A.length - 1; j > 0; j--) {
				A[j] = A[j-1];
			}
			A[0] = lastItem;
		}
		
		return A;
	}
	
	public static String formatArrayToString(int[] A) {
		String str = "[ ";
		for (int elt : A) str += elt + " ";
		str += "]";
		return str;
	}

}
