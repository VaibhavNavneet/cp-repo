import java.util.*;
public class A_Penchick_and_Modern_Monument {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0)
        {
            int n=in.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
            arr[i]=in.nextInt();
            int count=0;
            HashMap<Integer,Integer> mpp=new HashMap<>();
            for(int i=0;i<n;i++)
            {
                mpp.put(arr[i],mpp.getOrDefault(arr[i],0)+1);

            }int max=0;
            for(Map.Entry<Integer,Integer> it:mpp.entrySet())
            {
                if(it.getValue()>max)
                max=it.getValue();
            }
            System.out.println(n-max);

        }
    }
}