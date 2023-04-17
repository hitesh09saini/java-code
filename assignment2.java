import java.util.Scanner;

public class assignment2{
public static void main(String[] args) {
 
 Scanner s=new Scanner(System.in);
 int a=s.nextInt();

 if(a%3==0){if(a%5==0){
   System.out.println("zoom");}

   else if(a%5==0){
      System.out.println("zap");
       }else if(a%3==0){
         System.out.println("zip");
         
       }else{
          System.out.println("invalid");}
       }else if(a%5==0){
System.out.println("zap");
 }else if(a%3==0){
   System.out.println("zip");
   
 }else{
    System.out.println("invalid");
 }
    

}

}