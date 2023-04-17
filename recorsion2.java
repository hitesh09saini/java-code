public class recorsion2 {


     public static void prinnk(int a,int b,int n){
        int sum=0;
        if(n==0){
        return;
          }
          int c = a+b;
          System.out.print(" "+c);

          prinnk(b, c, n-1);


    
     }
    public static void main(String[] args) {
        int a = 0,b=1,n=7;
        System.out.print(a+" "+b);

        prinnk(a,b,n-2);
    }
}
