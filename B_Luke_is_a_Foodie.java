import java.util.*;
public class B_Luke_is_a_Foodie {

    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0)
        {
            int n=in.nextInt();
            int x=in.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
            arr[i]=in.nextInt();
            int count=0;
            int l=Integer.MIN_VALUE;
            int r=Integer.MAX_VALUE;
            for(int i=0;i<n;i++)
            {
                int lowbound=arr[i]-x;
                int upbound=arr[i]+x;
                l=Math.max(l,lowbound);
                r=Math.min(r,upbound);
                if(l>r){
                count++;
                l=lowbound;
                r=upbound;
                }

            }
            System.out.println(count);
        }
    }
}