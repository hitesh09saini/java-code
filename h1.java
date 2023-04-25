

public class h1 {
    public static void main(String[] args) {
        
        String s="javahtml";
        int inx =s.length()-1;
        
        
        
        // for(int i=s.length()-1;i>=0;i--)System.out.print(s.charAt(i));

        
         name(s, inx, "");
    }

    public static void name(String s,int inx ,String w) {
       // based condition
        if(inx==-1){
            System.out.println(w);
            return;
        }

        // recalling
              w +=s.charAt(inx);

             name(s, inx-1, w);
       
    }
}
