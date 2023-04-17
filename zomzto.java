import java.util.Scanner;



public class zomzto {
    public static void main(String[] args) {
        System.out.println(" veg. plate cost = 12$ // Non-veg. cost = 15$ ");
        System.out.println("veg. and non-veg. for press 1 and 2 key ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("enter the quantity of Food  :");
        int q=sc.nextInt();
        System.out.println("under 3km area no delivery charge after add second  3km add 1$ and remaining kms 2$ charge pay ;  ");
        System.out.println(" enter the distance in km :");
        int km = sc.nextInt();
        int cost =0;


        if(a==1){
 
            if(km==0){
                System.out.println(" invalide km");
                
            }

            else if(km<=3){
                cost = q*12;
            }else if(km==6){
cost =q*13;
            }else if(km>6){
                cost = q*17;
            }
        
            System.out.println("total amount :"+cost+"$");
        
          }else if(a==2){
            if(km==0){

                System.out.println("invalide km :");
            }

            else if(km<=3){
                cost = q*15;
            }else if(km==6){

                cost = q*16;
            }else if(km>6){
                cost = q*20;
            
            }
            System.out.println("total amount :"+cost+"$");
        }else{
            System.out.println("invalide number : -1");
            
        }
        
    }
}
