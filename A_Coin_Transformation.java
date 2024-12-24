import java.util.*;
public class A_Coin_Transformation {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt(); 
        while (t-- > 0) {
            long n = in.nextLong();
            long count = 0;

            
            while (n >= 4) {
                n /= 4;
                count++;
            }

            
            System.out.println(1L << count); 
        }
        in.close();
    }
}
