package codility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int N = 1041;
		System.out.println(Integer.toBinaryString(N));
		System.out.println(largeZeroSeq(N));
	}
	
	public static int largeZeroSeq(int N) {
		String binaryN = Integer.toBinaryString(N);
		
		String binaryGap = "";
		List<Integer> lengthOfGap = new ArrayList<Integer>();
		int j = 0;
		
		for (int i = binaryN.length()-1; i >= 0; i--) {
			if (i == binaryN.length()-1 && '0' == binaryN.charAt(i)) {
				lengthOfGap.add(0);
			}
			
			if ('1' == binaryN.charAt(i)) {
				j = i;
			}
			
			if ('0' == binaryN.charAt(i) && i < j) {
				binaryGap += "0";
				if (i-1 >= 0 && '1' == binaryN.charAt(i-1)) {
					lengthOfGap.add(binaryGap.length());
					binaryGap = "";
				}
			}
		}
		
		if (lengthOfGap.size() == 0) {
			lengthOfGap.add(0);
		}
		
		return Collections.max(lengthOfGap);
	}

}
