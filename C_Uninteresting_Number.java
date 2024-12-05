import java.util.*;

public class C_Uninteresting_Number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            String n = in.next();  
            int digitSum = 0;
            int count2 = 0, count3 = 0;
            
           
            for (char ch : n.toCharArray()) {
                digitSum += ch - '0';
                if (ch == '2') count2++;
                if (ch == '3') count3++;
            }
            
           
            if (digitSum % 9 == 0) {
                System.out.println("YES");
                continue;
            }

           
            boolean found = false;
            for (int i = 0; i <= count2; i++) {
                for (int j = 0; j <= count3; j++) {
                    if ((digitSum + 2 * i + 6 * j) % 9 == 0) {
                        found = true;
                        break;
                    }
                }
                if (found) break;
            }

            if (found) System.out.println("YES");
            else System.out.println("NO");
        }
        in.close();
    }
}
