import java.util.Stack;

public class bottommy {
    public static void bottom(Stack<Integer>s ,int k) {
        
        if(s.isEmpty()){
            s.push(k);
            return;
        }
        int top = s.pop();
       
        bottom(s, k);
        s.push(top);
        

    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
         s.push(1);
         s.push(2);
         s.push(3);
           int k =4;
           bottom(s, k);
          
         while(!s.isEmpty()){
            
            System.out.println(s.peek());
             s.pop();

           
         }
         
           
         }

        
         
        
    }

