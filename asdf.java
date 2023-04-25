import java.util.*; 
class TestClass { 
    public static int countSteps(int[] a, int[] b,int size){
        
         int min=5001; 
         int count=0; 
         for(int i=0;i<size;i++) { 
            
            if(a[i]<min) { min=a[i]; } 
            
            } 
        for(int i=0;i<size;i++) { 
                
         while(a[i]>min && a[i]>=b[i]) { 
            a[i]-=b[i];
             count++;
            } 
        if(a[i]<min && a[i]>0) { 
                        
             min=a[i]; i=0; } 
                        
        if(a[i]<min && a[i]<=0) {
                 return -1; }  
                 
         } 
                             
        for(int i=0;i<size-1;i++) {
             if(a[i]!=a[i+1]) { 
                return -1; 
             } 
             } return count; 
} 
             
             
             public static void main(String args[] ) throws Exception {          Scanner sc=new Scanner(System.in); 
             int size=sc.nextInt(); 
             int[] a=new int[size]; 
             int[] b=new int[size]; 
             for(int i=0;i<size;i++) { 
                a[i]=sc.nextInt(); 
                } for(int i=0;i<size;i++) { 
                    b[i]=sc.nextInt(); 
                    } System.out.print(countSteps(a,b,size)); 
                    
                    }
                    
                     }
