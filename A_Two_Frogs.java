import java.util.*;
public class A_Two_Frogs {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        
        while (t-- > 0) {
            int n = in.nextInt(); 
            int a = in.nextInt(); 
            int b = in.nextInt(); 

            if ((Math.abs(b - a) % 2) == 0) {
               
                System.out.println("YES");
            } else {
                
                System.out.println("NO");
            }
        }
        in.close();
    }
}
