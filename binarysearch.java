import java.lang.reflect.Array;
import java.util.Arrays;

public class binarysearch{
    public static void main(String[] args) {
        int []arr = {2,5,3,7,9,1,11,6};
        // 1,2,3,5,6,7,9,11
        int key = 6;
        int Start = 0;
        int end = arr.length-1;
        boolean result = false;
         Arrays.sort(arr);
        while(Start<=end){
              int mid = (Start + end )/2;
              
              if(arr[mid]==key){
                  result = true;
                  break;
              }
              if(arr[mid]<key){
                Start = mid+1;
              }
              if(arr[mid]>key){
                end = mid-1;
              }
        }
        if(true){
            System.out.println("yes found in array");
        }else{
            System.out.println("-1");
        }
    }
}