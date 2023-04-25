import java.util.Scanner;

public class GST{

public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
     
    float a = s.nextFloat();
    float b = s.nextFloat();
    float c = s.nextFloat();
    float e = a+b+c;
    float d = (float) (e*(0.18));
     
    System.out.println(" GST "+d);

     System.out.println(" >  "+(e+d));

    
    
}

}