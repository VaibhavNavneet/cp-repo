import java.util.*;
public class A_Line_Trip
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-- > 0)
        {
            int n=in.nextInt();
            int k=in.nextInt();
            int arr[]=new int[n+2];
            for(int i=1;i<=n;i++)
            {
                arr[i]=in.nextInt();
            }
            arr[0]=0;
            arr[n+1]=k;
            int max=0;
            for(int i=0;i<=n;i++)
            {
                if(i==n)
                max=Math.max(max,2*(arr[i+1]-arr[i]));
                else
                max=Math.max(max,arr[i+1]-arr[i]);
            }
            System.out.println(max);

        }
    }
}