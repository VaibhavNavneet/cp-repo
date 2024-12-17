import java.util.*;
public class C_Paint_the_Array {

    public static long gcd(long a,long b)
    {
        while(b>0)
        {
            long remainder=a%b;
            a=b;
            b=remainder;
        }
        return a;

    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0)
        {
            int n=in.nextInt();
            long arr[]=new long[n];
            for(int i=0;i<n;i++)
            arr[i]=in.nextLong();
            long gcd1=arr[0];long gcd2=arr[1];
            for(int i=0;i<n;i++)
            {
                if(i%2==0)
                gcd1=gcd(arr[i],gcd1);
                else
                gcd2=gcd(arr[i],gcd2);
            }
            boolean check=true;
            for(int i=0;i<n;i+=2)
            {
                if(arr[i]%gcd2==0)
                {
                    check=false;
                    break;
                }
            }
            if(check){
            System.out.println(gcd2);
            continue;}
            check=true;
            for(int i=1;i<n;i+=2)
            {
                if(arr[i]%gcd1==0)
                {
                    check=false;
                    break;
                }
            }
            if(check){
            System.out.println(gcd1);
            continue;}
            System.out.println(0);


        }
    }
}