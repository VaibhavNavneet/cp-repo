import java.util.*;

public class A_Preparing_for_the_Olympiad {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt(); 
        while (t-- > 0) {
            int n = in.nextInt(); 
            int[] a = new int[n]; 
            int[] b = new int[n]; 

            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }

            for (int i = 0; i < n; i++) {
                b[i] = in.nextInt();
            }
            int dif=0;;
            for(int i=0;i<n-1;i++)
            {
                if(a[i]-b[i+1]>0)
                dif+=a[i]-b[i+1];

            }
            dif+=a[n-1];
            System.out.println(dif);

        }
    }
}
