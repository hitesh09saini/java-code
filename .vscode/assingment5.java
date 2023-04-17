
import java.util.Scanner;




 public class assingment5 {
    public static void main(String[] args) {
Scanner s = new Scanner(System.in);
System.out.println(" enter the number ");
int a = s.nextInt();
System.out.println(" enter the seed number ");
int b = s.nextInt();

if(a%b==0){
System.out.println(b+" is a seed of"+a);

}else {
    System.out.println(b+" is not  seed of"+a);
}

    }
}
