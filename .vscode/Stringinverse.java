import java.util.Scanner;

public class Stringinverse {
    public static void main(String[] args) {
        
Scanner sc = new Scanner(System.in);
String p = sc.nextLine();
StringBuilder s = new StringBuilder(p);

        for(int i =0 ; i<s.length()/2;i++){
            int front =i;
            int back = s.length()-1-i;

            char frontchar =s.charAt(front);
            char backchar = s.charAt(back);

         s.setCharAt(front , backchar); 

         s.setCharAt(back, frontchar);
         s.setLength(5);
         
        }

    
        System.out.println(s);
    }
}