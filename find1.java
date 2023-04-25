import java.util.Scanner;

public class find1{
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        // find the bits by get bit manipution
        int a=s.nextInt();
        int count=0;
        for(int i=0;i<8;i++){
            int mark = 1<<i;
            if((mark&a)!=0)count++;
    
        }   
        System.out.println(" 1 type of bits :"+count);

    }
        
       
}  