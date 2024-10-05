import java.util.*;
public class B_Odd_Grasshopper
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0)
        {
            long x=in.nextLong();
            long n=in.nextLong();
            
            if(x%2==0)
            {
                if(n%4==1)
                x=x-n;
                if(n%4==2)
                x=x+1;
                if(n%4==3)
                x=x+n+1;

            }
            else{
                if(n%4==1)
                x=x+n;
                if(n%4==2)
                x=x-1;
                if(n%4==3)
                x=x-n-1;

            }
            System.out.println(x);


        }
    }
}