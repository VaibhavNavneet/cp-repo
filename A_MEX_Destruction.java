import java.util.*;

public class A_MEX_Destruction {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        
        while (t-- > 0) {
            int n = in.nextInt();
            int[] arr = new int[n];
            boolean hasNonZero = false;
            int segments = 0;
            
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
                if (arr[i] != 0) hasNonZero = true;
            }
            
            if (!hasNonZero) {
                System.out.println(0);
                continue;
            }
            
            // Count contiguous non-zero segments
            boolean inSegment = false;
            for (int i = 0; i < n; i++) {
                if (arr[i] != 0) {
                    if (!inSegment) {
                        inSegment = true;
                        segments++;
                    }
                } else {
                    inSegment = false;
                }
            }
            
            // Output the result
            if (segments == 1) {
                System.out.println(1);
            } else {
                System.out.println(2);
            }
        }
        
        in.close();
    }
}
