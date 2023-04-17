import java.util.Scanner;
import java.lang.Math;

public class Armstrong {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int t = num;
        int a = num;
        double power = 0;
        double sum = 0;
        do {
            num = num / 10;
            count++;
        } while (num > 0);
        do {
            t = a % 10;
            power = Math.pow(t, count);
            sum = sum + power;
            a = a/10;
        } while (a > 0);
        System.out.println(sum);
    }
}
