import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class geeks {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int check =0;
        
        // input array 
        int []a = new int[4];
        List<Integer> b =new ArrayList<>();
        
        
        for(int i=0;i<a.length;i++){
            
            a[i]=s.nextInt();
            
        }
        
        // checking of array
        for(int i=0;i<a.length;i++){
            
            check+= a[i];
            
            if(check!=0){
                
                b.add(a[i]);
                
            }
            
        }
        System.out.println(b);



        
        
    }
    }

