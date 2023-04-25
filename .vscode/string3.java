import java.io.InputStreamReader;
import java.util.Scanner;

public class string3 {
    public static void main(String[] args) {

        Scanner s= new Scanner(System.in);
        
        String name1 = s.nextLine(),name2 =s.nextLine();
        if(name1.compareTo(name2)==0){
            System.out.println("equal");
        }else{
            System.out.println("not equal");
        }
    }
}
