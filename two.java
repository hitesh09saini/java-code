import java.util.Scanner;

public class two {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int s= 0;
        if(a==b){
             s = a+b;

        }else{

            s =a*2+b*2;
        }
System.out.println(s);
    }
}
