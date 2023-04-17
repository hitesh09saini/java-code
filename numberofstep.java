import java.util.Scanner;

public class numberofstep {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.println("enter the nmber of time");
        int n = s.nextInt();
        System.out.println("enter the 1 array");
// input
        int a[]= new int[n];
        for(int i=0;i<n;i++){
               a[i] = s.nextInt();
          }
        System.out.println("enter the 2 array");

        int b[]= new int[n];
        for(int p=0;p<n;p++){
            b[p] = s.nextInt();
          }

          //print
        for(int j:a){
            System.out.println(j);
        }
        for(int x : b){
            System.out.println(x);
        }
    }
}
