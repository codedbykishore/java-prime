
public class NQueensOptimized {

    public static void main(String[] args) {
        int n = 6;

        if (n < 4) {
            System.out.println("No solution exists for n < 4.");
            return;
        }

        int[] queens = new int[n];
        placeMyQueen(queens, 0);
    }

    public static void placeMyQueen(int[] queens, int row) {
        if (row == queens.length) {
            printSolution(queens);
            return;
        }

        for (int col = 0; col < queens.length; col++) {
            if (isSafe(queens, row, col)) {
                queens[row] = col;
                placeMyQueen(queens, row + 1);
            }
        }
    }

    public static boolean isSafe(int[] queens, int row, int col) {

        for (int i = 0; i < row; i++) {
            if (queens[i] == col) {
                return false;
            }

            if (i - row == queens[i] - col) {
                return false;
            }

            if (i - row == col - queens[i]) {
                return false;
            }
        }
        return true;
    }

    public static void printSolution(int[] queens) {
        for (int i = 0; i < queens.length; i++) {
            for (int j = 0; j < queens.length; j++) {
                if (j == queens[i]) {
                    System.out.print("Q ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
