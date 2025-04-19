package Arrays.Arrays2D;

public class Q05_ExitPoint {
    public static void main(String[] args) {
        int[][] arr = {{0,0,1,0}, {1,0,0,1}, {0,0,0,1}, {1,0,1,0}};
        int rows = arr.length;
        int cols = arr[0].length;

        int dir = 0; // 0 -> E, 1 -> S, 2 -> W, 3 -> N
        int i = 0, j = 0;

        while (true){
            dir = (dir + arr[i][j]) % 4;

            if (dir == 0){
                j++;
            }
            else if (dir == 1){
                i++;
            }
            else if (dir == 2){
                j--;
            }
            else if (dir == 3){
                i--;
            }

            if (i<0){
                i++;
                break;
            }
            else if (j<0){
                j++;
                break;
            }
            else if (i == rows){
                i--;
                break;
            }
            else if (j == cols){
                j--;
                break;
            }

        }
            System.out.println(i + " " + j);
    }
}
