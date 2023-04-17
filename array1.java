import java.util.*;
public class array1 {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("enter row");
int row =  sc.nextInt();
System.out.println("enter columan");
int col = sc.nextInt();
        int mark[] = new int[row];
        int ma[]=new int[col];
        // mark[0]=1;
        // mark[1]=2;
        // mark[3]=5;
System.out.println("enter number");
for(int i= 0;i<row;i++){
for(int j =0;j<col;j++){
mark[j] = sc.nextInt();
}

    ma[i]= sc.nextInt();

}

System.out.println("output here");
         for(int i =0; i<row;i++){
            for(int j=0;j<col;j++){

            System.out.print(mark[j]);
            }
        System.out.println(ma[i]);
    }



        
    }
}
