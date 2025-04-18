package Arrays.Arrays1D;

public class Q04_RemoveDuplicates {

    public static int removeDuplicates(int[] nums) {
        if(nums.length == 0 || nums.length == 1) return 0;
        int j=1;
        for(int i=1; i < nums.length; i++){
            if(nums[i] != nums[i-1]){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(arr));
    }
}
