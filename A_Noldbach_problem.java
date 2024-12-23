import java.util.*;
public class A_Noldbach_problem {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int k=in.nextInt();
        boolean isPrime[]=new boolean[n+1];
        Arrays.fill(isPrime,true);
        isPrime[0]=isPrime[1]=false;

        for(int i=2;i<=n;i++)
        {
            if(isPrime[i] && (long)i*i<=n)
            for(int j=i*i ; j<=n;j+=i)
            isPrime[j]=false;

        }
        int count=0;
        int prev=2;
        
        for(int curr=3;curr<=n;curr++)
        {
            if(isPrime[curr]==true){
                
            if(prev+curr+1<=n && isPrime[prev+curr+1]==true)
            count++;
            prev=curr;
            }
        }

        System.out.println(count>=k?"YES":"NO");
        in.close();
    }
    
}