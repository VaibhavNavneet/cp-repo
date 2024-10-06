import java.util.*;
public class B_Longest_Divisors_Interval
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        long t=in.nextLong();
        while(t-->0)
        {
            Long n=in.nextLong();
            
            for(int i=1;;i++)
            if(n%i!=0){
            System.out.println(i-1);
            break;}
        }
    }

}