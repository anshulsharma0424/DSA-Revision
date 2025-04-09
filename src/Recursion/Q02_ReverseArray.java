package Recursion;

import java.util.Arrays;

public class Q02_ReverseArray {

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void reverseArray(int[] array,  int start, int end) {
        if (start >= end) return;
        swap(array, start, end);
        reverseArray(array, start+1, end - 1);
    }

    public static void reverseArray(int[] array, int i) {
        if (i >= array.length/2) return;
        swap(array, i, array.length - i - 1);
        reverseArray(array, i + 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        reverseArray(arr, 0, arr.length - 1);
        for(int num: arr){
            System.out.print(num + " ");
        }
        System.out.println();

        reverseArray(arr, 0);
        for(int num: arr){
            System.out.print(num + " ");
        }
    }
}
