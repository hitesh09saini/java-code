public class beststock {
    public static void Stock(int b[]) {
        int maxprofit =0;
        int bp = Integer.MAX_VALUE;
        for(int i=0;i<b.length;i++){
            if(bp<b[i]){
                int profit = b[i]-bp;
                maxprofit = Math.max(maxprofit, profit);
            }else{
                bp = b[i];
            }
        }System.out.println("max profit "+maxprofit);

        System.out.println("buy Stock : "+bp +" And selling on : "+(maxprofit+bp));
        
    }
    public static void main(String[] args) {
        int a []= {7,4,5,3,5,4};
        Stock(a);
    }
}
