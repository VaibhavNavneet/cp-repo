import java.util.*;
public class B_Game_with_Colored_Marbles {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0)
        {
            int n=in.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
            arr[i]=in.nextInt();
            HashMap<Integer,Integer> mpp=new HashMap<>();
            for(int i=0;i<n;i++)
            {
                mpp.put(arr[i],mpp.getOrDefault(arr[i],0)+1);
            }
            int count=0,uni=0;
            for(Map.Entry<Integer,Integer> it:mpp.entrySet())
            {
                if(it.getValue()>1)
                uni++;
                if(it.getValue()==1)
                count++;
            }
            int ans=0;
            if(count%2==1)
            ans+=(count+1);
            else
            ans+=count;
            ans+=uni;
            System.out.println(ans);

        }
    }
}