import java.util.Scanner;

public class different_pattern_printer {

    // THIS CODE FOR BUTTERFLY PATTERN

    public static void pattern1(String pattern1) {
        Scanner sc = new Scanner(System.in);
        System.out.println("good number for size of butterfly  is :  18");
        System.out.println("give the number for butterfly size :");
        int a = sc.nextInt();
        int i, f;

        System.out.println("BUTTERFLY :");
        for (i = 1; i <= a; i++) {

            for (f = 0; f < i; f++) {

                System.out.print("%");
            }

            for (f = a; f > i; f--) {

                System.out.print(" ");

            }
            for (f = a; f > i; f--) {

                System.out.print(" ");
            }
            for (f = 0; f < i; f++) {

                System.out.print("%");
            }

            System.out.println();
        }
        for (i = 1; i <= a; i++) {

            for (f = a; f > i; f--) {

                System.out.print("%");
            }
            for (f = 0; f < i; f++) {

                System.out.print(" ");
            }
            for (f = 0; f < i; f++) {

                System.out.print(" ");
            }
            for (f = a; f > i; f--) {

                System.out.print("%");
            }
            System.out.println();
        }

        return;

    }

    // THIS CODE FOR HEART PATTERN

    public static void pattern2(String pattern2) {

        int i, f, a = 5;

        for (i = 1; i <= a; i++) {
            for (f = 1; f <= a; f++) {

                System.out.print("$");
            }

            for (f = 1; f < a + 6; f++) {
                System.out.print(" ");
            }
            for (f = a + 1; f > i; f--) {

                System.out.print(" ");
            }
            for (f = 1; f <= i; f++) {

                System.out.print("$");
            }
            for (f = 1; f < a + 5; f++) {
                System.out.print("$");
            }
            for (f = 1; f <= i; f++) {

                System.out.print("$");

            }
            for (f = a + 1; f > i; f--) {

                System.out.print(" ");
            }
            for (f = a + 1; f > i; f--) {

                System.out.print(" ");
            }
            for (f = 1; f <= i; f++) {

                System.out.print("$");

            }
            for (f = 1; f < a + 5; f++) {
                System.out.print("$");
            }
            for (f = 1; f <= i; f++) {

                System.out.print("$");
            }
            for (f = a + 1; f > i; f--) {

                System.out.print(" ");
            }
            for (f = 1; f < a + 6; f++) {
                System.out.print(" ");
            }

            for (f = 1; f <= a + 2; f++) {

                System.out.print("$");
            }
            System.out.println();

        }

        for (i = 1; i <= a + 15; i++) {

            for (f = 1; f <= a; f++) {

                System.out.print("$");
            }
            for (f = 1; f < a + 6; f++) {
                System.out.print(" ");
            }
            for (f = 1; f <= i; f++) {

                System.out.print(" ");
            }
            for (f = a + 16; f > i; f--) {

                System.out.print("$");
            }
            for (f = a + 16; f > i; f--) {

                System.out.print("$");
            }
            for (f = 1; f <= i; f++) {

                System.out.print(" ");
            }
            for (f = 1; f < a + 6; f++) {
                System.out.print(" ");
            }
            for (f = 1; f <= a + 2; f++) {

                System.out.print("$");
            }
            System.out.println();

        }

        return;
    }

    // FOR TRIANGLE

    public static void pattern4(String pattern4) {
        Scanner A = new Scanner(System.in);
        System.out.println("enter the number for triangle size: ");
        int a = A.nextInt();
        int i, f;

        for (i = 1; i <= a; i++) {
            for (f = a + 1; f > i; f--) {

                System.out.print("  ");
            }
            for (f = 1; f <= i; f++) {

                System.out.print(" $");

            }
            for (f = 1; f < i; f++) {

                System.out.print(" $");

            }

            System.out.println();
        }

        return;
    }
    // for rectangular

    public static void pattern5(calc pattern5) {
        Scanner A = new Scanner(System.in);
        System.out.println(" enter the  size of rectangular");
        int a = A.nextInt();

        for (int i = 1; i <= a; i++) {
            for (int f = 1; f <= a+5; f++) {

                System.out.print(" $");
            }
            System.out.println();
        }
        return;
    }

    public static int display() {
        System.out.println("enter the key for print differant type of pattern");
        System.out.println(" For heart pattern key is : 1");
        System.out.println("For butterfly pattern key is : 2");
        System.out.println("for triangle pattern key is : 3");
        System.out.println("for rectangular pattern key is :4 ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        return x;
    }

    public static void main(String[] args) {
        int x = display();
        while (x < 6) {
            switch (x) {

                case 2:
                    pattern1(null);
                    break;

                case 1:
                    pattern2(null);
                    break;
                case 3:
                    pattern4(null);
                    break;
                case 4:
                    pattern5(null);

                default:
                    System.out.println("you are wrong baby next time try (bsdk dubhara wrong key mt dalna)");

                   

                    System.out.println(" >>>>>>  >>>>  >>> >> >  ");


System.out.println();
            }
            x = display();
           
        }
    }
}
