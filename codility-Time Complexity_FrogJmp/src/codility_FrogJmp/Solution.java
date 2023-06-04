package codility_FrogJmp;

public class Solution {

	public static void main(String[] args) {
		int X = 10;
		int Y = 85;
		int D = 30;
		System.out.println(frogJumpsNumber(X, Y, D));
	}
	
	public static int frogJumpsNumber(int X, int Y, int D) {
		if (X == Y) {
			return 0;
		} else {
			return (Y - X) / D + ( (Y - X) % D == 0 ? 0 : 1 );
		}
	}

}
