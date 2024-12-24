import java.util.*;

public class C_Sums_on_Segments {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        
        while (t-- > 0) {
            int n = in.nextInt();
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextLong();
            }

            Set<Long> distinctSums = new HashSet<>();
            long currentSum = 0;
            
            
            distinctSums.add(currentSum);  
          
            for (int i = 0; i < n; i++) {
                currentSum = 0; 
                for (int j = i; j < n; j++) {
                    currentSum += arr[j];
                    distinctSums.add(currentSum); 
                }
            }

            
            List<Long> sortedSums = new ArrayList<>(distinctSums);
            Collections.sort(sortedSums);

           
            System.out.println(sortedSums.size());
            for (Long sum : sortedSums) {
                System.out.print(sum + " ");
            }
            System.out.println();
        }

        in.close();
    }
}
