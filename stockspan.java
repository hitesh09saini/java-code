import java.util.Stack;

public class stockspan {
    public static void stockSpan(int[] stock, int[] span) {
        Stack<Integer> s = new Stack<>();
       
        span[0] = 1;
        s.push(0);

        for (int i = 1; i < stock.length; i++) {
        
            while (!s.isEmpty() && stock[i] > stock[s.peek()]) {
                s.pop();
            }
            if (s.isEmpty()) {
                span[i] = i + 1;
            } else {
                span[i] = i - s.peek();
            } 
            s.push(i);
          

        }

    }

    public static void main(String[] args) {
        int stock[] = {  80,100 };
        int span[] = new int[stock.length];
       stockSpan(stock, span);

        for (int i = 0; i < stock.length; i++) {
            System.out.print(span[i]+" ");
        }
    }
}
