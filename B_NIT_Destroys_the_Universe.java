import java.util.*;
public class B_NIT_Destroys_the_Universe
{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0)
        {
            int n=in.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
            arr[i]=in.nextInt();
            int k=0;int count=0;
       
            for(int i=0;i<n;i++)
            {
                if(arr[i]!=0)
                count++;
                else{
                    
                    if(count>0)
                    k++;
                    count=0;
                }
            }
            if(count!=0)
            k++;
            if(k==0)
            System.out.println(0);
            else if(k==1)
            System.out.println(1);
            else
            System.out.println(2);
            
        }
    }
}