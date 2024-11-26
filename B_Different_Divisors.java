import java.util.*;
public class B_Different_Divisors {
    public static int findSmallestPrime(int n) {
        while (!isPrime(n)) {
            n++;
        }
        return n;
    }
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0)
        {
            int d=in.nextInt();
            int b = findSmallestPrime(1+d);
            int c = findSmallestPrime(b+d);
            System.out.println(b*c);

        }
    }
}