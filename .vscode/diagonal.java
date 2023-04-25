import java.util.Scanner;

public class diagonal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int row = s.nextInt();
        int column = s.nextInt();
        int arr[][] = new int[row][column];

        for (int r = 0; r < row; r++) {
            for (int c = 0; c < column; c++) {
                arr[r][c] = s.nextInt();
            }
        }

      diagonalsum(arr);
    }
    //  diagonalsum(arr);
    public static void diagonalsum(int[][] arr) {
        int sum = 0;
        char c=' ';
        
        for (int i = 0; i <arr.length; i++) {
            int j=0;
          do{ 
             if(i==j){
                sum+=arr[i][j];
             
             System.out.print(c+" "+arr[i][j]+" ");
             }
            j++;
            if(i==j){
                c='+';

            }
          }while(j<arr.length);
          

        }
        System.out.println(": " + sum);

    }
}
