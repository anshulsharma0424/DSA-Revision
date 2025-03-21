package Arrays;

import java.util.Arrays;

public class Q07_SortingInWave {
    public static void swap(int[] arr, int a, int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    // This function sorts arr[0..n-1] in wave form, i.e., arr[0] >= arr[1] <= arr[2] >= arr[3] <= arr[4]....
    public static int[] sortInWave(int[] arr, int n)
    {
        // Traverse all even elements
        for(int i = 0; i < n; i+=2){
            //swap odd and even positions
            if(i > 0 && arr[i - 1] > arr[i])
                swap(arr, i, i-1);
            if(i < n-1 && arr[i + 1] > arr[i])
                swap(arr, i, i+1);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {10, 90, 49, 2, 1, 5, 23};
        System.out.println(Arrays.toString(sortInWave(arr, arr.length)));
    }
}
