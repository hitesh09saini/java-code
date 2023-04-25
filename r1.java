public class r1 {
    public static int  name(int t ) {
        int c=0;
        if(t==0){
             
            return 1;
        }
           
         c=c+name(t);
       
        return  c;
          
    }
    public static void main(String[] args) {
        int t=5;
       int d= name(t);
       System.out.println(d);
    }
}
