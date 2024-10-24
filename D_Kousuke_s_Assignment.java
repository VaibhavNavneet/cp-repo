import java.util.*;
public class D_Kousuke_s_Assignment {
        public static int max(int a[])
        {
            int prefixSum = 0;
        HashMap<Integer, Integer> sumMap = new HashMap<>();
        sumMap.put(0, -1); 
        int lastEnd = -1;    
        int beautifulCount = 0;

       
        for (int i = 0; i < a.length; i++) {
           
            prefixSum += a[i];

            
            if (sumMap.containsKey(prefixSum)) {
               
                int prevIndex = sumMap.get(prefixSum);
                
                if (prevIndex >= lastEnd) {
                    beautifulCount++;
                    lastEnd = i; 
                }
            }

            
            sumMap.put(prefixSum, i);
        }

        return beautifulCount;
        }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0)
        {
            int n=in.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
            arr[i]=in.nextInt();
            System.out.println(max(arr));

        }
    }
}