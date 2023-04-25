public class pairs {
    public static void name(int b[]) {
        for(int i =0;i<b.length;i++){
            for(int j =i+1;j<b.length;j++){
            
               System.out.print("  ("+b[i]+","+b[j]+") ");
            }System.out.println();
        }
    }
    public static void main(String[] args) {
        int a[]= {2,4,6,8,10};
        name(a);

    }
}
