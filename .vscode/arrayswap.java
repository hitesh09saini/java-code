public class arrayswap {
    
    public static void main(String[] args) {
        int a[]= {1,2,3,4,5};
       
        
       
         for(int i=0; i<a.length/2;i++){
            int st =i;
            int end = a.length-i-1;
            // swap
            int temp = a[st];
            a[st] = a[end];
            a[end] = a[temp];
            
          
         }
         
         for(int i :a)System.out.println(i);
      

    }
}
