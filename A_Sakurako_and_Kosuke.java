import java.util.*;
public class A_Sakurako_and_Kosuke {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0)
        {
            int n=in.nextInt();
            int i=1;
            int x=0;
            while(Math.abs(x)<=n)
            {
                
                if(i%2==0){
                x+=(2*i-1);
                i++;
                }
                else
                {
                    x-=(2*i-1);
                    i++;
                }
                if(Math.abs(x)>=n)
                break;
            }
            if(i%2==0)
            System.out.println("Kosuke");
            else
            System.out.println("Sakurako");
        }
    }
}