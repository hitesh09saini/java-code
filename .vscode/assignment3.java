
import java.util.Scanner;
public class assignment3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter heads");
        int heads=s.nextInt();
        System.out.println("enter legs ");
        int legs = s.nextInt();
int r,c;

if(legs%2!=0 || heads==0||heads>legs){
System.out.println("wrong ");

}else {
r= (legs+(-2*heads))/2;
c=heads-r;


System.out.println("rabbit  "+r+"chicken  "+c);
    }
}
}