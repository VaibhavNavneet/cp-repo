import java.util.*;
public class A_Line_Breaks {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0)
        {
            int n=in.nextInt();
            int m=in.nextInt();
            in.nextLine();
            String arr[]=new String[n];
            for(int i=0;i<n;i++)
            arr[i]=in.nextLine();
            int sum=0;
            int count=0;
            for(int i=0;i<n;i++)
            {
                sum+=arr[i].length();
                if(sum<=m)
                count++;

            }
            System.out.println(count);
        }
    }
}