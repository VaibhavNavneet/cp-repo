import java.util.*;
public class A_Meaning_Mean
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
            Arrays.sort(arr);
            int avg=(arr[0]+arr[1])/2;
            for(int i=2;i<n;i++)
            avg=(avg+arr[i])/2;
            System.out.println(avg);
        }
    }
}
