import java.util.Locale;
import java.util.Scanner;

public class currency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        // Write your code here.
         String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
    String india = NumberFormat.getCurrencyInstance(Locale.US).format(payment).replace( "$", "Rs." );;
    String china = NumberFormat.getCurrencyInstance(Locale.SIMPLIFIED_CHINESE).format(payment);
    String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
        
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
