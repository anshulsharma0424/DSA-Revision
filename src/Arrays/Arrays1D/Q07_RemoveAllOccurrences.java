package Arrays.Arrays1D;

public class Q07_RemoveAllOccurrences {

    public static int removeElement(int[] nums, int element) {
        int j=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != element) {
                nums[j++] = nums[i];
            }
        }
        return j;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 3, 0, 2, 2, 4, 2};
        System.out.println(removeElement(arr, 2));
    }
}
