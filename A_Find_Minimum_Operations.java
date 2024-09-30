import java.util.Scanner;

public class A_Find_Minimum_Operations {

    
    static int ans(int n, int k) {
        int cnt = 0;

        while (n > 0) {
            if (k > 1) {
                
                int maxPower = (int) (Math.log(n) / Math.log(k));
                int powerValue = (int) Math.pow(k, maxPower); 

                
                n -= powerValue;
            } else {
              
                cnt += n;
                break;
            }

            cnt++; 
        }

        return cnt;
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt(); 

        while (t-- > 0) {
            int n = in.nextInt(); 
            int k = in.nextInt();

            System.out.println(ans(n, k)); 
        }

        in.close();
    }
}
