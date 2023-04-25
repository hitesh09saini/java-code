import java.util.Scanner;

public class twonumsum {
    public static  void  Twosum(int []arr,int t) {
     int []a = new int[2] ;
     int ans =0;

     for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            ans =arr[i]+arr[j];


            if(ans==t){
                a[0]=i;
                a[1]=j;
                break;
            }
        }

     }
     for(int i=0;i<2;i++){
        System.out.println(a[i]);
    }

        
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("array length");
        int n =s.nextInt();
        System.out.println("target >>");
        int t=s.nextInt();
        System.out.println(" array no.  >");
        
        int []arr= new int[n];
        
      
        for(int i=0;i<n;i++){
            arr[i]= s.nextInt();
        }
        Twosum(arr, t);
       
      
       
    }
}
