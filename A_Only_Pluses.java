import java.util.*;
public class A_Only_Pluses {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0)
        {
            int arr[]=new int[3];
            int k=5;
            for(int i=0;i<3;i++)
            arr[i]=in.nextInt();
            Arrays.sort(arr);
            while(k>0)
            {
                arr[0]++;
                Arrays.sort(arr);
                k--;
            }
            int prod=1;
            for(int i=0;i<3;i++)
            prod*=arr[i];
            System.out.println(prod);

        }
    }
}
