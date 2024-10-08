import java.util.*;

public class B_Monsters {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int k = in.nextInt();
            long arr[] = new long[n];

           
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextLong();
            }

           
            Long[][] pairedArray = new Long[n][2];
            for (int i = 0; i < n; i++) {
                long r = arr[i] % k;
               
                pairedArray[i][0] = (r == 0) ? k : r; 
                pairedArray[i][1] = (long) i;         
            }

           
            Arrays.sort(pairedArray, new Comparator<Long[]>() {
                @Override
                public int compare(Long[] a, Long[] b) {
                    int valueComparison = b[0].compareTo(a[0]);
                    if (valueComparison == 0) {
                        return a[1].compareTo(b[1]); 
                    }
                    return valueComparison; 
                }
            });

            
            for (int i = 0; i < n; i++) {
                System.out.print(pairedArray[i][1]+1 + " ");
            }
            System.out.println();
        }
    }
}
