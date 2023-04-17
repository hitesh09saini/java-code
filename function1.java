import java.util.Scanner;
public class function1 {
     public static  int addition(int a ,int b){
int sum = a+b;
return sum;
    }
    public static void main(String[]args){
Scanner sc = new Scanner(System.in);
int b = sc.nextInt();
int a = sc.nextInt();
int sum = addition(a,b);
System.out.println("sum of two numbers :" + sum);
    }
}
