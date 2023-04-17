import java.util.Scanner;

public class bankloan {
    public static void main(String[] args) {
        System.out.println("welcome ICI BANK");
        System.out.println("are you interested in loan");
        Scanner A = new Scanner(System.in);
        String name = A.nextLine();

        if (name.equals("yes")) {

            System.out.println(" what type loan you want , option in below");
            System.out.println("home loan , car loan , business loan , ");
            String loan = A.nextLine();

            if (loan.equals("home loan")) {
                System.out.println(" HOME LOAN ");
                System.out.println(" WARNING :  ONLY CORRECT INFORMATION ");
                System.out.println(" account number : ");
                int a = A.nextInt();

                System.out.println(" ACCOUNT BALANCE :");
                int c = A.nextInt();
                System.out.println(" YOUR SALARY :");
                int b = A.nextInt();

                System.out.println(" loan amount expected : ");
                int d = A.nextInt();

                System.out.println("For how many days : ");
                int e = A.nextInt();
                if (b > 50000) {
                    if (d < 6000001) {
                        System.out.println("only eligible loan amount =  60,00,000");

                        System.out.println(" only eligible EMI = 60days");
                    } else {

                        System.out.println("maximum amount is 60,00,000");
                    }
                } else {
                    System.out.println("Your salary are below 50,000");
                    System.out.println("YOU ARE NOT ELIGIBLE ");
                }
            } else if (loan.equals("car loan")) {

                System.out.println(" CAR LOAN ");
                System.out.println(" WARNING :  ONLY CORRECT INFORMATION ");
                System.out.println(" Account number : ");
                int a = A.nextInt();

                System.out.println(" ACCOUNT BALANCE :");
                int c = A.nextInt();
                System.out.println(" YOUR SALARY :");
                int b = A.nextInt();

                System.out.println(" Loan amount expected : ");
                int d = A.nextInt();

                System.out.println(" EMI Expected : ");
                int e = A.nextInt();
                if (b > 25000) {
                    if (d < 500001) {
                        System.out.println("Only eligible loan amount =  5,00,000");

                        System.out.println(" Only eligible EMI = 36days");
                    } else {

                        System.out.println("Maximum amount is 5,00,000 ");
                    }
                } else {
                    System.out.println("Your salary are below 25,000");
                    System.out.println("YOU ARE NOT ELIGIBLE ");
                }

            } else if (loan.equals("Business loan")) {
                System.out.println(" BUSINESS LOAN ");
                System.out.println(" WARNING :  ONLY CORRECT INFORMATION ");
                System.out.println(" Account number : ");
                int a = A.nextInt();

                System.out.println(" ACCOUNT BALANCE :");
                int c = A.nextInt();
                System.out.println(" YOUR SALARY :");
                int b = A.nextInt();

                System.out.println(" Loan amount expected : ");
                int d = A.nextInt();

                System.out.println(" EMI expected : ");
                int e = A.nextInt();
                if (b > 75000) {
                    if (d < 7500001) {
                        System.out.println("Only eligible loan amount =  75,00,000");

                        System.out.println(" Only eligible emis = 84days");
                    } else {

                        System.out.println("Maximum amount is 75,00,000 ");
                    }
                } else {
                    System.out.println("Your salary are below 75,000");
                    System.out.println("YOU ARE NOT ELIGIBLE ");
                }

            }

            else {
                System.out.println("ERROR 404");
                System.out.println("This type of loan is NOT available");

                System.out.println("Only type in small charaters ");
                System.out.println("Only type available option ");
            }

        } else if (name.equals("No")) {
            System.out.println(" Thanking you");
        } else {
            System.out.println("ERROR 404");
            System.out.println("Only type in small charaters ");
            System.out.println("Type only Yes and No");

        }

    }

}
