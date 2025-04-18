package Arrays.Arrays1D;

import java.util.Arrays;

public class Q05_MoveZerosToEnd {

    public static int[] moveZeroes(int[] nums) {
        int j=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=0){
                nums[j++]=nums[i];
            }
        }
        for(int i=j; i<nums.length; i++){
            nums[i]=0;
        }
        return nums;
    }

    public static int[] moveZeroes2(int[] arr) {
        // Pointer to track the position for next non-zero element
        int j = 0;

        for (int i = 0; i < arr.length; i++) {

            // If the current element is non-zero
            if (arr[i] != 0) {

                // Swap the current element with the 0 at index 'j'
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                // Move 'j' pointer to the next position
                j++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
        System.out.println(Arrays.toString(moveZeroes(arr)));
    }
}
