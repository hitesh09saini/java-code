public class leet {
    public static void main(String[] args) {
        String word ="998244353";
        int m =3;
        int ans[]=new int[word.length()];
        long num=0;   
        for(int i=0;i<word.length();i++){
            int curr=word.charAt(i)-'0'; //  here '0' is convert string to
           
            num=(num*10+(curr))%m;
            if(num==0){
                ans[i]=1;
            }
            else
                ans[i]=0;
        }
        for(int i=0;i<word.length();i++){

            System.out.print(ans[i]+" ");
        }
        
    }
}
