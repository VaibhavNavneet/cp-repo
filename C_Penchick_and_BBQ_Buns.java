import java.util.*;
public class C_Penchick_and_BBQ_Buns {
 
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0)
        {
            int n=in.nextInt();
            if(n%2!=0 && n<27)
            {
                System.out.println(-1);
                continue;
            }
            int k=2;
            if(n%2!=0 && n>=27){
                
                int arr[]=new int[27];
                arr[0]=arr[9]=arr[25]=1;
                arr[10]=arr[26]=13;
                for(int i=1;i<27;i+=2)
                {
                    if(arr[i]!=0)
                    continue;
                    else{
                    arr[i]=k;
                    arr[i+1]=k;
                    k++;
                    }

                }
                for(int i:arr)
                System.out.print(i+" ");
                n=n-27;
            }
            ArrayList<Integer> list=new ArrayList<>();
           k=14;
            for(int i=0;i<n;i+=2)
            {
                list.add(k);
                list.add(k);
                k++;
            }
            for(int i:list)
            System.out.print(i+" ");
            System.out.println();
        }
    }
}