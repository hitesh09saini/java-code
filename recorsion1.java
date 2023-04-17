
import java.util.Scanner;

public class recorsion1 {
    public static int printk(int n,int m){

        if(n==m) {
            return n ;
        }
        System.out.println(n);

         return printk(n+1, m);
    }




    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        printk(n, m);
    }
}
