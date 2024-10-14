import java.util.*;
public class A_Two_Screens {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        in.nextLine();
        while(t-->0)
        {
            String s1=in.nextLine();
            String s2=in.nextLine();
            int count=0;
            for(int i=0;i<Math.min(s1.length(),s2.length());){
            if(s1.charAt(i)==s2.charAt(i)){
            count++;
            i++;}
            else
            break;
            }
            if(count==s1.length())
            s1="";
            else
            s1=s1.substring(count,s1.length());
            if(count==s2.length())
            s2="";
            else
            s2=s2.substring(count,s2.length());
            if(count>0)
            System.out.println(count+s1.length()+s2.length()+1);
            else
            System.out.println(count+s1.length()+s2.length());
        }
    }
}