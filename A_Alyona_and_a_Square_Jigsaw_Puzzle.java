import java.util.*;

public class A_Alyona_and_a_Square_Jigsaw_Puzzle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt(); // Number of test cases
        while (t-- > 0) {
            int n = in.nextInt(); // Number of elements in the array
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }

            int k = 2;
            int x=4*k*(k-1);
            int count = 1;
            int sum = 0; // Start with the first element
            for(int i=1;i<n;i++)
            {
                sum+=arr[i];
                while(sum>=x)
                {
                    if(sum==x)
                    count++;
                    k++;
                    x=4*k*(k-1);
                }
               
            }
            System.out.println(count);
        }
        in.close();
    }
}
