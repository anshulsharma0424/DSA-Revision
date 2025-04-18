package Arrays.Arrays2D;

import java.util.Arrays;

public class Q02_MetricMultiplication {

    public static int[][] metricMultiply(int[][] arr1, int[][] arr2) {
        int[][] res = new int[arr1.length][arr2[0].length]; // taking arr1's row size and arr2's column size

        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                for (int k = 0; k < arr1.length; k++) {
                    res[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] arr1 = new int[][]{{1, 2, 3}, {4, 5, 6}};
        int[][] arr2 = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(Arrays.deepToString(metricMultiply(arr1, arr2)));
    }
}
