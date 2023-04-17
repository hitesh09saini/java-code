import java.io.*;
import java.util.Scanner;

public class StrongPwdhckrnk {
    static int minimumNumber(int n, String password) {
       int ret=0;
          boolean lower=false,capital=false,number=false,special=false;
          boolean count[]= {lower,capital,number,special};
          for(int i=0;i<password.length();i++) {
           if(count[0]!=true) 
            count[0] =Character.isLowerCase(password.charAt(i));
            if(count[1]!=true)
            count[1]=Character.isUpperCase(password.charAt(i));
            if(count[2]!=true)
            count[2]=Character.isDigit(password.charAt(i));
            if(count[3]!=true)
            count[3]=SpecialCharacter(password.charAt(i));
        }
             for(int i=0;i<count.length;i++) {
           if(count[i]==false) {
            ret++;
              } 
          } 
         if(ret+password.length()>6)
           return ret;
          else return ((6-password.length()));
              }
    public static boolean SpecialCharacter(char q) {
      if((q=='!')||(q=='@')||(q=='#')||(q=='$')||(q=='%')||(q=='^')||(q=='&')||(q=='*')||(q=='(')||(q==')')||(q=='-')||(q=='+'))
      return true;
     else return false;
     
    }

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int answer = minimumNumber(n, s);
        System.out.println(answer);
        in.close();
    }
}
