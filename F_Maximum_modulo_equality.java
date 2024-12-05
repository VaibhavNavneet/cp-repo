import java.util.*;
public class F_Maximum_modulo_equality {
    public static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void buildSparseTable(long[] diff, long[][] sparseTable) {
        int n = diff.length;
        int maxLog = sparseTable[0].length;

       
        for (int i = 0; i < n; i++) {
            sparseTable[i][0] = diff[i];
        }

        for (int j = 1; j < maxLog; j++) {
            for (int i = 0; i + (1 << j) <= n; i++) {
                sparseTable[i][j] = gcd(sparseTable[i][j - 1], sparseTable[i + (1 << (j - 1))][j - 1]);
            }
        }
    }

    public static long queryGCD(long[][] sparseTable, int l, int r) {
        int log = (int) (Math.log(r - l + 1) / Math.log(2));
        return gcd(sparseTable[l][log], sparseTable[r - (1 << log) + 1][log]);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while (t-- > 0) {
            int n = in.nextInt();
            int q = in.nextInt();
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextLong();
            }

            if (n == 1) {
                for (int i = 0; i < q; i++) {
                    in.nextInt(); 
                    in.nextInt(); 
                    System.out.println(0);
                }
                continue;
            }

           
            long[] diff = new long[n - 1];
            for (int i = 0; i < n - 1; i++) {
                diff[i] = Math.abs(arr[i + 1] - arr[i]);
            }

            
            int maxLog = (int) (Math.log(n - 1) / Math.log(2)) + 1;
            long[][] sparseTable = new long[n - 1][maxLog];
            buildSparseTable(diff, sparseTable);

            
            for (int i = 0; i < q; i++) {
                int l = in.nextInt() - 1;
                int r = in.nextInt() - 1;

                if (l == r) {
                    System.out.print(0 + " ");
                } else {
                    System.out.print(queryGCD(sparseTable, l, r - 1) + " ");
                }
            }
            System.out.println();
        }
        in.close();
    }
}