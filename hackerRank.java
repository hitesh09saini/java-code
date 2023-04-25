public class hackerRank {

    public static void main(String[] args) {
        
        int count = 0;
        int[] arr = { 1, -2, 4, -5, 1};

        try {
              
            for (int i = 0; i < arr.length; i++) {

                for (int j = i; j <arr.length; j++) {
                    int sum =0;
                    for (int k = i; k <=j; k++) {
                        sum += arr[k];
                       
                    }
                    if (sum < 0) {
                        count++;
                    }

                }

            }

            if (count != 0) {

                System.out.println(" >>>>" + count);
            } else {
                System.out.println("null");
            }

        } catch (Exception e) {
            System.out.println(" exception is :  " + e);
        }
    }
}
