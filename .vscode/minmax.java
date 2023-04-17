public class minmax {
    public static void max(int []a,int max,int min,int in) {

        if(in==a.length-1){
            System.out.println("max = "+max);
            System.out.println("min = "+min);
            return;

        }

        if(a[in]>a[in+1]){

            max = a[in];
            min = a[in+1];

        }else{
            max =a[in+1];
            min = a[in];
        }
        max(a, max, min, in+1);

     
    }
    public static void main(String[] args) {
        
        int []a = {1,10,6,9,8};
        
        max(a, 0, 0, 0);

     
    }
}
