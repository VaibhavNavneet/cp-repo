import java.util.*;
public class A_Sliding {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0)
        {
            long n=in.nextInt();
            long m=in.nextInt();
            long r=in.nextInt();
            long c=in.nextInt();
            long sum=0;
            sum=(n-r)*m+(m*n+r-n-m*(r-1)-c);
            System.out.println(sum);

        }
  
  }
}