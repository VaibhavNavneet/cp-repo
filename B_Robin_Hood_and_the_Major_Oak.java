import java.util.*;
public class B_Robin_Hood_and_the_Major_Oak{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t>0)
        {
            int n=in.nextInt();
            int k=in.nextInt();
            int sum=0;
            for(int i=Math.max(1,n-k+1);i<=n;i++)
            {
                sum+=Math.pow(i, i);
            }
            if(sum%2==0)
            System.out.println("YES");
            else
            System.out.println("NO");
            t--;
        }
    }
}