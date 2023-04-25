import java.util.Scanner;

public class ghjh {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int N = s.nextInt();
        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
         if(N%2==0){
              if(N<5 &&N>=2){
                  System.out.println("Not Weird");
                  
              }else if(N>=6&&N<=20){
                  System.out.println(" Weird");
              }else if(N>20){
                  System.out.println("Not Weird");
              }
              
              
          }else{
              System.out.println("Weird");
          }

        
    }
}
