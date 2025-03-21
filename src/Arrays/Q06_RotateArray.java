package Arrays;

import java.util.Arrays;

public class Q06_RotateArray {

    public static int[] rotateArr(int[] arr, int d) {
        int n = arr.length;
        d = d % n; // Handle the case where d > size of array

        reverse(arr, 0, d - 1); // Reverse the first d elements
        reverse(arr, d, n - 1); // Reverse the remaining n-d elements
        reverse(arr, 0, n - 1); // Reverse the entire array

        return arr;
    }

    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(rotateArr(arr, 3)));
    }
}
