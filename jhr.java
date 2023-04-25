import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class jhr {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        // String a[]={"()","(",")"};
     List<String>a = new ArrayList<>();

       for(int i=0;i<5;i++){
        String n=s.nextLine();
        a.add(n);
        System.out.println(a);
       }
      
        
        int c =0,b=0,d=0;
       
        
        for(int i=0;i<a.size();i++){
          if(a.get(i)=="()"){
            c++;
           
          }
          if(a.get(i)=="("){
           b++;
          }
          if(a.get(i)==")"){
          d++;
          }
          System.out.println(d+b+c);
        } 
        
    }
}
