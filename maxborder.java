import java.util.Scanner;

public class maxborder {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("input the number of time");
        int t = s.nextInt();
        int i = 0;
        while (i < t) {
            // input
            System.out.println("enter the row and columan");
            int a = s.nextInt(), b = s.nextInt();
             int p[][] = new int[a][b];

            System.out.println("enter elements");
            for (int n = 0; n < a; n++) {
                for (int m = 0; m < b; m++) {
                   System.out.println(p[n][m]='#');

                }
            }

            // print

            // for(int n=0;n<a;n++){
            // for(int m =0;m<b;m++){
            // System.out.print(p[n][m]+" ");

            // }
            // System.out.println(" ");
            // }
            max(a, b, p);

            i++;
        }
    }

    // max

    public static int max(int a, int b, int p[][]) {

        int[] rowMax = new int[a];
        int[] colMax = new int[b];
        for (int i = 0; i < a; i++) {
            int curr = 0;
            for (int j = 0; j < b; j++) {
                if (p[i][j] == 5) {
                    curr += 1;
                } else {
                    curr = 0;
                }
                rowMax[i] = Math.max(rowMax[i], curr);
            }
}
        for (int j = 0; j < a; j++) {
            int curr = 0;
            for (int i = 0; i < b; i++) {
                if (p[i][j] == 5) {
                    curr += 1;
                } else {
                    curr = 0;
                }
                colMax[j] = Math.max(colMax[j], curr);
            }
        }
        int max = 0, max1 = rowMax[0], max2 = colMax[0];
        for (int x = 1; x < b; x++) {
            if (rowMax[x] > max1) {
                max1 = rowMax[x];
            }
        }
        for (int y = 1; y < a; y++) {
            if (colMax[y] > max2) {
                max2 = colMax[y];
            }
        }
        max = Math.max(max1, max2);

        System.out.println(" max>>" + max);
        return max;

    }
}
