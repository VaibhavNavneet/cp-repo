import java.util.*;
public class B_Fair_Numbers {

    public static boolean check(long n)
    {
        String s=Long.toString(n);
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!='0' && n%(s.charAt(i)-'0')!=0)
            return false;
        }
        return true;

        
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0)
        {
            long n=in.nextLong();
            while(!check(n))
            n++;
            System.out.println(n);
        }
    }
}