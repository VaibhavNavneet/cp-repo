import java.util.*;
public class B_AND_Sorting {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0)
        {
            int n=in.nextInt();
            int arr[]=new int[n];
            HashMap<Integer,Integer> mpp=new HashMap<>();
            int max=0;
            for(int i=0;i<n;i++)
            {
                arr[i]=in.nextInt();
                if(arr[i]!=i){
                mpp.put(arr[i],i);
                max=arr[i];
                }
            }

            for(Map.Entry<Integer,Integer> it:mpp.entrySet())
            {
                max&=it.getKey();
            }
            System.out.println(max);
        }
    }
}