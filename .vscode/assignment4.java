    import java.util.Scanner;
     public class assignment4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in );
        int a=s.nextInt();
        int q = a;
        int r=0;

        while(a>0){
            int  p = a%10;
            r=r+p;
            a = a/10;
            
        }
System.out.println(r);

if(q%r==0){

    System.out.println(q+ "  number is divisible by the sum of its digits. ");
}else{
    System.out.println(q+" number is not divisible by the sum of its digits");
}
    }
}
