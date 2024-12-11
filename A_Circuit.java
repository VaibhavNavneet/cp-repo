import java.util.*;
public class A_Circuit {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0)
        {
            int n=in.nextInt();
            in.nextLine();
            int arr[]=new int[2*n];
            int noo=0,noz=0;
           for(int i=0;i<2*n;i++)
           {
            arr[i]=in.nextInt();
            if(arr[i]==1)
            noo++;
            else
            noz++;

           }
            int max=0;
            int min=0;
            if(noo>n)
            max=2*n-noo;
            else
            max=noo;

            if(noz%2==0)
            min=0;
            else
            min=1;
            System.out.println(min+" "+max);
        }
    }
}