import java.util.*;
public class B_Generate_Permutation {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0)
        {
            int n=in.nextInt();
            int arr[]=new int[n];
            if(n%2==0)
            {
                System.out.println(-1);
                continue;

            }
            for(int i=0;i<n;i++)
            {
                if(i==0)
                arr[i]=1;
                else if(i%2==0)
                arr[i]=i;
                else
                arr[i]=i+2;

            }
            for(int i:arr)
            System.out.print(i+" ");
            System.out.println();
        }
    }
}
