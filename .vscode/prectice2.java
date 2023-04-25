import java.util.Scanner;

public class prectice2 {
    public static void print(int n) {
        for(int i=0;i<=n;i++){
         
            
          // even 
          if(i%2==0)
            System.out.println(i);
          
          
          

        }
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        print(n);
        

    }
}
