import java.util.*;
public class A_Game_of_Division {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0)
        {
            int n=in.nextInt();
            int k=in.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
            arr[i]=in.nextInt();
            int count=0;
            for(int i=0;i<n;i++)
            {
                int num=arr[i];
                int flag=0;
                for(int j=0;j<n;j++)
                {
                    if(j!=i)
                    {
                        if(Math.abs(arr[j]-num)%k==0)
                        flag=1;

                    }
                }
                if(flag==0)
                {
                    System.out.println("YES");
                    System.out.println(i+1);
                    break;
                }
                else
                {
                    count++;
                }
            }
            if(count==n)
            System.out.println("NO");
            

        }
    }
}