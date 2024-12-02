import java.util.*;
public class A_King_Keykhosrow_s_Mystery {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0)
        {
            int a=in.nextInt();
            int b=in.nextInt();
            for(int i=Math.min(a,b);;i++)
            {
                if(i%a==i%b)
                {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}