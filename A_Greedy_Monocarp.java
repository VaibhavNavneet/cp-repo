import java.util.*;
public class A_Greedy_Monocarp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int k = in.nextInt();
            int arr[] = new int[n];
            int sum = 0;

            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
                sum += arr[i];
            }

            if (sum < k) {
                System.out.println(k - sum);
                continue;
            }

            Arrays.sort(arr);
            sum = 0;

            for (int i = n - 1; i >= 0; i--) {
                if (sum + arr[i] > k) {
                    break; 
                }
                sum += arr[i];
            }

            System.out.println(k - sum); 
        }
    }
}
