import java.util.*;
public class A_Exciting_Bets
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0)
        {
            long a=in.nextLong();
            long b=in.nextLong();
            long ex=Math.abs(a-b);
            long x=0;long move=0;
            if(ex!=0){
                if(ex==a || ex==b)
                x=0;
                else
                x=ex-a%ex;
            move=Math.min(x,a%ex);
            }
            
            
            
            System.out.println(ex+" "+move);
        }
    }
}