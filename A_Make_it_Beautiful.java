import java.util.*;
public class A_Make_it_Beautiful {

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
            int p=0,q=n-1;
            while(p<q)
            {
                int z=arr[p];
                arr[p]=arr[q];
                arr[q]=z;
                p++;
                q--;
            }
            int flag=0;
            if(arr[1]==arr[0]){
            for(int i=2;i<n;i++)
            {
                if(arr[i]!=arr[1])
                {
                    flag=1;
                    int temp=arr[i];
                    arr[i]=arr[1];
                    arr[1]=temp;
                    break;
                }
            }
        }
            if(arr[1]!=arr[0])
            flag=1;
            if(flag==0)
            System.out.println("NO");
            else
            {
                System.out.println("YES");
                for(int i=0;i<n;i++)
                System.out.print(arr[i]+" ");
                System.out.println();
            }
        



        }
    }
}