
import java.util.*;
public class stacklinked {
    
    static class stack{
      static ArrayList<Integer> list = new ArrayList<>();

// check empty
       public static boolean isempty() {
        return list.size()==0;
       }
// push     
       public static void push(int data){
         list.add(data);
       }
 /// pop
       public static int pop(){
        if(isempty()){
            return -1;
        }
          int top = list.get(list.size()-1);
          list.remove(list.size()-1);
          return top;
       }
 //// peek
       public static int  peek(){
        if(isempty()){
            return -1;
        }

        return list.get(list.size()-1);

       }
    }
    
    public static void name(stack s ,int k) {
      if(s.isempty()){
        s.push(k);

      }
      int top = s.pop();
      name(s, k);
      s.push(top);
      
    }

    public static void main(String[] args) {
    stack s = new stack();
    ArrayList<Integer>  t = new ArrayList<>();
    s.push(3);
    s.push(4);
    s.push(5);
    s.push(6);
 
    int k=1;
   
    
    
    while(!s.isempty()){
     System.out.println(s.peek());
    t.add( s.pop());
    }
    System.out.println(t);
    

 // inverse stack
    //  for(int i=0;i<t.size();i++){
      
    //   s.push(t.get(i));
     
    //  }

     // bottom 
  //    int i=t.size();
  //    System.out.println(t.size());
  //  do{
  //     s.push(k);
  //     k = t.get(i);
  //     i--;
  //  }while(i>=0);


    // print
   while(!s.isempty()){
    System.out.println(s.peek());
     s.pop();
     }
     
    }


}
