
import java.util.Scanner;

public class towerofhanoi{
    public static void tower(int n ,String s,String h,String d ){
        
        if(n==1){
            System.out.println("transfor disk "+n+" from "+s+" to "+d);          
           
            return;
        }

        
        tower(n-1, s, d, h);
      
        System.out.println("transfor disk "+n+" from "+s+" to "+d);
        tower(n-1, h, s, d);
        
        
        
    }

public static void main(String[] args) {
   Scanner s = new Scanner(System.in);

    System.out.print("enter the no. of disk : ");
        int n = s.nextInt();

        System.out.println();
tower(n, "S", "H", "D");
}


}