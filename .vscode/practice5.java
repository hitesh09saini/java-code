import java.util.Scanner;

public class practice5 {

    
    public static String name(int a) {
       
       String sr ;
        if(a>=18){
          sr = "eligible to vote";
        }else{
            sr ="not eligible to vote";
        }
        return sr;
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int a =s.nextInt();
      System.out.println(name(a));

    }
}
