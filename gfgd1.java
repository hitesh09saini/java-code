/* You are given an array arr of n elements. In one operation you can pick two indices i and j, such that arr[i] >= arr[j] and replace the value of arr[i] with (arr[i] - arr[j]). You have to minimize the values of the array after performing any number of such operations. */

import java.util.Arrays;
import java.util.Scanner;

public class gfgd1 {

    public static int name(int[] arr, int n) {
        int min = 0;
        for (int j = 0; j < Integer.MAX_VALUE; j++) {
            Arrays.sort(arr); // {2,3,4} / {1,1,2} / {0,1,1} /{0,0,1}
            for (int i = 0; i < n - 1; i++) {
                if (arr[n - 2 - i] == 0) {
                    min = arr[n - 1 - i];
                    return min;

                }

                arr[n - 1 - i] = arr[n - 1 - i] - arr[n - 2 - i];

            } // { 2,1,1} /{1,0,1} / {0,1,0}
        }
        return 0;

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int arr[] = new int[n];
        for(int i =0;i<n;i++){
            arr[i]=s.nextInt();
        }
       
        System.out.println(name(arr, n));

    }
}
