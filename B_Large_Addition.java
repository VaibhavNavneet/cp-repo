import java.util.*;
public class B_Large_Addition {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        in.nextLine();
        while (t-->0) {
            String s=in.nextLine();
            int n=s.length();
            int flag=1;
            for(int i=1;i<n-1;i++)
            {
                char ch=s.charAt(i);
                if(ch=='0')
                {
                    flag=0;
                    break;
                }

            }
            if(s.charAt(0)!='1')
            flag=0;
            if(s.charAt(n-1)=='9')
            flag=0;
            System.out.println(flag==0?"NO":"YES");

        }
    }
}