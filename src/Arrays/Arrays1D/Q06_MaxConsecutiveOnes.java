package Arrays.Arrays1D;

public class Q06_MaxConsecutiveOnes {

    public static int findMaxConsecutiveOnes(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int current = 0, max = 0;
        for (int num : nums) {
            if (num == 1) {
                current++;
            } else if (num == 0) {
                max = Math.max(max, current);
                current = 0;
            }
        }
        return Math.max(max, current);
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 0};
        System.out.println(findMaxConsecutiveOnes(arr));
    }
}
