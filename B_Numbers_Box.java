import java.util.*;
public class B_Numbers_Box {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0)
        {
            int n=in.nextInt();
            int m=in.nextInt();
            int non=0,sum=0;
            int arr[][]=new int[n][m];
            for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
            {
                arr[i][j]=in.nextInt();
                if(arr[i][j]<0)
                non++;
                sum+=Math.abs(arr[i][j]);

            }  
           
            if(non%2==0)
            System.out.println(sum);
            else{
                int min=Math.abs(arr[0][0]);
                for(int i=0;i<n;i++)
                {
                    for(int j=0;j<m;j++)
                    {
                        if(Math.abs(arr[i][j])<min)
                        min=Math.abs(arr[i][j]);
                    }
                }
            System.out.println(sum-2*min);
            }
            




        }
    }
}