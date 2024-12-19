import java.util.*;
public class B_A_Perfectly_Balanced_String {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        in.nextLine();
        while(t-->0)
        {
            String s=in.nextLine();
            int n=s.length();
            HashMap<Character,Integer> mpp=new HashMap<>();
            int flag=0,temp=0;
            for(int i=0;i<n;i++)
            {
                if(!mpp.containsKey(s.charAt(i)) && temp==0)
                {
                    mpp.put(s.charAt(i),i);
                }
                else
                {
                    temp=1;
                    if(s.charAt(i-mpp.size())!=s.charAt(i))
                    {
                        flag=1;
                        break;
                    }
                }
            }
            System.out.println(flag==0?"yes":"no");
        }
    }
}