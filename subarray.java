public class subarray {
    public static void name(int a[]) {
        int c = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int s = 0;
        int st = 0, en = 0;

        for (int i = 0; i < a.length; i++) {
            int start = i;
            for (int j = i; j < a.length; j++) {
                int end = j;
                System.out.print(" [");
                for (int k = start; k <= end; k++) {
                    System.out.print(" " + a[k] + " ");
                    s += a[k];
                }
                max = Math.max(max, s);

                min = Math.min(s, min);
                s = 0;
                System.out.print("] ");
                c++;
            }
            System.out.println();
        }
        System.out.print("count of subarray : " + c + "\n[");

        for (int i = st; i <= en; i++) {
            System.out.print(" " + a[i] + " ");

        }
        System.out.print("] maximum  : " + max + "\nminimum  : " + min);
    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5, 6 };
        name(a);
    }
}
