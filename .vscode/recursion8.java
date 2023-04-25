public class recursion8 {

    public static int  calling(int n) {
     if(n<=1){
        return 1;
     }
        // single

         int single =calling(n-1);
        //pairs

         int pairs =  (n-1)*calling(n-2);

         return single+pairs;
    }
    
    public static void main(String[] args) {
        int n =4;
       System.out.println(calling(n));


    }
}
