import java.util.*;

public class C_Robin_Hood_in_Town{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t>0)
        {
            int x=0; double avg=0;
            int n=in.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
            arr[i]=in.nextInt();
            Arrays.sort(arr);
            if(n==1 || n==2)
            System.out.println(-1);
            for(int i=0;i<n;i++)
            avg+=arr[i]/n;
            avg/=2;
            
            t--;
        }
    }
}