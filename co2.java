import java.util.Scanner;

public class co2 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int T = s.nextInt();
        if(T>=1&&T<=1000){

            for(int i=1;i<=T;i++){
            int X=s.nextInt();
            int Y=s.nextInt();

            int A=s.nextInt();
            if(X>=20&&X<Y &&Y<=40){
                if(A>=10&&A<=50){
                    System.out.println("YES"); 
                }else{
                    System.out.println("NO");
                }


            }else{
                System.out.println("NO");
            }

        }


        }
    }
}
