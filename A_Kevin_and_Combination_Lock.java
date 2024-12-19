import java.util.*;
public class A_Kevin_and_Combination_Lock {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0)
        {
            long x=in.nextLong();
            System.out.println(x%33==0?"yes":"no");
        }
    }
}