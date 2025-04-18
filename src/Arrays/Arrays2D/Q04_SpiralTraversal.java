package Arrays.Arrays2D;

public class Q04_SpiralTraversal {

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}};

        int rows = arr.length;
        int cols = arr[0].length;

        int minRow = 0;
        int minCol = 0;
        int maxRow = arr.length - 1;
        int maxCol = arr[0].length - 1;

        int totalElements = rows * cols;
        int counter = 0;

        while (counter < totalElements) {
            // left box
            for (int i = minRow, j = minCol; i <= maxRow && counter < totalElements; i++){
                System.out.print(arr[i][j] + " ");
                counter++;
            }
            minCol++;

            // bottom box
            for (int j = minCol, i = maxRow; j <= maxCol && counter < totalElements; j++){
                System.out.print(arr[i][j] + " ");
                counter++;
            }
            maxRow--;

            // right box
            for (int i = maxRow, j = maxCol; i >= minRow && counter < totalElements; i--){
                System.out.print(arr[i][j] + " ");
                counter++;
            }
            maxCol--;

            // top box
            for (int j = maxCol, i = minRow; j >= minCol && counter < totalElements; j--){
                System.out.print(arr[i][j] + " ");
                counter++;
            }
            minRow++;
        }
    }
}
