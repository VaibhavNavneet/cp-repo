import java.util.*;
public class A_Reverse_a_Substring {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        String s=in.nextLine();
       
        int i=0;int j=1;
        while(j<n)
        {   
            String ch1=s.charAt(i)+"";
            String ch2=s.charAt(j)+"";

            if(ch1.compareTo(ch2)<=0){
                i++;
                j++;
            }
            else
            {
                
                break;
            }
            

        }
        if(j!=n)
        {
            System.out.println("YES");
            System.out.println((i+1) +" "+(j+1));
        }
        else
        System.out.println("NO");
    }
}