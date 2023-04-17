import java.util.Scanner;

public class pattern1{
    public static void main(String[] args) {

        Scanner p = new Scanner(System.in);
        System.out.println("enter the number of row");
        int a= p.nextInt();
       

        int i;
        int f;


        for (i = 0; i <a; i++) {
          for (f = 0; f<a;f++) {
               System.out.print("@");
            }
          System.out.println();
       } 
        

for(i=1;i<=a;i++){

    for(f=a;f>i;f--){

        
        System.out.print(" ");
    }

    for(f=0;f<i;f++){
        
        
        System.out.print("g");
    }
    
    System.out.println();
    
    }  
     
  
   for(i=1;i<=a;i++){

        for(f=a;f>i;f--){
    
            
            System.out.print("%");
        }
    System.out.println();
    } 


   for(i=1;i<=a;i++){

        for(f=0;f<i;f++){
    
            
            System.out.print(" ");
        } 

        for(f=a;f>i;f--){
    
            
            System.out.print("%");
        }
        

System.out.println();


    } 

    }
}
