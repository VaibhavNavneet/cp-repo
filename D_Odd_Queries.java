import java.util.*;

public class D_Odd_Queries {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int q = in.nextInt();
            int[] arr = new int[n];
            int[] prefixSum = new int[n + 1];

            // Read array and compute prefix sum
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
                prefixSum[i + 1] = prefixSum[i] + arr[i];
            }

            // Process each query
            while (q-- > 0) {
                int l = in.nextInt();
                int r = in.nextInt();
                int k = in.nextInt();

                // Sum of range [l, r] is prefixSum[r] - prefixSum[l-1]
                int rangeSum = prefixSum[r] - prefixSum[l - 1];

                // Compute the new sum by replacing the range sum with k * (r - l + 1)
                int newSum = prefixSum[n] - rangeSum + (r - l + 1) * k;

                // Check if the new sum is odd or even
                if (newSum % 2 != 0) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}
