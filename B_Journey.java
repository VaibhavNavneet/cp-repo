import java.util.*;
public class B_Journey {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt(); 
        while (t-- > 0) {
            long n = in.nextLong(); 
            long a = in.nextLong();
            long b = in.nextLong();
            long c = in.nextLong();

            long[] arr = {a, b, c};
            long cycleSum = a + b + c;

            
            long fullCycles = n / cycleSum;
            long distanceCovered = fullCycles * cycleSum;

           
            long remainingDistance = n - distanceCovered;
            int extraDays = 0;

           
            while (remainingDistance > 0) {
                remainingDistance -= arr[extraDays % 3];
                extraDays++;
            }

        
            long totalDays = fullCycles * 3 + extraDays;
            System.out.println(totalDays);
        }
    }
}
