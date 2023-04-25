import java.util.Scanner;

public class prectice1 {

    public static int  rint(int a,int b,int c) {
       int s = (a+b+c)/3;


    

        return s;

    }

    
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int a = s.nextInt();
        int b= s.nextInt();
        int c = s.nextInt();
      System.out.println(rint(a, b, c));
    }
}
