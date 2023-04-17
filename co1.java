import java.util.Scanner;

public class co1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();

        if(T>=1&&T<=1000){


            for(int i=1;i<=T;i++ ){
            int A =s.nextInt();
            int B = s.nextInt();

            if(A>=0&&A<=10000){
                if(B>=0&&B<=10000){
                    int ans = A+B;
                    System.out.println(ans);

                }

            }

        }
            
        }

    
    }
}
