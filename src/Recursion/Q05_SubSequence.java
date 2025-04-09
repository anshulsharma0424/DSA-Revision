package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Q05_SubSequence {
    public static void printAllSubSequences(int[] nums, int index, List<Integer> current) {
        if (index == nums.length) {
            System.out.print(current + " "); // Print the current subsequence
            return;
        }

        // Include the current element
        current.add(nums[index]);
        printAllSubSequences(nums, index + 1, current);

        // Exclude the current element (backtrack)
        current.removeLast();
        printAllSubSequences(nums, index + 1, current);
    }

    public static void SubSequencesSum(int[] nums, int index, List<Integer> current) {
        if (index == nums.length) {
            System.out.print(current + " "); // Print the current subsequence
            return;
        }

        // Include the current element
        current.add(nums[index]);
        printAllSubSequences(nums, index + 1, current);

        // Exclude the current element (backtrack)
        current.removeLast();
        printAllSubSequences(nums, index + 1, current);
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 2};
        printAllSubSequences(arr, 0, new ArrayList<>());
    }
}
