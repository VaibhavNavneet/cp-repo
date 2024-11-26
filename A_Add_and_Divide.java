import java.util.*;

public class A_Add_and_Divide {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt(); // Number of test cases
        while (t-- > 0) {
            int a = in.nextInt(); // Input `a`
            int b = in.nextInt(); // Input `b`
            int max = Integer.MAX_VALUE;

            for (int i = 0; i <= 30; i++) {
                int x = a;
                int turns = i; // Increment operations to increase `b` by `i`

                // Skip invalid cases where b + i < 2
                if (b + i < 2) {
                    continue;
                }

                // Perform division until x becomes 0
                while (x > 0) {
                    x /= (b + i);
                    turns++;
                }

                // Update the minimum turns required
                max = Math.min(max, turns);
            }
            System.out.println(max);
        }
        in.close();
    }
}
