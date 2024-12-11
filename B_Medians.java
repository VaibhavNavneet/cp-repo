import java.util.*;
public class B_Medians {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0)
        {
            int n=in.nextInt();
            int k=in.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
            arr[i]=i+1;
            if(n==1)
            {
                if(k==1){
                System.out.println(1);
                System.out.println(1);
                }
                else
                System.out.println(-1);
                continue;

            }
            if(k<=arr[0]||k>=arr[n-1])
            {
                System.out.println(-1);
                continue;
            }
            int arr2[]=new int[3];
            arr2[0]=1;
            if((k-1)%2!=0)
            {
                arr2[1]=k;
                arr2[2]=k+1;
            }
            else{
            arr2[1]=k-1;
            arr2[2]=k+2;
            }
            System.out.println(3);
            for(int num:arr2)
            System.out.print(num+" ");
            System.out.println();

        }
    }
}