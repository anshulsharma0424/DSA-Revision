package Arrays;

public class Q03_MaximumConsecutiveOnes {
    public static int maxConsecutiveCount(int[] arr) {
        if (arr.length == 0) return 0;

        int maxCount = 0, count = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
            } else {
                maxCount = Math.max(maxCount, count);
                count = 0;
            }
        }
        return Math.max(maxCount, count);
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1, 0};
        System.out.println(maxConsecutiveCount(arr));
    }
}
