import java.util.*;
public class B_Penchick_and_Satay_Sticks {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0)
        {
            int n=in.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
            arr[i]=in.nextInt();
            int flag=0;
            for(int i=0;i<n;i++)
            {
                if(arr[i]==i+1||arr[i]==i||arr[i]==i+2)
                {
                    continue;
                }
                else
                {
                    flag=1;
                    break;
                }
            }
            if(flag==1)
            System.out.println("NO");
            else
            System.out.println("YES");
        }
    }
}