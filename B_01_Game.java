import java.util.*;
import java.io.*;
public class B_01_Game
{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        in.nextLine();
        while(t-->0)
        {
            String s=in.nextLine();
           
            StringBuffer sb=new StringBuffer(s);
            int k=0,count=0;
            while(sb.length()>1)
            {
                if(k==sb.length()-1)
                break;
                if(k<sb.length()-1 && sb.charAt(k)==sb.charAt(k+1))
                k++;
                else
                {
                    count++;
                    sb.delete(k,k+2);
                    k=0;
                }
            }
            if(count%2==0)
            System.out.println("NET");
            else
            System.out.println("DA");
        }
    }
}