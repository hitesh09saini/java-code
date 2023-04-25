import java.util.Scanner;

public class cc2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
          int t =s.nextInt();
         
        while(t-->0){
            int c=0;
         int n  = s.nextInt();
	
         int []a = new int[n];
         for(int i =0;i<n;i++){
            a[i]=s.nextInt();
            if(a[i]>=1000){
                c++;
                }
                
         } 
         System.out.println(">>>"+c); 
        }
        
    }
}
