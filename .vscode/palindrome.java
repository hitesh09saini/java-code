import java.util.Scanner;
public class palindrome{
public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int q =s.nextInt();
    int a=q;
int r=0;
    while(a>0){
int p = a%10;
 r = r*10+p;

a = a/10;
    }



if(r==q){
System.out.println(r+" number is palindrome ");

}else{
    System.out.println(r+"number is not palindrome");
}

}
}