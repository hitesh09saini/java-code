public class h2{
    public static void name(int a ) {
      
        if(a==0){return ;}


        System.out.println(a);
       
        name(a-1);

       
        
        
    }
    public static void main(String[] args) {
        int a=5;
       
      name(a);
    }
}