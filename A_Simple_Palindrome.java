import java.util.*;
public class A_Simple_Palindrome {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0)
        {
            int n=in.nextInt(); 
            String arr[]={"a","e","i","o","u"};
            int arr2[]=new int[5];
            String s="";
            for(int i=0;i<n;i++)
            {
                s+=arr[i%5];
                arr2[i%5]++;
            }
            for(int i=0;i<5;i++)
            {String ch="";
                while(arr2[i]>0)
                {
                    ch+=arr[i];
                    
                    arr2[i]--;
                }
                s=s+ch;
            }
           
           System.out.println(s.substring(n));

       }
    }
}