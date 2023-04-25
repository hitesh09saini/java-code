public class reverse1 {
    public static void reverse(int a[]) {
        int s =0 ;int e = a.length -1;
        while(s<e){
            int t = a[e];
            a[e]=a[s];
            a[s]= t;
            s++;
            e--;
        }
        
    }
    public static void main(String[] args) {
        int b []= {1,2,7,9};
        reverse(b);
        for(int i =0;i<b.length;i++){
            System.out.print(b[i]+" ");
        }
    }
}
