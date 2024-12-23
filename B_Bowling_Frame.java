import java.util.*;

public class B_Bowling_Frame {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt(); 
        while (t-- > 0) {
            long w = in.nextLong();
            long b = in.nextLong();
            long target = w + b; 

            int left = 0, right = 100000; 
            while (left <= right) {
                int mid = left + (right - left) / 2;
                long currentSum = (long) mid * (mid + 1) / 2;

                if (currentSum == target) {
                    System.out.println(mid); 
                    break;
                } else if (currentSum < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

            if (left > right) {
                System.out.println(left - 1); 
            }
        }
        in.close();
    }
}
