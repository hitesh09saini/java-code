import java.util.Scanner;

public class bubblesorting {

    public static void print(int arr[]) {
        System.out.println("sorting ");
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i]+" ");
        }

    }

    public static void main(String[] args) {
        // input array
        Scanner s = new Scanner(System.in);
        System.out.println("enter the array size");
        int n = s.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the element of array");

        for (int m = 0; m < n; m++) {
            arr[m] = s.nextInt();
        }
        // for (int m = 0; m < n; m++) {
        //     System.out.print(arr[m]);
        // }
       // int arr[]={1,4,6,9,5};
        // sorting
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        print(arr);
    }
}
