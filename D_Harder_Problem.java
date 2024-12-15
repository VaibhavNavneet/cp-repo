import java.util.*;

public class D_Harder_Problem {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();  
        while (t-- > 0) {
            int n = in.nextInt(); 
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();  
            }

            int[] result = new int[n];
            boolean[] used = new boolean[n + 1];  
            int smallestAvailable = 1; 

            
            for (int i = 0; i < n; i++) {
                if (used[arr[i]]) {
                    
                    while (used[smallestAvailable]) {
                        smallestAvailable++;
                    }
                    result[i] = smallestAvailable;
                    used[smallestAvailable] = true;
                } else {
                    result[i] = arr[i];
                    used[arr[i]] = true;
                }
            }

           
            for (int i : result) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        in.close();
    }
}
