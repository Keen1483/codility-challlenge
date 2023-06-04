package codility_CountFrogStep;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X; int Y; int D; int count; boolean ok;
        // GET VALUE OF X
        try {

            do {
                
                do {
                    System.out.println("Enter the value of X within the the range [1..1,000,000,000]");
                    X = sc.nextInt();
                    if (X<1 || X>1000000000) {
                        X = -1;
                        System.out.println("Wrong number, enter agein");
                    }
                } while(X == -1);

                // GET VALUE OF Y
                do {
                    System.out.println("Enter the value of Y within the the range [1..1,000,000,000]");
                    Y = sc.nextInt();
                    if (Y<1 || Y>1000000000) {
                        Y = -1;
                        System.out.println("Wrong number, enter again");
                    }
                    if (Y<=X) {
                        Y = -1;
                        System.out.println("Y must be greater than " + X);
                    }
                } while(Y == -1);

                // GET VALUE OF D
                do {
                    System.out.println("Enter the value of D within the the range [1..1,000,000,000]");
                    D = sc.nextInt();
                    if (D<1 || D>1000000000) {
                        D = -1;
                        System.out.println("Wrong number, enter again");
                    }
                } while(D == -1);

                count = solution(X, Y, D);
                System.out.println(count);
            
                System.out.println("Would like to continue? N/Y (N or n to No and any else to Yes)");
                sc.nextLine();
                String resp = sc.nextLine();
                ok = ("N".equals(resp) || "n".equals(resp)) ? false : true;
            } while(ok);
            System.out.println("Good bye!");
            
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static int solution(int X, int Y, int D) {
        int count = 0;
        while (X < Y) {
            X += D;
            count++;
        }
        return count;
    }
}
