package Arrays.Arrays1D;

public class Q01_LargestElements {

    public static int largestElement(int[] nums) {
        int max = nums[0];
        for (int i : nums){
            if(i > max) max = i;
        }
        return max;
    }

    public static int secondLargest(int[] nums) {
        int max = nums[0];
        int secondMax = Integer.MIN_VALUE;
        for (int i : nums){
            if (i > max){
                secondMax = max;
                max = i;
            }
            if (i > secondMax && i < max) secondMax = i;
        }
        return secondMax;
    }

    public static int thirdLargest(int[] nums) {
        int max = nums[0];
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;

        for (int i : nums){
            if (i > max){
                thirdMax = secondMax;
                secondMax = max;
                max = i;
            }
            else if (i > secondMax && i < max) {
                thirdMax = secondMax;
                secondMax = i;
            }
            else if (i > thirdMax && i < secondMax) {
                thirdMax = i;
            }
        }
        return thirdMax;
    }

    public static int maxProductTriplet(int[] nums){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;

        int min = Integer.MAX_VALUE;
        int secondMin =  Integer.MAX_VALUE;

        for (int i : nums){

            // Maximum and Second Maximum
            if (i > max){
                thirdMax = secondMax;
                secondMax = max;
                max = i;
            }
            else if (i > secondMax && i < max) {
                thirdMax = secondMax;
                secondMax = i;
            }
            else if (i > thirdMax && i < secondMax) {
                thirdMax = i;
            }

            // Minimum and Second Minimum
            if (i < min){
                secondMin = min;
                min = i;
            }
            else if (i < secondMin) secondMin = i;
        }

        return Math.max(max*secondMax*thirdMax, min*secondMin*max);
    }

    public static void main(String[] args) {
        int[] arr = {1, -4, 3, -6, 7, 0};
        System.out.println(largestElement(arr));
        System.out.println(secondLargest(arr));
        System.out.println(thirdLargest(arr));
        System.out.println(maxProductTriplet(arr));
    }
}
