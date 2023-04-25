import java.util.Scanner;


public class prob {
    
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int N =s.nextInt();
        int A[]=new int[N];
        for(int i=0;i<N;i++){
            A[i]=s.nextInt();
        }
        Solution p = new Solution();
       double e= p.minimumInteger(N, A);
        System.out.println(e); 
    }
}
class Solution {
    public int minimumInteger(int N, int[] A) {
        // code here
        int s=0,i=0;
        
            s =A[i]+s;
        
        int m=2;
        
            
        if(s==(A[i]*N)){
            m =A[i];
           
        }
        
       
        
    }
}