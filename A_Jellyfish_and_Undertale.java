import java.util.*;
public class A_Jellyfish_and_Undertale
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0)
        {
            long a=in.nextLong();
            long b=in.nextLong();
            int n=in.nextInt();
            long arr[]=new long[n];
            for(int i=0;i<n;i++)
            arr[i]=in.nextLong();
            long time=b-1;
            b=1;
            Arrays.sort(arr);
            for(int i=0;i<n;i++)
            {
                b+=arr[i];
                b=Math.min(b,a);
                time+=(b-1);
                b=1;
            }
            System.out.println(time+1);

        }
    }
}