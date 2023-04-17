import java.net.Socket;

public class occurance {

    public static int first = -1;
    public static int last =-1;
    
    public static void printf(String st,int inx,char element ){

       
        if(inx ==st.length()){
            System.out.println(first+"    first");
            System.out.println(last+"    last ");
            return;


        }
       char cue = st.charAt(inx);
        if(cue==element){
          if( first==-1){
            first = inx;
        }else{
            last = inx;
        }
        
    }
    
printf(st, inx+1, element);
    }
    
    public static void main(String[] args) {
        String st="hhhaaaaahejao";

        printf(st, 0, 'a');

       

        
    }
}
