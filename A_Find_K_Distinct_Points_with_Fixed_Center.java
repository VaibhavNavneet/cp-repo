import java.util.*;
public class A_Find_K_Distinct_Points_with_Fixed_Center {

    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0)
        {
            int xc=in.nextInt();
            int yc=in.nextInt();
            int k=in.nextInt();
            int arr[][]=new int[k][2];
            if(k%2!=0)
            {
                for(int i=0;i<k;i++)
                {
                    arr[i][0]=xc+i-(k-1)/2;
                    arr[i][1]=yc+i-(k-1)/2;
                }
            }
            else
            {
                for(int i=0;i<k;i++)
                {
                    if(i<k/2)
                    {
                        arr[i][0]=xc+i-k/2;
                        arr[i][1]=yc+i-k/2;
                    }
                    else
                    {
                        arr[i][0]=xc+i-k/2+1;
                        arr[i][1]=yc+i-k/2+1;
                    }
                }
            }
             
            for(int i=0;i<k;i++)
            {
              System.out.println(arr[i][0]+" "+arr[i][1]);  
            }
        }
    }
}