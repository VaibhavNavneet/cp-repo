import java.util.*;

public class Josephus_Queries {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        
        while (t-- > 0) {
            int n = in.nextInt();
            long k = in.nextLong();
            
            ArrayList<Integer> children = new ArrayList<>();
            for (int i = 1; i <= n; i++) {
                children.add(i);
            }
            
            int index = 0;
            while (children.size() > 0) {
                index = (index + 1) % children.size();
                k--;
                
                if (k == 0) {
                    System.out.println(children.get(index));
                    break;
                }
                
                children.remove(index);
            }
        }
    }
}
