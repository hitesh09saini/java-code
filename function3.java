import java.util.Scanner;

public class function3 {

public static int  multiplication(int a ,int b){

    int mult = a*b;


return mult;


}



    public static void main(String[] args) {
Scanner p = new Scanner(System.in);
int a = p.nextInt();
int b= p.nextInt();
int mult = multiplication(a,b);
System.out.println("multiplication of a and b :"+mult);
    }
}
