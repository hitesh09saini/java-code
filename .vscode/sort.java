public class sort
 {
    public static boolean cheack(int a[],int inx){
        if(inx==a.length){
            return true;
        }
        if(a[inx]>=a[inx+1]){
            return false;
        }
            return cheack(a, inx+1);
        
    
    }
    public static void main(String[] args) {
        int []a ={1,3,3};
    
       System.out.println(cheack(a, 0));

    }
}
