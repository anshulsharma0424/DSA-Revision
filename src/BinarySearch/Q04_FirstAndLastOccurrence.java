package BinarySearch;

import static BinarySearch.Q01_BinarySearchConcepts.lowerBound;
import static BinarySearch.Q01_BinarySearchConcepts.upperBound;

public class Q04_FirstAndLastOccurrence {

    public static int firstOccurrence(int[] arr, int x) {
        return lowerBound(arr, x);
    }

    public static int lastOccurrence(int[] arr, int x){
        return upperBound(arr, x) - 1;
    }

    // ============================================ Alternate method - by GFG ============================================

    // Function for finding last occurrence of x
    static int findLast(int[] arr, int x) {
        int n = arr.length;
        int low = 0, high = n - 1;
        int last = -1;

        while(low <= high) {
            int mid = (low + high) / 2;
            // If x is equal to arr[mid]
            if(x == arr[mid]) {
                last = mid;
                low = mid + 1;
            }
            // If x is less than arr[mid], then search in the left subarray
            else if(x < arr[mid])
                high = mid - 1;

                // If x is greater than arr[mid], then search in the right subarray
            else
                low = mid + 1;
        }
        return last;
    }

    // Function for finding first occurrence of x
    static int findFirst(int[] arr, int x) {
        int n = arr.length;
        int low = 0, high = n - 1;
        int first = -1;

        while(low <= high) {
            int mid = (low + high) / 2;
            // If x is equal to arr[mid]
            if(x == arr[mid]) {
                first = mid;
                high = mid - 1;
            }
            // If x is less than arr[mid], then search in the left subarray
            else if(x < arr[mid])
                high = mid - 1;

                // If x is greater than arr[mid], then search in the right subarray
            else
                low = mid + 1;
        }
        return first;
    }


    public static void main(String[] args) {
        int[]  arr = {2,4,6,8,8,8,11,13};
        int x = 9;

        // Approach-1 : Not recommended

        int countOccurrence = lastOccurrence(arr, x) - firstOccurrence(arr, x);
        if (countOccurrence < 0) System.out.println("The number 'X' doesn't exist");
        else {
            System.out.println(firstOccurrence(arr, x));
            System.out.println(lastOccurrence(arr, x));
            System.out.println(countOccurrence + 1);
        }

        System.out.println("========================================================================================");

        // Approach-2 : Expected approach

        System.out.println(findFirst(arr, x));
        System.out.println(findLast(arr, x));

        if (findFirst(arr, x) != -1) {
            System.out.println(findLast(arr, x) - findFirst(arr, x) + 1);
        }
        else System.out.println(0);
    }
}
