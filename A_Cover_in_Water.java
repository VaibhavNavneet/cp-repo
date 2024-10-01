import java.util.*;
public class A_Cover_in_Water
{
    public static int c(String s)
    {int count=0;
        for(int i=0;i<s.length();i++)
        if(s.charAt(i)=='.')
        count++;
        return count;
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        in.nextLine();
        while(t-- >0)
        {
            int n=in.nextInt();
            in.nextLine();
            String s=in.nextLine();
            int count=0;
            for(int i=0;i<=n-3;i++)
            {
                String s1=s.substring(i,i+3);
                if(s1.indexOf('#')==-1)
                count++;
            }
            if(count>0)
            System.out.println(2);
            else{
                System.out.println(c(s));
            }
        }
    }
}