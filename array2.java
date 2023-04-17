import java.util.Scanner;

public class array2{
public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
     int a =sc.nextInt();
     int mark[]=new int[a];
     for(int j =0;j<a;j++){
        mark[j]=sc.nextInt();

     }
   
    int max=0;
    int min =0;
    for(int i =0;i<a;i++) {

        if(mark[i]>max){
            max=mark[i];
           
        }else if(mark[i]<min){
            min = mark[i];
        }
           
        }
        System.out.println("MAx  "+max);
        System.out.println("min "+min);

 }
    
     
    }



