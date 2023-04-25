import java.util.HashSet;


public class recursion5 {
    public static void subsequence(String str,String news,int inx,HashSet<String>set){

        if(inx == str.length()){
            System.out.println(news);
            return;
        }
        char cu = str.charAt(inx);
        // to be 
        subsequence(str, news+cu, inx+1, set);

        // not to be
         subsequence(str, news, inx+1, set);

    }

        public static void main(String[] args) {
            String str = "aaa";
            HashSet<String> set = new HashSet<>();
            subsequence(str, "", 0,set);
        }
}
