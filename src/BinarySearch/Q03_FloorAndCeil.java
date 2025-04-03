package BinarySearch;

import static BinarySearch.Q01_BinarySearchConcepts.lowerBound;

public class Q03_FloorAndCeil {

    public static int floor(int[] arr, int x) {
        int left = 0;
        int right = arr.length - 1;
        int ans = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if(arr[mid] <= x) {
                ans = arr[mid];
                left = mid + 1;
            }
            else right = mid - 1;
        }
        return ans;
    }

    public static int ceil(int[] arr, int x) {
        return arr[lowerBound(arr, x)];
    }

    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        System.out.println(ceil(arr, 25));
        System.out.println(floor(arr, 25));
    }
}
