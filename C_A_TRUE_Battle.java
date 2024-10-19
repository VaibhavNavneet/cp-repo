import java.util.Scanner;

public class C_A_TRUE_Battle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();  // Read number of test cases
        
        while (t-- > 0) {
            int n = scanner.nextInt();  // Read the length of the string
            String s = scanner.next();  // Read the string
            
            int count_1 = 0;
            int count_0 = 0;
            boolean test = false;
            
            // Loop through the string
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '1') count_1++;
                else count_0++;
                
                // Check for consecutive '1's
                if (i < n - 1 && s.charAt(i) == '1' && s.charAt(i + 1) == '1') {
                    test = true;
                }
            }
            
            // Conditions to determine the output
            if (test) {
                System.out.println("YES");
            } else if (s.charAt(0) == '1' || s.charAt(n - 1) == '1') {
                System.out.println("YES");
            } else if (count_0 > count_1) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
        
        scanner.close();
    }
}
