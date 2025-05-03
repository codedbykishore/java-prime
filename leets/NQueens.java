
public class NQueens {
    public static void main(String[] args) {
        int n = 4;

        // create a grid
        char[][] grid = new char[n][n];
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                grid[r][c] = '_';
            }
        }

        int res = 0;
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                if (solve(grid, r, c)) {
                    res++;
                }
            }
        }

        printGrid(grid);
        System.out.println("Number of possible solutions: " + res);

        return;
    }

    public static void solve(char[][] grid, int r, int c) {
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
