package Arrays.Arrays1D;

import java.util.Arrays;

public class Q02_RotatingAndReversing {

    public static int[] reverseArray(int[] arr) {
        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }
        return arr;
    }

    public static void reverseArray(int[] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static int[] leftRotation(int[] arr, int k) {
        reverseArray(arr, 0, k-1);
        reverseArray(arr, k, arr.length-1);
        reverseArray(arr,  0, arr.length-1);
        return arr;
    }

    public static int[] rightRotation(int[] arr, int k) {
        reverseArray(arr,  0, k);
        reverseArray(arr, k+1, arr.length-1);
        reverseArray(arr, 0, arr.length-1);
        return arr;
    }

    public static int[] reverseInGroups(int[] arr, int k) {
        if (k == 1) return arr;
        if (k >= arr.length) return reverseArray(arr);

        for (int i = 0; i < arr.length; i+=k) {
            int left = i;
            int right = Math.min(i+k-1, arr.length-1);
            while (left < right) {
                int  temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        return arr;
    }

    public static void swap(int[] arr, int a, int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    // ----------------------- To be done again for revision -----------------------

    public static int[] sortInWave(int[] arr) {
        // Traverse all even elements
        for(int i = 0; i < arr.length; i+=2){
            //swap odd and even positions
            if(i > 0 && arr[i - 1] > arr[i])
                swap(arr, i, i-1);
            if(i < arr.length-1 && arr[i + 1] > arr[i])
                swap(arr, i, i+1);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {10, 90, 49, 2, 1, 5, 23};
        System.out.println(Arrays.toString(sortInWave(arr)));
    }
}
