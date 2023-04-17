


public class assignment {
        public static void main(String[] args) {

                int z = 0;
                int amount = 19;

                int a = 3;
                int b = 3;
                z = 1 * a + 5 * b;
                if (z < amount) {
                        z = z - amount;
                        System.out.println(z);
                } else {
                        int div = amount / 5;
                        z = amount - 5*b;
                        System.out.println("1$ needed amount = " + z);
                        System.out.println("5$ needed amount = " + div);
                }
        }
}
