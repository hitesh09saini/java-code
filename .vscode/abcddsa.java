public class abcddsa {

    public static void reveb(String s, int ind) {
        if (ind == 0) {

            System.out.println(s.charAt(ind));
            return;
        }
        System.out.print(s.charAt(ind));

        reveb(s, ind - 1);

    }

    public static void main(String[] args) {

        String s = "abcd";
        reveb(s, s.length()-1);

    }
}
