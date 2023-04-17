// without negative output calculator

import java.util.Scanner;

public class calc {
public static void main(String[]args){
   
    System.out.println("1=addition");
    System.out.println("2 = subtract");
    System.out.println(" 3 = divition");
    System.out.println("4= multiplication");

    Scanner sc =new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c ;
    int operators = sc.nextInt();

   
    switch(operators){
        
        case 1: System.out.println(c=a+b);
        break;
        case 2:if(a<b){             
            c=b-a;
        }else{
           c=a-b;
        }
        System.out.println(c);
        break;
        case 3: if(a<b){
            c=b/a;
        }else{
            c=a/b;
        }
        System.out.println(c);
         break;
         case 4:System.out.println(c=a*b);
         break;
         default :System.out.println("aap galat ho beta");
         break;


         
}
  
  }


}

