package BinarySearch;

public class Q02_SearchInsertPosition {

    public static int searchInsertPosition(int[] nums, int number) {

        return Q01_BinarySearchConcepts.lowerBound(nums, number);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,7};
        System.out.println(searchInsertPosition(arr, 2));
    }
}
