public class kadane {
    public static void maximumkadane(int b[]) {
        // FOR POSITIVE NUMBER 
        int ms = Integer.MIN_VALUE;
        int cs =0;
        for(int i =0;i<b.length;i++){

            cs += b[i];
            if(cs<0){
                cs =0;
            }
              ms = Math.max(cs, ms);
           
        }
        // FOR NEGATIVE NUMBER 
        if(ms ==0){
        ms = Integer.MIN_VALUE;

        for(int i =0;i<b.length;i++){
            
                ms = Math.max(ms, b[0]);
            }
        }

        // PRINT 
        System.out.println(" maximum is : "+ms);
    }
    public static void main(String[] args) {
        int a[] ={-4,-5,-6};
        maximumkadane(a);
    }
}
