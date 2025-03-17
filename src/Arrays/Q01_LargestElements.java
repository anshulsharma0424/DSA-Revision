package Arrays;

import java.util.Arrays;

public class Q01_LargestElements {

    public static int largest(int[] arr) {
        int max = Integer.MIN_VALUE;

        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    public static int secondLargest(int[] arr){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i : arr){
            if (i > max) {
                secondMax = max;
                max = i;
            }
            if (i > secondMax && i < max) {
                secondMax = i;
            }
        }
        return secondMax;
    }

    public static int thirdLargest(int[] arr){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;

        for (int i : arr){
            if (i > max) {
                thirdMax = secondMax;
                secondMax = max;
                max = i;
            }
            if (i > secondMax && i < max) {
                thirdMax = secondMax;
                secondMax = i;
            }
            if (i > thirdMax && i < secondMax) {
                thirdMax = i;
            }
        }
        return thirdMax;
    }

    public static int nthLargest(int[] arr, int n){
        Arrays.sort(arr);
        return arr[n];
    }

    public static void main(String[] args) {
        int[] arr = {1, 14, 2, 16, 10, 20};
        System.out.println(largest(arr));
        System.out.println(secondLargest(arr));
        System.out.println(thirdLargest(arr));
        System.out.println(nthLargest(arr, 3));
    }
}
