import java.util.*;

public class A_Johnny_and_Ancient_Computer {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        
        while (t-- > 0) {
            long a = in.nextLong();
            long b = in.nextLong();
            long count = 0;
            
            
            if (a < b) {
                long temp = a;
                a = b;
                b = temp;
            }

            
            if (a % b != 0 || (a / b & (a / b - 1)) != 0) {
                System.out.println(-1);
                continue;
            }

            long ratio = a / b;
            
            
            while (ratio % 8 == 0) {
                ratio /= 8;
                count++;
            }
            while (ratio % 4 == 0) {
                ratio /= 4;
                count++;
            }
            while (ratio % 2 == 0) {
                ratio /= 2;
                count++;
            }

            System.out.println(count);
        }
        
        in.close();
    }
}
