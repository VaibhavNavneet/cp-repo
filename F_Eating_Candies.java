import java.util.*;

public class F_Eating_Candies {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt(); 
        while (t-- > 0) {
            int n = in.nextInt();
            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt(); 
            }

            long suma = arr[0], sumb = arr[n - 1]; 
            int i = 0, j = n - 1; 
            int maxCount = 0; 

            while (i < j) {
                if (suma == sumb) {
                    maxCount = (i + 1) + (n - j); 
                }

                
                if (suma <= sumb) {
                    i++;
                    if (i < j) suma += arr[i];
                } else {
                    j--;
                    if (j > i) sumb += arr[j];
                }
            }

            System.out.println(maxCount);
        }
    }
}
