import java.util.*;
public class B_Battle_for_Survive {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0)
        {
            int n=in.nextInt();
            long arr[]=new long[n];
            long sum=0;
            
            for(int i=0;i<n;i++)
            {
                arr[i]=in.nextLong();
            }
            if(n==2)
            {
                System.out.println(arr[1]-arr[0]);
                continue;
            }

            for(int i=0;i<n-2;i++)
            {
                sum+=arr[i];
            }

            arr[n-2]-=sum;
            
            System.out.println(arr[n-1]-arr[n-2]);
        }
    }
}