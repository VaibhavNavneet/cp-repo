import java.util.*;
public class B_Kevin_and_Permutation {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0)
        {
            int n=in.nextInt();
            int k=in.nextInt();
           
            int arr[]=new int[n];
            int num=1;
            for(int i=k-1;i<n;i+=k)
            arr[i]=num++;
            for(int i=0;i<n;i++)
            {
                if(arr[i]!=0)
                continue;
                arr[i]=num++;
            }
            for(int i:arr)
            System.out.print(i+" ");
            System.out.println();
        }
    }
}