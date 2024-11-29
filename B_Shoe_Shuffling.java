import java.util.*;
public class B_Shoe_Shuffling {

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

            }
            for(Map.Entry<Integer,Integer> it:mpp.entrySet())
            {
                if(it.getValue()<2)
                count=-1;
            }
            if (count == 0) {
                int[] arr1 = new int[n];
                ArrayList<Integer> indices = new ArrayList<>();
                
                
                for (int i = 0; i < n; i++) {
                    indices.add(i);
                    if (i == n - 1 || arr[i] != arr[i + 1]) {
                       
                        if (indices.size() > 1) {
                            for (int j = 0; j < indices.size(); j++) {
                                int curr = indices.get(j);
                                int next = indices.get((j + 1) % indices.size());
                                arr1[curr] = next + 1; 
                            }
                        }
                        indices.clear();
                    }
                }
            
            
                for (int z = 0; z < n; z++) {
                    System.out.print(arr1[z] + " ");
                }
                System.out.println();
            }
            
            else
            System.out.println(-1);
        }
    }
}