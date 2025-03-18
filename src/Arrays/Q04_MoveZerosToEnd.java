package Arrays;

import java.util.Arrays;

public class Q04_MoveZerosToEnd {

    public static int[] moveZerosToEnd(int[] arr) {
        int j=0;
        for (int i=0; i<arr.length; i++){
            if (arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,0,4,3,0,5,0};
        System.out.println(Arrays.toString(moveZerosToEnd(arr)));
    }
}
