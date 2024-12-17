import java.util.*;
public class B_Fun_with_Even_Subarrays {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0)
        {
            int n=in.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=in.nextInt();

            }
            int cnt=0,x=arr[n-1],i=n-1,step=0;
            while(i>=0)
            {
                while(i>=0 && arr[i]==x)
                {
                    cnt++;
                    i--;
                }
                if(i<0)
                break;
                step++;
                i-=cnt;
                cnt=cnt*2;
            }
            System.out.println(step);
        }
    }
}