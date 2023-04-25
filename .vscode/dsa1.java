import java.util.Scanner;

public class dsa1 {
   

    public static void maxmin(int a[]) {
        int j =0;
        int max =a[0];
        int min =a[0];
      
       
        for(int i =1;i<a.length;i++){
            
            if(a[i]>max){
                max=a[i];
            }
            if(a[i]<min){
                min=a[i];
            }
            }
       System.out.println(" max :  "+max+" min : "+min);
 
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
      int n=5;
    
      int []a = new int[n];
      for(int i=0;i<n;i++){
        a[i] =s.nextInt();
         }
      for(int i =0 ;i<n;i++){
       System.out.print("  "+a[i]);
      }

      maxmin(a);
      
    }
}
