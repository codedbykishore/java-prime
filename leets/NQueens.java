
public class NQueens {
    public static void main(String[] args) {
        int n = 5;
        char[][] grid = new char[n][n];
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                grid[r][c] = '_';
            }
        }

        int[] res = new int[1];
        solve(grid, 0, res);
        System.out.println("Number of possible solutions: " + res[0]);
    }

    public static void solve(char[][] grid, int row, int[] res) {
        int n = grid.length;
        if (row == n) {
            printGrid(grid);
            res[0]++;
            return;
        }

        for (int col = 0; col < n; col++) {
            if (isSafe(grid, row, col)) {
                grid[row][col] = 'Q';
                solve(grid, row + 1, res);
                grid[row][col] = '_';
            }
        }
    }

    public static boolean isSafe(char[][] grid, int row, int col) {
        int n = grid.length;

        for (int i = 0; i < row; i++) {
            if (grid[i][col] == 'Q')
                return false;
        }

        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (grid[i][j] == 'Q')
                return false;
        }

        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (grid[i][j] == 'Q')
                return false;
        }

        return true;
    }

    public static void printGrid(char[][] grid) {
        for (char[] row : grid) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
