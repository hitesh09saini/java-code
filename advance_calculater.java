import java.util.Scanner;

public class advance_calculater {

    public static void sum(){
   
       
    
     int S =0;
     Scanner  s = new Scanner(System.in);
       
         


     int  a = s.nextInt();
     int  d = 1;
     while(d>0){
         char op    = s.next().charAt(0);
    
         int  b = s.nextInt();
        
     
          switch(op){
            
              case '+': System.out.println(S=a+b);
             break;
             case '-':
               S=a-b;
            
             System.out.println(S);
             break;
             case '/': 
                S=a/b;
            
             System.out.println(S);
             break;
             case '*':
             System.out.println(S=a*b);
             break;
             case '^':
             S = (int) Math.pow(a, b);
       
             System.out.println(S);

             break;


             default :System.out.println("aap galat ho beta");
             break;
            
            }
          a=S;     
        }
    }


   public static void factorial(){

      Scanner sc = new Scanner(System.in);
      System.out.println("enter a number:");
      int a= sc.nextInt();
      int f=1;
   
       if(a==0){


       }else{
             for(int i=a;i>=1;i--) {

             f=f*i;
             }
        }
        System.out.println("the result is :" +f);

        System.out.println(" continue guys ...");



    }

    public static void simple() {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter principal");
       int principal = sc.nextInt();
       System.out.println("enter rate");
       int rate =sc.nextInt();
       System.out.println("enter time");
       int time =sc.nextInt();
       int simple_interest ;

   
    
       simple_interest = (principal*rate*time)/100 ;
    
       System.out.println(simple_interest);


       System.out.println(" continue guys ...");
    
    }

    public static void root() {


      Scanner sc = new Scanner(System.in);
      System.out.println(" this formula is only this type  :  ax^2 + bx + c  ");
      System.out.println("a.....");
      float a=sc.nextInt();
      System.out.println("enter a value :" +a);
      System.out.println("b.....");
      float b=sc.nextInt();
      System.out.println("enter a value :" +b);  
      System.out.println("c.....");
      float c=sc.nextInt();
      System.out.println("enter a value :" +c);
      float D=0;
      float x =0;
      float A = 2*a;
      D = b*b - 4*a*c;
    
       if(D==0){
         System.out.println("the values of both the roots will be same");
    
         x = (-b+D)/A;
         System.out.println("value of real root :"+x);
        }else if(D>0){
          System.out.println("the roots will be unequal real roots");
         x = (-b+D)/A;
         x = (-b-D)/A;
         System.out.println("value of both root :"+x);
        }else {
         System.out.println("The equation has no real root");
        }


    

    }


    public static int display() {
      System.out.println("your need according tap key"     );

      System.out.println("simple interest : 1");

      System.out.println("sub/mult/div/addition/power : 2");

      System.out.println("factorial : 3");

      System.out.println("Real Root : 4 ");

      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      return a;
    }

    public static void main(String[] args) {
      int a = display();
      while(a>0){
            switch(a){

             case 1:
             simple();
             break;
             case 2:
             sum();
             break;
             case 3:
             factorial();
             break;
             case 4:
             root();
             break;
             
            }
            System.out.println();
            a = display();
        }
             
             
    }
      
}

