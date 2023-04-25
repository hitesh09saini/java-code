public class tilepacement {

    public static int tile(int m,int n){

        if(){

            return 1;
        }
        
        //vertically placed
         int ver = tile(m-n, n);
        //horizontally placed
        int ho = tile(m-1, n);

        return ho+ver;
    }
    public static void main(String[] args) {
        int n =3,m=3;
        int plac =tile(m, n);
        System.out.println(plac);

    }
}
