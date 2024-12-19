import java.util.*;
public class A_Make_All_Equal {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0)
        {
            int n=in.nextInt();
            int arr[]=new int[n];
            HashMap<Integer,Integer> mpp=new HashMap<>();
            for(int i=0;i<n;i++)
            {
                arr[i]=in.nextInt();
                mpp.put(arr[i],mpp.getOrDefault(arr[i],0)+1);
            }
            int max=0;
            for(Map.Entry<Integer,Integer> it:mpp.entrySet())
            {
                max=Math.max(max,it.getValue());
            }
            System.out.println(n-max);
        }
    }
}