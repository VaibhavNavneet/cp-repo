import java.util.*;
public class C_Move_Brackets {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0)
        {
            
            int n=in.nextInt();
            in.nextLine();
            String s=in.nextLine();
            Stack<Character> st=new Stack<>();
            for(int i=0;i<n;i++)
            {
                if(s.charAt(i)=='(')
                st.push(s.charAt(i));
                if(s.charAt(i)==')')
                {
                    if(!st.isEmpty() && st.peek()=='(')
                    st.pop();
                    else
                    st.push(s.charAt(i));
                }
            }int count=0;
            while(!st.isEmpty()){
            count++;
            st.pop();
            }
            System.out.println(count/2);
        }
    }
}