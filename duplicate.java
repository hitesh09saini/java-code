import java.util.Stack;

public class duplicate {
    public static boolean dupicate1(String str) {
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < str.length(); i++) {
             char c  = str.charAt(i);

            
            if(c==')'){
                int count = 0;
                while(stack.peek()!='('){
                  stack.pop();
                  count++;
                }
                if(count<1){
                    return true;
                }else{
                    stack.pop();
                }

            }else{
                stack.push(c);
            }

           
        }
        return false;
    }

    public static void main(String[] args) {
            System.out.println(dupicate1("(a+b(a+b))"));
    }
}
