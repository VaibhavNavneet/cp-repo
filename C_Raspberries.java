import java.util.*;
public class C_Raspberries {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0)
        {
            int n=in.nextInt();
            int k=in.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
            arr[i]=in.nextInt();int min=6,max=0;int z=0;
            if(k!=4)
            {
                for(int i=0;i<n;i++)
                {
                    min=Math.min(min,arr[i]%k);
                    max=Math.max(max,arr[i]%k);
                    
                }
                if(min==0)
                    System.out.println(min);
                    else
                    System.out.println(k-max);
            }

            else
            {
                for(int i=0;i<n;i++)
                {
                    min=Math.min(min,arr[i]%k);
                    max=Math.max(max,arr[i]%k);
                    
                }
                if(min==0){
                    System.out.println(min);
                    continue;}
                    else
                     z=k-max;
                int even=0,odd=0;
                for(int i=0;i<n;i++)
                {
                    if(arr[i]%2==0)
                    even++;
                    else
                    odd++;
                }
                if(even>=2)
                System.out.println(0);
                else if(even==1 && odd>=1)
                System.out.println(1);
                else if(odd>1)
                System.out.println(Math.min(z,2));
                else
                System.out.println(z);
            
            }
        }
    }
}