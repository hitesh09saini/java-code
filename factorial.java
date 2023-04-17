import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        System.out.println("enter the number:");
Scanner p = new Scanner(System.in);
int n = p.nextInt();
int f=1;

if(n==0){


}else {
    while(n>0){
       f = n*f;
n = n-1;

System.out.println( f);
    }

}
System.out.println("factorial of given number :" +f);

    }
}
