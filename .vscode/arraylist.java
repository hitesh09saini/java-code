
import java.util.ArrayList;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class arraylist {
    

  public static void name(List<Integer>a) {
    
  }
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();

       // ArrayList<String> b = new ArrayList<String>();

      Scanner s = new Scanner(System.in);
      for(int i =0;i<5;i++){
        System.out.println("enter array  :");

        int n = s.nextInt();

     //add element
     a.add(n);
     
      


     System.out.println("for continue enter n<1000 and out the loop enter n>1000  :");
       i = s.nextInt();
      }
     System.out.println(a);

     // get element 

     System.out.println(" enter position of inx for find value :");
     int z = s.nextInt();
      int ge = a.get(z);
      System.out.println(ge);

     //add element b/w array

     System.out.println("enter index position :");
     int p =s.nextInt();
     System.out.println("enter value :");
     int q = s.nextInt();
      a.add(p, q);
     System.out.println(a);

     //set element
     System.out.println("enter index position :");
     int po =s.nextInt();
     System.out.println("enter value :");
     int qo = s.nextInt();
     a.set(qo, po);
     System.out.println(a);

     //delete element

     System.out.println("enter element :");
     int l=s.nextInt();
     
     a.remove(l);
     System.out.println(a);
     
     // size

     int size = a.size();
     System.out.println(size);

     // sorting

     Collections.sort(a);

     System.out.println(a);

     
     

    }
}
