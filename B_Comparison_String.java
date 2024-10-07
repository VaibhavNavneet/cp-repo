import java.util.*;
public class B_Comparison_String
{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0)
        {
            int n=in.nextInt();
            in.nextLine();
            String s=in.nextLine();
            int k=1;int ans=1;
            for(int i=1;i<n;i++)
            {
                if(s.charAt(i-1)!=s.charAt(i))
                k=1;
                else
                k++;

                ans=Math.max(ans,k);


            }
           
            System.out.println(ans+1);
        }
    }
}