public class numberpyramid{
    public static void main(String[] args) {
        
        int count =0;
        for(int i =0;i<5;i++){
            for(int j = 5-i ;j > 0 ;j--){
                 System.out.print(" ");
            }
             count++;
            for(int j = 0 ;j<=i;j++){
                System.out.print(" "+count);
            }
            System.out.println();
        }
    }
}