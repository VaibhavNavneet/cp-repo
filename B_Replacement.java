import java.util.*;

public class B_Replacement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt(); 
        while (t-- > 0) {
            int n = in.nextInt(); 
            in.nextLine(); 
            String s = in.nextLine(); 
            String r = in.nextLine(); 

            StringBuilder temp = new StringBuilder(s); 
            int rop = 0; 

            for (int i = 0; i < temp.length() - 1; ) {
                if (temp.charAt(i) != temp.charAt(i + 1)) {
                    if (rop >= r.length()) {
                        break; 
                    }

                    
                    temp.delete(i, i + 2); 
                    temp.insert(i, r.charAt(rop)); 
                    rop++; 

                    
                    i = Math.max(0, i - 1); 
                } else {
                    i++; 
                }
            }

           
            System.out.println(temp.length() == 1 ? "yes" : "no");
        }
        in.close();
    }
}
