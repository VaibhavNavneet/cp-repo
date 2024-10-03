import java.util.*;
public class C_Vasilije_in_Cacak
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0)
        {
            long n=in.nextLong();
            long k=in.nextLong();
            long x=in.nextLong();
            long low=0,high=0;
            
                low=k*(k+1)/2;

          
            high=(k*(2*n+1-k))/2;
            if(x<=high && x>=low)
            System.out.println("YES");
            else
            System.out.println("NO");
        }
    }
}