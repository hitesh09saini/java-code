public class recursion3 {

    public static boolean map[] = new boolean[25];

    public static void removeduplicates(String str ,int inx ,String news ){
        if(inx==str.length()){
            System.out.println(news);
            return;

        }
        char cu= str.charAt(inx);
        if(map[cu-'a']==true){
            removeduplicates(str, inx+1, news);

        }else{
            news += cu;

            map[cu-'a']=true;
            removeduplicates(str, inx+1, news);

        }
    }

    public static void main(String[] args) {
        String str = "sddfrfrrse";
        removeduplicates(str, 0, "");

    }
    
}
