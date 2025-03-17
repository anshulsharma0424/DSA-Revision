package Arrays;
import java.util.*;
public class Q02_MaximumProductOfTriplet {

    public static int maxProductA(int[] arr) {
        int n = arr.length;
        int max_product = Integer.MIN_VALUE;

        for (int i = 0; i < n - 2; i++)
            for (int j = i + 1; j < n - 1; j++)
                for (int k = j + 1; k < n; k++) max_product = Math.max(max_product, arr[i] * arr[j] * arr[k]);
        return max_product;
    }

    public static int maxProductB(int[] arr) {
            int n = arr.length;

            // Sort the array in ascending order
            Arrays.sort(arr);

            // Return the maximum of [product of last three elements, product of first two elements and last element]
            return Math.max(arr[0] * arr[1] * arr[n - 1], arr[n - 1] * arr[n - 2] * arr[n - 3]);
    }

    public static int maxProductC(int[] arr) {
        int n = arr.length;

        int maxA = Integer.MIN_VALUE, maxB = Integer.MIN_VALUE, maxC = Integer.MIN_VALUE;
        int minA = Integer.MAX_VALUE, minB = Integer.MAX_VALUE;

        for (int j : arr) {
            if (j > maxA) {
                maxC = maxB;
                maxB = maxA;
                maxA = j;
            } else if (j > maxB) {
                maxC = maxB;
                maxB = j;
            } else if (j > maxC) {
                maxC = j;
            }

            if (j < minA) {
                minB = minA;
                minA = j;
            } else if (j < minB) {
                minB = j;
            }
        }
        return Math.max(minA * minB * maxA, maxA * maxB * maxC);
    }


    public static void main(String[] args) {
        int[] arr = {1, -4, 3, -6, 7, 0};
        System.out.println(maxProductA(arr));
        System.out.println(maxProductB(arr));
        System.out.println(maxProductC(arr));
    }
}
