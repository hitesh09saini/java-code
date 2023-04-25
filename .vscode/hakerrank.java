
import java.util.ArrayList;
import java.util.Scanner;

public class hakerrank {
    /**
     * @param args
     */
    public static void main(String[] args) {
      ArrayList<Integer>arr = {-4,3,-9,0,4,1};

      int  a[] = {-4,3,-9,0,4,1};
      int l = a.size;
      double p =0;
      double b =0;
      double n =0;
      int e = l;
       
      for(int i=0;i<e;i++){
        
       if(a[i]>0){
        p++;
        
       }else if(a[i]==0){
        b++;

       }else if(a[i]<0){
        n++;
       }
       }
        
       System.out.println("positive "+p/l);
       
       System.out.println("negative "+n/l);

       System.out.println("equal "+b/l);
       


      

    }
}
