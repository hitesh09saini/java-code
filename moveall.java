public class moveall {
     public static void movey(String st,int count ,int inx,String news) {

        if(inx==st.length()){
            for(int i=0;i<count;i++){
                news +='x';}

                System.out.println(news);
           
    
            return;
        }
         char cuch = st.charAt(inx);

        if(cuch=='x'){
            count++;
            movey(st, count, inx+1, news);
           
        }else{
           news += cuch;
           movey(st, count, inx+1, news);
            
        }
    }
    public static void main(String[] args) {
        String st ="axbxxcde";
        movey(st, 0, 0, "");
      
    }
}
