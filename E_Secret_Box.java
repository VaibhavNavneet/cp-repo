import java.util.Scanner;

public class E_Secret_Box {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();
            long k = in.nextLong();
            long max = 0;

            for (int i = 1; i <= x; i++) {
                for (int j = 1; j <= y; j++) {
                    long product = (long) i * j; 
                    if (k % product != 0) continue; 
                    long c = k / product; 
                    if (c > z) continue; 

                   
                    long volume = (long) (x - i + 1) * (y - j + 1) * (z - c + 1);
                    max = Math.max(max, volume);
                }
            }
            System.out.println(max);
        }
        in.close();
    }
}
