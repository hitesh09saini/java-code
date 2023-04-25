import java.util.ArrayList;
import java.util.*;

public class recursio {
   
    // public static void printsubset(ArrayList<Integer>s){
    //  for(int i =0;i<s.size();i++){
       
    //    System.out.println(s);
    //  }
    // }
        
    public static void findsubset(int  n, ArrayList<Integer> s) {
        
        if(n==0){ 
            
         System.out.println(s);

        return;
        }
       // to be 
        s.add(n);
       findsubset(n-1, s);
      // not be
       s.remove(s.size()-1);
      findsubset(n-1, s);


    }


   
    public static void main(String[] args) {
        int n=3;
        ArrayList<Integer> s = new ArrayList<>();
     findsubset(n, s);
    }
}
