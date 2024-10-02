import java.util.*;
public class A_Jagged_Swaps
{
    
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0)
        {
            int n=in.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
            arr[i]=in.nextInt();
            int mn=Integer.MAX_VALUE;
            for(int i=0;i<n;i++)
            mn=Math.min(mn,arr[i]);

            if(arr[0]!=mn)
            System.out.println("NO");
            else
            System.out.println("YES");
        }
    }
}