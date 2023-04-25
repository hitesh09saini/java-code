import java.util.LinkedList;

public class link2 {
    
    public static void main(String[] args) {
        LinkedList<String> li =new LinkedList<>();

        li.addLast("hitesh");
        li.addFirst("am");
        li.addFirst("I");
        System.out.println(li);

        System.out.println(li.size());

        for(int i=0;i<li.size();i++){
            System.out.println(li.get(i));
        }

        li.remove(2);
        System.out.println(li);
        


        }
}
