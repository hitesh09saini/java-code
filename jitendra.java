public class jitendra{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        
        
        int N = 3;
        
        if(N%2==0){
            
            if(N>=2 && N<=5){
                System.out.println("not weird");
            }else if(N>=6 && N<=20 ){
                System.out.println("weird");
            }else if(N>20){
                System.out.println("not weird");
            }
            
        }else{
            System.out.println("weird");
            
        }
        
    }
}