package Arrays;

import java.util.Arrays;

public class Q08_RearrangeElements {

    // Rearrange when equal numbers of +ve and -ve elements are there in array
    public static int[] rearrangeElements(int[] nums) {
        int[] arr = new int[nums.length];
        int pos = 0;
        int neg = 1;

        for (int num : nums) {

            if (num >= 0) {
                arr[pos] = num;
                pos += 2;
            } else {
                arr[neg] = num;
                neg += 2;
            }
        }
        return arr;
    }

    // Rearrange when numbers of +ve and -ve elements are not equal in the array
//    public static int[] rearrangeElements2(int[] nums) {
//
//    }

    public static void main(String[] args) {
        int[] arr = {-1, 1};
        System.out.println(Arrays.toString(rearrangeElements(arr)));

        int[] arr2 = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8};
        System.out.println(Arrays.toString(rearrangeElements2(arr2)));
    }
}
