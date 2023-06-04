import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

public class Solution {

	public static void main(String[] args) {

	}
	
	public int distinctValues(int[] A) {
		HashSet<Integer> set = new HashSet<>(Arrays.stream(A).boxed().collect(Collectors.toList()));
	
	    return set.size();
	}

}
