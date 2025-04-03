package BinarySearch;

public class Q01_BinarySearchConcepts {

    public static int BinarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] < target) left = mid + 1;
            else if (nums[mid] > target) right = mid - 1;
        }
        return -1;
    }

    public static int lowerBound(int[] nums, int x) {
        int left = 0;
        int right = nums.length - 1;
        int ans = nums.length-1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] >= x){
                ans =  mid;
                right = mid - 1;
            }
            else left = mid + 1;
        }
        return ans;
    }

    public  static int upperBound(int[] nums, int x) {
        int left = 0;
        int right = nums.length - 1;
        int ans = nums.length-1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > x){
                ans = mid;
                right = mid - 1;
            }
            else left = mid + 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,3,5,8,8,9,10,10,11};
        System.out.println(BinarySearch(arr, 9));
        System.out.println(lowerBound(arr, 9));
        System.out.println(upperBound(arr, 9));

    }
}
