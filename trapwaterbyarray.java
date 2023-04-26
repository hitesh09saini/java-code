
public class trapwaterbyarray {

    public static void trap(int a[], int width) {
        int n = a.length;
        int[] right = new int[n];
        int[] left = new int[n];
        int trap = 0;
        // big of right
        right[n - 1] = a[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], a[i]);
        }

        // big of left
        left[0] = a[0];
        for (int j = 1; j < n; j++) {

            left[j] = Math.max(left[j - 1], a[j]);
        }

        // min of both
        for (int i = 0; i < n; i++) {
            int boundry = Math.min(left[i], right[i]);
            

            trap += (boundry - a[i]) * width;

        }
        System.out.println(" trap water :" + trap);
    }

    public static void main(String[] args) {
        int arr[] = { 4, 2, 6, 3, 2, 5 };

        int w = 2;
        trap(arr, w);
    }
}