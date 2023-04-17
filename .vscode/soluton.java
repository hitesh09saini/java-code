
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;



public class soluton{
    /**
     * @param args
     */
    public static void main(String[] args){
       Scanner s =new Scanner(System.in);

       int x=s.nextInt();
       double y =s.nextDouble();

      
      
    // int y=5;
    //    double x=3.145666;
    //    double su = Math.round(x*100)/100.0;
    //  System.out.println(su);
       if(x<y-0.50){
      
       if(x%5==0){
        
         double su = y-x-0.50;
         
           System.out.printf( "transection is succesfully ="+"%.2f",su);
           
       }else{
           
           System.out.println("Incorrect Withdrawal Amount(not multiple of )"+y);
           
       }
        
    }else{
        System.out.println("Insufficient Funds "+y);
    }
 }

}