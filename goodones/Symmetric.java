
public class Symmetric {

    public static void main(String[] args) {
        int[][] matrix = {
                { 2, 3, 6 },
                { 3, 4, 3 },
                { 6, 5, 9 }
        };

        display(matrix);
        System.out.println(isSymmetric(matrix, 3, 3));
    }

    public static boolean isSymmetric(int[][] matrix, int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < i; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void display(int[][] grid) {
        for (int[] row : grid) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
