import java.util.*;
public class C_Hard_Problem {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0)
        {
            int m=in.nextInt();
            int a=in.nextInt();
            int b=in.nextInt();
            int c=in.nextInt();
            long count=0;
            count+=(a>m)?m:a;
            count+=(b>m)?m:b;
            long remain=2*m-count;
            if(remain<=0)
            {
                System.out.println(count);
                continue;
            }
            System.out.println(count+((remain>c)?c:remain));

        }
    }
}