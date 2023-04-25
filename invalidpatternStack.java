import java.util.Stack;

public class invalidpatternStack {

    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        String S = "()(";
        boolean b = true;
        char t = 0;
        for (int i = 0; i < S.length(); i++) {
            t = S.charAt(i);
            switch (t) {
                case '(':
                case '{':
                case '[':
                    stack.push(t);
                    break;
                case ')':
                    if (stack.isEmpty() || stack.pop() != '(') {
                        b = false;
                    }
                    break;
                case '}':
                    if (stack.isEmpty() || stack.pop() != '{') {
                        b = false;
                    }
                    break;
                case ']':
                    if (stack.isEmpty() || stack.pop() != '[') {
                        b = false;
                    }
                    break;

            }

        }
        if (!stack.isEmpty()) {
            b = false;
        }
        System.out.println(b);
    }

}