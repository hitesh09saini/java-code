public class permitation {

    public static void tracing(String str,int inx,String nstr) {
        if(str.length()==0){
          System.out.println(nstr);
            return;
        }


     for(int i =0;i<str.length();i++){

        char cu = str.charAt(i);

       String set =  str.substring(0, i)+str.substring(i+1);

       tracing(set, inx+1, nstr+cu);
     }

    }


    public static void main(String[] args) {
        String str ="abc";
        tracing(str, 0, "");
    }
}
