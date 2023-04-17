import java.util.Scanner;


public class first {
    public static void main(String []args){



Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();
int sum;
if(a<b){
  sum = a-b;

}else {
     sum = b-a;
}
System.out.print(sum);


    

}
}