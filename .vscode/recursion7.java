public class recursion7 {
// move right and downward in matrix.
    public static int count(int i,int j,int m,int n){

        if(i==n||j==m){
            return 0;
        }
        if(i==n-1&& j==m-1){
            return 1;
        }
        // move down
        int down= count(i+1, j, m, n);
        //move right
       int right = count(i, j+1, m, n);

        return down+right;

    }
    public static void main(String[] args) {
        int n =4,m=3;
        int type = count(0, 0, m, n);
        System.out.println(type);
    }
}
