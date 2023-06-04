
public class Solution {

	public static void main(String[] args) {
		System.out.println(solution(30));

	}
	
	public static int solution(int N) {
        int minPerimeter = (N + 1) * 2;

        int p = 2;
        while (p <= N / 2) {
            if (N % p == 0) {
                minPerimeter = Math.min(minPerimeter, (p + (N/p)) * 2);
            }
            p++;
        }

        return minPerimeter;
    }

}
