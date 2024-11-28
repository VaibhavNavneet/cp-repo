import java.util.*;

public class D_Black_and_White_Stripe {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt(); 
        while (t-- > 0) {
            int n = in.nextInt(); 
            int k = in.nextInt(); 
            in.nextLine(); 
            String s = in.nextLine(); 

            int min = Integer.MAX_VALUE; 
            int currentCount = 0;

            
            for (int i = 0; i < k; i++) {
                if (s.charAt(i) == 'W') {
                    currentCount++;
                }
            }
            min = currentCount;

           
            for (int i = k; i < n; i++) {
                if (s.charAt(i - k) == 'W') {
                    currentCount--; 
                }
                if (s.charAt(i) == 'W') {
                    currentCount++; 
                }
                min = Math.min(min, currentCount);
            }

            System.out.println(min); 
        }
        in.close();
    }
}
