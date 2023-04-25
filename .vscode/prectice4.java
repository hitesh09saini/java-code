import java.util.Scanner;

//Write a function that takes in the radius as input and returns the circumference of a circle
public class prectice4 {
    public static int  name(int r) {
        int c = (int) ((2)*(3.14)*r);
        return c;


    }
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int r = s.nextInt();
        System.out.println(name(r));
    }
}
