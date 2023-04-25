import java.util.Scanner;

public class hackerrank3 {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int s=0;
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
           
            for(int j=0;j<n;j++){
              
              
               int q= (int) Math.pow(2 ,j);
               
                 s += q*b;
                 System.out.print(s+a+" ");
            } s=0;
            System.out.println();
        }
        in.close();
    }
}
