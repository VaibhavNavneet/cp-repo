import java.util.*;
public class B_Make_AP
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0)
        {
            double a=in.nextDouble();
            double b=in.nextDouble();
            double c=in.nextDouble();
            double k=0;
            k=(a+c)/(2*b);
            if(k==Math.floor(k) && k>0 )
            System.out.println("YES");
            else 
            {
                k=(2*b-c)/a;
                if(k==Math.floor(k) && k>0)
                System.out.println("YES");
                else
                {   k=(2*b-a)/c;
                    if(k==Math.floor(k) && k>0)
                    System.out.println("YES");
                    else
                    System.out.println("NO");
                }
            }
        }
    }
} 