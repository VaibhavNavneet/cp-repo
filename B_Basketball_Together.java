import java.util.*;
public class B_Basketball_Together {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        long d=in.nextLong();
        long arr[]=new long[n];
        for(int i=0;i<n;i++)
        arr[i]=in.nextLong();
        Arrays.sort(arr);
        int count=0;
        int i=-1;
        int j=n-1;
        long curr=arr[j];
        while(i<j)
        {
            long maxp=arr[j];
            if(curr<=d)
            {
                i++;
                curr+=maxp;
            }
            else
            {
                count++;
                j--;
                if(j>=0)
                curr=arr[j];
            }
        }
        System.out.println(count);
    }
}