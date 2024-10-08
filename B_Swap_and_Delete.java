import java.util.*;
public class B_Swap_and_Delete {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        in.nextLine();
        while(t-->0)
        {
            String s=in.nextLine();
            int nzero=0,none=0;
            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)=='0')
                nzero++;
                else
                none++;
            }int i=0;
            for(;i<s.length();i++)
            {
                if(s.charAt(i)=='0' && none>0)
                none--;
               else if(s.charAt(i)=='0' && none==0){
                    System.out.println(s.length()-i);
                    break;}
                if(s.charAt(i)=='1' && nzero>0)
                nzero--;
               
                
                else if(s.charAt(i)=='1'&& nzero==0)
                {
                    System.out.println(s.length()-i);
                    break;
                }

                
            }
            if(i==s.length())
            System.out.println(0);

        }
    }
}