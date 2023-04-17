import java.util.Scanner;

public class gauss {
    
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int number = (int)(Math.random()*100);
       int a =0;
        do{
            
            System.out.println(" gauss one number between 1 to 100.");
             a = s.nextInt();
            

            if(a==number){
                System.out.println("woohoo .... you are choose curect number.");
                break;
            }else if(a>number){
                System.out.println("your number is large ");
            }else{
                System.out.println("your number is small");
            }


        }while(a>=0);

        System.out.println(number);
    }
}
