public class keyword {

    public static String[] keyword1={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};


    public static void comb(String str,int inx,String combination){
       if(inx==str.length()){

        System.out.print(combination);

        return;
       }

       char c = str.charAt(inx);
       

       String mapping =  keyword1[c-'0'];

       for(int i =0;i<mapping.length();i++){

        comb(str, inx+1, combination+mapping.charAt(i));
       }

    }
    public static void main(String[] args) {
        String str = "2";
        comb(str, 0, "");


    }
}
