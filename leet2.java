import java.util.Arrays;

public class leet2 {
    
    public static void main(String[] args) {
        int []nums ={3,5,2,4};
        
        Arrays.sort(nums);
   
        int mid=(nums.length+1)>>1;
      
        int low=0;
        int cnt=0;
        while(mid<nums.length){
            if(nums[mid]>=((nums[low])<<1)){
                low++;
                cnt+=2;
            }
            mid++;
        }
       System.out.println(cnt);
    }
}
