import java.util.Scanner;

public class ne {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int a = (int)(Math.random()*100);

        int b = s.nextInt();


        int result = a>b?a:b;

    
        System.out.println(result);
    }
}
