import java.util.*;
public class A_Strange_Splitting {

    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0)
        {
            int n=in.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
            arr[i]=in.nextInt();
            
            if(arr[n-1]-arr[0]==0)
            {
                System.out.println("NO");
                continue;
            }
            else
            {
                String s="";
                System.out.println("YES");
                while(n>0)
                {
                    if(n==2)
                    s="B"+s;
                    else
                    s="R"+s;
                    n--;
                }
                System.out.println(s);
            }
        }
    }
}