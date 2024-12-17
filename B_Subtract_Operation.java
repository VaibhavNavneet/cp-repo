import java.util.*;
public class B_Subtract_Operation {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0)
        {
            int n=in.nextInt();
            long k=in.nextLong();
            long arr[]=new long[n];
            for(int i=0;i<n;i++)
            arr[i]=in.nextLong();
            Arrays.sort(arr);
            int i=0;int j=1;
            int flag=0;
            while(i<n && j<n)
            {
                if(arr[j]-arr[i]==k)
                {
                    flag=1;
                    System.out.println("YES");
                    break;
                }
                if(arr[j]-arr[i]<k)
                j++;
                else
                i++;
            }
            if(flag!=1)
            System.out.println("NO");
        }
    }
}