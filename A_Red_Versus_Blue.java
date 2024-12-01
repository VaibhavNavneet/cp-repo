import java.util.*;
public class A_Red_Versus_Blue {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0)
        {
                int n=in.nextInt();
                int r=in.nextInt();
                int b=in.nextInt();
                String s="";
                int nred=r/(b+1);
                int rem=r%(b+1);
                for(int i=0;i<b;i++)
                {
                    for(int j=0;j<nred;j++)
                    s+='R';
                    if(rem>0)
                    {
                        s+='R';
                        rem--;
                    }
                    s+='B';
                }
                for(int i=0;i<nred;i++)
                s+='R';
                System.out.println(s);
        }
    }
}