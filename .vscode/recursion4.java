public class recursion4 {

    public static void subsequence(String str,String news,int inx){

        if(inx == str.length()){
            System.out.println(news);
            return;
        }
        char cu = str.charAt(inx);
        // to be 
        subsequence(str, news+cu, inx+1);

        // not to be
         subsequence(str, news, inx+1);

    }

        public static void main(String[] args) {
            String str = "aaa";
            subsequence(str, "", 0);
        }
}
