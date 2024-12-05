import java.util.Scanner;

public class B_Transfusion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        
        while (t-- > 0) {
            int n = in.nextInt();
            long[] arr = new long[n];
            long sum = 0;
            
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextLong();
                sum += arr[i];
            }
            
            if (sum % n != 0) {
                System.out.println("NO");
            } else {
                long target = sum / n;
               

                for (int i = 1; i < n-1; i++) {
                    long req=arr[i-1]-target;
                    arr[i+1]+=req;
                    arr[i-1]=target;
                }int flag=0;
                for(int i=0;i<n;i++)
                {
                    if(arr[i]!=target){
                    flag=1;
                    break;
                    }
                  

                }
                if(flag==0)
                System.out.println("YES");
                else
                System.out.println("NO");
                
                
            }
        }
        
        in.close();
    }
} 