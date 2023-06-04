package codility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int min = 1; int max = 2147483647; int N; boolean ok = true;
		do {
			try {
				do {
					System.out.print("Enter an integer N within the range [1..2,147,483,647]: ");
					
					long M = sc.nextLong();
					if (M > max || M < -2147483648) N = -1;
					else N = (int) M;
				} while (N < min);
				final int result = largeZeroSeq(N);
				System.out.println("\n" + result);
				
				System.out.println("Would you like to continue ?\nN/Y (N for no and any key for yes)");
				sc.nextLine();
				String resp = sc.nextLine();
				if ("N".equals(resp) || "n".equals(resp)) {
					ok = false;
					System.out.println("Good bye...");
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
		} while(ok);
	}
	
	public static int largeZeroSeq(int N) {
		String bins = "";
		try {
			bins = Integer.toBinaryString(N);
		} catch (Exception e) {
			e.printStackTrace();
		}
		int j = 0; String str = ""; List<Integer> listLength = new ArrayList<>();
		
		for (int i = bins.length()-1; i != -1; i--) {
			if (i == bins.length()-1 && ( "0".equals(String.valueOf(bins.charAt(i))) )) {
				listLength.add(0);
			}
			if (!"0".equals(String.valueOf(bins.charAt(i)))) j = i;
			
			if (("0".equals(String.valueOf(bins.charAt(i)))) && (i < j)) {
				str += String.valueOf(bins.charAt(i));
				if (i-1 >= 0) {
					if (!"0".equals(String.valueOf(bins.charAt(i-1)))) {
						listLength.add(str.length());
						str = "";
					}
				}
			}
		}
		if (listLength.size() == 0) listLength.add(0);
		return Collections.max(listLength);
	}

}
