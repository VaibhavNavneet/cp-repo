import java.util.*;
public class B_Shohag_Loves_Strings {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        in.nextLine();
        while(t-->0)
        {
            
            
            String s=in.nextLine();
            int n=s.length();
            if(n==1)
            {
                System.out.println(-1);
                continue;
            }
            String ss="";
            String dif="";
            for(int i=0;i<n-2;i++)
            {
                if(s.charAt(i)!=s.charAt(i+1) && s.charAt(i)!=s.charAt(i+2) && s.charAt(i+1)!=s.charAt(i+2))
                {
                    dif+=s.charAt(i)+""+s.charAt(i+1)+""+s.charAt(i+2)+"";
                    break;
                }
            }
            if(dif.length()!=0)
            {
                System.out.println(dif);
                continue;
            }

            for(int i=1;i<n;i++)
            {
                if(s.charAt(i)==s.charAt(i-1))
                {
                    ss+=s.charAt(i-1)+"";
                    ss+=s.charAt(i)+"";
                    break;
                }
            }
            if(ss.length()!=0)
            {
                System.out.println(ss);
                continue;
            }
            System.out.println(-1);

        }
    }
}