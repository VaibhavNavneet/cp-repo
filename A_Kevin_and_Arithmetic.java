import java.util.*;
public class A_Kevin_and_Arithmetic {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0)
        {
            int n=in.nextInt();
            long arr[]=new long[n];
            int even=0,odd=0;
            for(int i=0;i<n;i++){
            arr[i]=in.nextLong();
            if(arr[i]%2==0)
            even++;
            else
            odd++;
            }

            if(odd>0 && even>0)
            {
                System.out.println(1+odd);
                continue;
            }
            if(even>0 && odd==0)
            {
                System.out.println(1);
                continue;
            }
            if(even==0)
            {
                
                System.out.println(odd-1);
            }
            
        }
    }
}