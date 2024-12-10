import java.util.*;
public class A_Shohag_Loves_Mod {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0)
        {
            int n=in.nextInt();
            for(int i=1;i<=n;i++)
            {
                System.out.print(2*i-1+" ");
            }
            System.out.println();
        }
    }
}