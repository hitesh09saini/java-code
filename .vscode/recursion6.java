public class recursion6 {
   
    public static  void permutation(String str,String ne){
    if(str.length()==0){
        System.out.println(ne);
        return;
    }
    for(int i =0;i<str.length();i++){
      
        char c = str.charAt(i);
     // abc -> ac
        String st = str.substring(0, i)+str.substring(i+1);

        permutation(st, ne+c);

    }

    }
    public static void main(String[] args) {
        String str = "abc";
        permutation(str, "");

    }
}
