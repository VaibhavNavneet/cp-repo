import java.util.*;
public class A_Set {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0)
        {
           
            long l=in.nextLong();
            long r=in.nextLong();
            long k=in.nextLong();
            
           
            System.out.println(r/k-l+1>0?r/k-l+1:0);
        }
    }
}