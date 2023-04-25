import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class matrixlink {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
      
      List<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();

      // 1 row 
      List<Integer> p =new ArrayList();
      p.add(1);
      p.add(2);
      p.add(3);
     // 2row
      List<Integer> q =new ArrayList();
      q.add(4);
      q.add(5);
      q.add(6);

      // 3 row 
      List<Integer> r =new ArrayList();
      r.add(7);
      r.add(8);
      r.add(9);

      a.add((ArrayList<Integer>) p);
      a.add((ArrayList<Integer>) q);
      a.add((ArrayList<Integer>) r);

      System.out.println(a.get(2).get(0));


      

    }}