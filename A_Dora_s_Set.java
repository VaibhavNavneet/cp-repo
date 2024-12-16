import java.util.*;
public class A_Dora_s_Set {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0)
        {
            int l=in.nextInt();
            int r=in.nextInt();
            int count=0;
            int i=l;
            while(i<r)
            {
                if(i%2==0)
                i++;
                else
                {
                    if(i+2<=r)
                    count++;
                    i+=3;
                }
            }
            System.out.println(count);
        }
    }
}