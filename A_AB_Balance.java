import java.util.*;
public class A_AB_Balance
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        in.nextLine();
        while(t-->0)
        {
            String s=in.nextLine();

            if(s.charAt(0)==s.charAt(s.length()-1))
            System.out.println(s);
            else
            {
                s=s.substring(0,s.length()-1)+(s.charAt(0)+"");
                System.out.println(s);
            }
        }
    }
}