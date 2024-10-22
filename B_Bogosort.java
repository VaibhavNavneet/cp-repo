import java.util.*;
public class B_Bogosort {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0)
        {
            int n=in.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
            arr[i]=in.nextInt();
            Arrays.sort(arr);
            for(int i=0;i<n;i++)
            System.out.print(arr[n-i-1]+" ");
            System.out.println();
        }
    }
}