import java.util.Scanner;
import java.util.function.IntPredicate;

public class dostint {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        
        
       
        // first
        // int i = scan.nextInt();
        // double d =scan.nextDouble();
        // scan.nextLine();
        // String x= scan.nextLine();
        
        // second
        int i = Integer.parseInt(scan.nextLine());
         double d =Double.parseDouble(scan.nextLine());
        
        String x= scan.nextLine();

        
        System.out.println("String: " + x);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }

  
}
