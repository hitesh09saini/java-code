public class immutable_string {
    
    
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("tony");
        System.out.println(sb.charAt(0));

        //set char at index 0
        sb.setCharAt(0, 'p');
        System.out.println(sb);

        sb.insert(2, 'n');
        System.out.println(sb);

        sb.delete(2, 3);
        System.out.println(sb);


        
    }
}
