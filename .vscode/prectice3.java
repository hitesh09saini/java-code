import java.util.Scanner;

//Write a function which takes in 2 numbers and returns the greater of those two
public class prectice3 {

    public static void name(int a ,int b) {
        if(a>b)System.out.println(a);
        else System.out.println(b);
        
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        name(a, b);
    }
}
