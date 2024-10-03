import java.util.*;
public class D_Balanced_Round
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0)
        {
            int n=in.nextInt();
            int k=in.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
            arr[i]=in.nextInt();
            int count=1;int minlen=0;
            Arrays.sort(arr);
            for(int i=0;i<n-1;i++)
            {
                if(arr[i+1]-arr[i]<=k)
                count++;
                else
                {
                    minlen=Math.max(minlen,count);
                    count=1;
                }
            }
            minlen=Math.max(minlen,count);
            System.out.println(n-minlen);
        }
    }
}