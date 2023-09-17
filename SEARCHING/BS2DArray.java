// When the array is sorted row wise and column wise

import java.util.Arrays;

public class BS2DArray {
    public static void main(String[] args) {
        int[][] matrix = new int[][] {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 28, 29, 37, 49 },
                // { 33, 34, 38, 50, 60 }

        };
        System.out.println("Matrix Length  " + matrix.length);
        int[] ans = search(matrix, 49);
        System.out.println("Index: " + Arrays.toString(ans));

    }

    static int[] search(int[][] matrix, int target) {
        int r = 0;
        int c = matrix[r].length - 1;
        while (r < matrix.length && c >= 0) {
            if (matrix[r][c] == target) {
                return new int[] { r, c };
            }
            if (matrix[r][c] < target) {
                r++;
            } else {
                c--;
            }
        }

        return new int[] { -1, -1 };

    }
}
