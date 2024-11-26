import java.util.*;
public class B_Valerii_Against_Everyone {

      
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0)
        {
            int n=in.nextInt();
            int b[]=new int[n];
            int k=0;
            for(int i=0;i<n;i++)
            b[i]=in.nextInt();
            HashMap<Integer,Integer> mpp=new HashMap<>();
            for(int i=0;i<n;i++)
            {
                mpp.put(b[i],mpp.getOrDefault(b[i],0)+1);

            }
            for(Map.Entry<Integer,Integer> it:mpp.entrySet())
            {
                if(it.getValue()>1)
                k=1;
            }

            if(k==0)
            System.out.println("NO");
            else
            System.out.println("YES");

        }
    }
}