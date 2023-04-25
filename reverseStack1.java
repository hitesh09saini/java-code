import java.util.Stack;

public class reverseStack1 {

    public static void reverse(Stack<Integer> s) {
        if(s.isEmpty())return;

        int top = s.pop();

      
        reverse(s);
        pushbottom(s, top);
        
    }
    
    
    public static void pushbottom(Stack<Integer> s , int d) {
        if(s.isEmpty()) {
            s.push(d);
        return;
        }

        int t= s.pop();
        pushbottom(s, d);
        s.push(t);


    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        reverse(s);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }

    }
}
