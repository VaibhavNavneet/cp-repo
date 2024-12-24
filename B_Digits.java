import java.util.*;

public class B_Digits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt(); 
        
        while (t-- > 0) {
            long n = in.nextLong(); 
            int d = in.nextInt();  
            
            List<Integer> list = new ArrayList<>();
            
            list.add(1);
            
            if (n>2 || d%3==0) 
                list.add(3);
            
            if (d % 5 == 0) 
                list.add(5);
            
            if (d%7==0 || n >= 3) {
                list.add(7);
            } 
            
            if (n>5 || (d%3==0 && n>2) || d%9==0) 
                list.add(9);
            
            Collections.sort(list);
            for (int i : list) 
                System.out.print(i + " ");
            System.out.println();
        }
        in.close();
    }
}
