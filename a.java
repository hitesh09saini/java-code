import java.util.Scanner;

public class a {
    
   
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int  a = 0;
        do{
        System.out.println("enter your name");
        String name = s.nextLine();
        
      if(name.equals("ramesh")){
        a= 1;
      } else if(name.equals("hitesh")){
        a =2;
      }else if(name.equals("ujjwal")){
        a=3;
      }

switch(a){

    case 1:
     System.out.println(" hii ramesh here is your password = 1111111111");
     break;
    case 2:
     System.out.println(" hii hitesh here is your password = 0000000000");
     break;
    case 3:
     System.out.println("hii ujjwal here is your password = 2222222222"); 
     break;
    default :
      System.out.println("error 404");


}
}while(a<0);  
}
}