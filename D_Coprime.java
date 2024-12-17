import java.util.*;
public class D_Coprime {
    public static int gcd(int a,int b)
    {
        while(b>0)
        {
            int rem=a%b;
            a=b;
            b=rem;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0)
        {
            int n=in.nextInt();
            int arr[]=new int[n];
            int arr2[]=new int[10001];
            for(int i=0;i<n;i++)
            {
                arr[i]=in.nextInt();
                arr2[arr[i]]=i+1;
            }
            int max=0;
            for(int i=1;i<=1000;i++)
            {
                if(arr2[i]!=0)
                    for(int j=1;j<1001;j++)
                    {
                        if(arr2[j]!=0 && gcd(i,j)==1)
                        max=Math.max(max,arr2[i]+arr2[j]);
                    }
            }
            System.out.println(max==0?-1:max);
            
        }
    }
}