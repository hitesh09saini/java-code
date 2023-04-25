import java.util.Scanner;

public class inverseString {
    
    //  int  m(int t) {
        
    //     String str ="hitesh";

    //     for(int i=str.length()-1;i>=0;i--){
    //         System.out.print( str.charAt(i));
    //     }
    //     int r =0;
         
      
    //     return t;
    // }
    public static void main(String args[] )  {
        Scanner s =new Scanner(System.in);
        String str = s.nextLine();
     boolean b = true;
    //  System.out.println( str.charAt(1));
      for(int i=0;i<(str.length()-1)/2;i++){
         char c= str.charAt(i);
        char l = str.charAt(str.length()-1-i);
         if(c!=l){
             b=false;
         }
 
        }
        System.out.println(b);
     }

   
}
