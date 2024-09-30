	
import java.util.*;

// Compiler version JDK 11.0.2

class A_Zhan_s_Blender
{
  public static void main(String args[])
  { 
   Scanner in=new Scanner(System.in);
   int t=in.nextInt();
   while(t>0){
    int n=in.nextInt();
     int x=in.nextInt();
     int y=in.nextInt();
     int inside=0,sec=0;
     while(n>0 || inside>0)
     {
       inside+=Math.min(n,y);
       n-=inside;
       sec+=1;
       inside=inside>x?inside-x:0;
      }
     System.out.println(sec);
    t--;}
   
  }
}
