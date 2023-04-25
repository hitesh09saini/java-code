import java.util.Scanner;

public class prectice6 {

    public static int squar(int x,int n) {
       int s = (int) Math.pow(x, n);

       return s;

    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x= s.nextInt();
        int n =s.nextInt();
        System.out.println(squar(x, n));

    }
}
