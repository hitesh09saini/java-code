import java.util.Stack;

public class stringreverse {
    public static void main(String[] args) {
        Stack<Character> s = new Stack<>();
        
        String st ="hitesh";
        String n = "";

        for(int i=0;i<st.length();i++){
            s.push(st.charAt(i));
        }
        
        while(!s.isEmpty()){
            // System.out.print(s.peek());
            n +=s.peek();
            s.pop();
        }
        System.out.println(n);

        
    }
}
