import java.util.*;
public class A_Alice_s_Adventures_in_Chess {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0)
        {
            int n=in.nextInt();
            int a=in.nextInt();
            int b=in.nextInt();
            in.nextLine();
            String s=in.nextLine();
            int x=0;int y=0;int flag=0;int z=0;
            for(int i=0;i<n*100;i++)
            {
                if(i%n==0)
                z=0;
                if(s.charAt(z)=='N')
                y++;
                if(s.charAt(z)=='S')
                y--;
                if(s.charAt(z)=='E')
                x++;
                if(s.charAt(z)=='W')
                x--;
                if(x==a && y==b)
                {
                    System.out.println("YES");
                    flag=1;
                    break;
                }
                z++;
                
            }
            if(flag==0)
            System.out.println("NO");
            
        }
    }
}