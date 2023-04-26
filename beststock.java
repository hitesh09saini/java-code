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
        }
        System.out.println("max profit "+maxprofit);
    }
    public static void main(String[] args) {
        int a []= {7,1,5,3,6,4};
        Stock(a);
    }
}
