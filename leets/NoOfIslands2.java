
public class NoOfIslands2 {

    public static void main(String[] args) {

        int[][] grid = {
                { 1, 1, 1, 1, 0 },
                { 1, 0, 1, 1, 0 },
                { 1, 0, 0, 1, 0 },
                { 0, 1, 0, 0, 1 },
        };

        int count = 0;
        int rows = grid.length;
        int cols = grid[0].length;

        printGrid(grid);
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (grid[r][c] == 1) {
                    count++;
                    dfs(grid, r, c);
                    printGrid(grid);
                }
            }
        }

        System.out.println("Number of islands: " + count);
    }

    public static void dfs(int[][] grid, int r, int c) {
        int rows = grid.length;
        int cols = grid[0].length;

        if (r < 0 || c < 0 || r >= rows || c >= cols || grid[r][c] == 0) {
            return;
        }

        grid[r][c] = 0;

        dfs(grid, r + 1, c);
        dfs(grid, r - 1, c);
        dfs(grid, r, c + 1);
        dfs(grid, r, c - 1);

        // dfs(grid, r + 1, c + 1);
        // dfs(grid, r - 1, c - 1);
        // dfs(grid, r - 1, c + 1);
        // dfs(grid, r + 1, c - 1);
    }

    public static void printGrid(int[][] grid) {
        for (int[] row : grid) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
