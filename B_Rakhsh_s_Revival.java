import java.util.*;

public class B_Rakhsh_s_Revival {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int m = in.nextInt();
            int k = in.nextInt();
            in.nextLine(); 
            String s = in.nextLine();

            int i = 0, j = 0, count = 0;

            while (j < n) {
                
                if (s.charAt(j) == '0') {
                    if (j - i + 1 == m) {
                        count++;
                        j += k; 
                        i = j; 
                    } else {
                        j++;
                    }
                } 
                else { 
                    j++;
                    i = j;
                }
            }

            System.out.println(count);
        }
    }
}
