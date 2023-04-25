import java.util.Scanner;

public class unlimitedstring {
    public static void main(String[] args) {
     Scanner s =new Scanner(System.in);
    String str=s.nextLine();
    System.out.println("1 "+str);
    int n=2;
    while(s.hasNext())
    {
        System.out.println(n+" "+s.nextLine());
        n++;
    }
    }
}
