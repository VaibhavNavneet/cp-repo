import  java.util.*;
public class B_Erase_First_or_Second_Letter {

    
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0)
        {
            int n=in.nextInt();
            in.nextLine();
            String s=in.nextLine();
           
            HashMap<Character,Integer> mpp=new HashMap<>();
                int ans=0;
            for(int i=0;i<n;i++)
            {
                if(!mpp.containsKey(s.charAt(i)))
                {
                    ans+=n-i;
                    mpp.put(s.charAt(i),mpp.getOrDefault(s.charAt(i),0)+1);
                }
            }
            System.out.println(ans);

        }
    }
}