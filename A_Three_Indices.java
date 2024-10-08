import java.util.*;
public class A_Three_Indices {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0)
        {
            int n=in.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
            arr[i]=in.nextInt();
            int k=0,count=0;
            for(int i=1;i<n-1;i++)
            {
                if(arr[i]>arr[i+1] && arr[i]>arr[i-1])
                {
                    count=1;
                    k=i+1;

                }
            }
            if(count==1)
            {
                System.out.println("YES");
                System.out.println((k-1)+" "+k+" "+(k+1));
            }
            else
            System.out.println("NO");
        }
    }
}