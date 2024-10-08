import java.util.*;
public class B_Multiply_by_2_divide_by_6
{

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        long t=in.nextLong();
        while(t-->0)
        {
            long n=in.nextLong();
            long a=0,b=0;long count=0;
            while(n%2==0)
            {
                a++;
                n=n/2;
            }
            while(n%3==0)
            {
                b++;
                n=n/3;
            }
            if(n!=1){
            System.out.println(-1);
            continue;
            }
            if(a>b)
            System.out.println(-1);
            else if(a<b)
            {
                count+=(b-a);
                count+=b;
                System.out.println(count);
            }
            else
            System.out.println(b);

            
        }
    }
}