import java.util.*;
public class B_Normal_Problem {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        in.nextLine();
        while(t-->0)
        {
            String s=in.nextLine();
            for(int i=s.length()-1;i>=0;i--)
            {
                char ch=s.charAt(i);
                if(ch=='p')
                System.out.print('q');
                else if(ch=='q')
                System.out.print('p');
                else
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}