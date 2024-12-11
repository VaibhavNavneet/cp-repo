import java.util.*;

public class B_Intercepted_Inputs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt(); 
        while (t-- > 0) {
            int k = in.nextInt(); 
            int[] arr = new int[k];
            for (int i = 0; i < k; i++) {
                arr[i] = in.nextInt();
            }

            int prod = k - 2; 
            int n = 0, m = 0;
            boolean found = false;

            
            Set<Integer> seen = new HashSet<>();
            for (int num : arr) {
                if (num != 0 && prod % num == 0 && seen.contains(prod / num)) {
                    n = num;
                    m = prod / num;
                    found = true;
                    break;
                }
                seen.add(num);
            }

            if (found) {
                System.out.println(n + " " + m);
            } else {
                System.out.println("No solution");
            }
        }
        in.close();
    }
}
