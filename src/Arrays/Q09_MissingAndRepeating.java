package Arrays;

import java.util.ArrayList;

public class Q09_MissingAndRepeating {

    public static ArrayList<Integer> missingAndRepeating(int[] arr) {
        int[] newArr = new int[arr.length+1];
        for (int i = 0; i < arr.length; i++) {
            newArr[arr[i]]++;
        }
        
        ArrayList<Integer> res = new ArrayList<>();
        
        for (int i = 1; i < newArr.length; i++) {
            if (newArr[i] != 1) res.add(i);
        }
        
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 6, 2, 1, 1};
        System.out.println(missingAndRepeating(arr));
    }
}
