import java.util.Scanner;

public class luckyno {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = a;
        int sum = 0;

        int count = 1;
        int t = a;
        do {
            t = a % 10;
            sum = 10 * sum + t;
            a = a / 10;
        } while (a > 0);
        // t = sum;
        a = sum;
        sum = 0;
        do {
            if ((count % 2) == 0) {
                t = a % 10;
                sum = t * t + sum;
            }
            a = a / 10;
            count++;
        } while (a > 0);
        if ((sum % 9) == 0) {
            System.out.println("The number " + b + " is a lucky number");
        } else {
            System.out.println("The number is not a lucky number");
        }
    }
}
