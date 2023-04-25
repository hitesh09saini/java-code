
import java.util.Arrays;
public class chocolatedistribution {
    
    public static void main(String[] args) {
        
        
        int a[]= {1,5,2,9,12,3,6};
        Arrays.sort(a);
        
       for(int i:a){
        System.out.print(i+" ");
       
       }
       
        int m = 2;
        int ans = Integer.MAX_VALUE;
        int min = 0;
        int max = 0;
        for(int i=0;i<a.length-m-1;i++){
                 min = a[i] ;
                max = a[m+i-1];
               int gap = max-min;
               if(gap<ans){
                ans = gap;
               }

        }System.out.println("> "+ans);

    }
}
