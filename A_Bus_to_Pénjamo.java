import java.util.*;
public class A_Bus_to_Penjamo {
    public static int countzero(int arr[])
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        if(arr[i]==1)
        count++;
        return count;
    }
public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int t=in.nextInt();
    while(t-->0)
    {
        int n=in.nextInt();
        int r=in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=in.nextInt();
        int count=0;
        int num=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>1)
            {
                r-=arr[i]/2;
                int x=arr[i]/2;
                count+=2*x;
                arr[i]=arr[i]%2;
            }
           
        }
        if(countzero(arr)<r)
        count+=countzero(arr);
        else
        count+=2*r-countzero(arr);
        System.out.println(count);
    }
}
}