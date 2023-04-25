import java.util.Scanner;

public class spiralmatrix {
    // Spiral Matrix
    public static void spiral(int row, int column, int[][] arr) {
        int str = 0, enr = arr.length - 1;
        int sco = 0, eco = arr[0].length - 1;
        int i = 0;

        System.out.println(" hii>>>>");
        try {
            while (str <= enr && sco <= eco) {

                for (int a = sco; a <= eco; a++) { // ------>
                    System.out.print(arr[str][a] + " ");
                }
                for (int b = str + 1; b <= enr; b++) {
                    System.out.print(arr[b][eco] + " "); // |
                    
                }
                for (int a1 = eco - 1; a1 >= sco; a1--) {

                    System.out.print(arr[enr][a1] + " "); // <------
                }
                for (int b1 = enr - 1; b1 >= str + 1; b1--) {
                    System.out.print(arr[b1][sco] + " "); // ^
                }                                         // |

                enr--;
                eco--;
                str++;
                sco++;

            }
            System.out.println();

        } catch (Exception e) {

            System.out.println(" error here : " + e);

        }
    }

   

    // Array Input
    public static void matrix(int row, int column) {
        Scanner s = new Scanner(System.in);

        int arr[][] = new int[row][column];

        for (int r = 0; r < row; r++) {
            for (int c = 0; c < column; c++) {
                arr[r][c] = s.nextInt();
            }
        }
        spiral(row, column, arr);
    }

    // Main function
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int row = s.nextInt();
        int column = s.nextInt();

        matrix(row, column);

       
    }

}
