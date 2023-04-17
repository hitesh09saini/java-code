import java.util.Scanner;

public class recorsion3 {

    public static int prink(int x,int n){
        if(n==0){
            return 1;

        }
        if(x==0){
            return 0;
        }
       
        int r= prink(x, n-1);
        int c = x*r;
        System.out.println(c);
        return c;


    }
    public static void main(String[] args) {
        // Scanner s= new Scanner(System.in);

        // int x=s.nextInt(),n=s.nextInt();
        int x=2,n=5;
        prink(x, n);
    }
}
