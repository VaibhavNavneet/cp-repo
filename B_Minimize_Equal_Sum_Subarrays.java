import java.util.*;
public class B_Minimize_Equal_Sum_Subarrays {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0)
        {
            int n=in.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
            arr[i]=in.nextInt();
            int k=arr[0];
            for(int i=0;i<n-1;i++)
            arr[i]=arr[i+1];
            arr[n-1]=k;
            for(int i:arr)
            System.out.print(i+" ");
            System.out.println();
        }
    }
}