import java.util.*;
public class B_Two_Divisors {

    public static long gcd(long a,long b)
    {
        return b==0?a:gcd(b,a%b);
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while (t-->0) {
            long a=in.nextLong();
            long b=in.nextLong();
            if(b%a==0){
            System.out.println((b*b)/a);
            continue;
            }

            long lcm=(a*b)/gcd(a,b);
            
            System.out.println(lcm);
        }
    }
}