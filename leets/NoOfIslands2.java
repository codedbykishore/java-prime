public class NoOfIslands2 {

    public static void main(String[] args) {

        int[][] grid = {
                { 1, 1, 1, 1, 0 },
                { 1, 0, 1, 1, 0 },
                { 1, 0, 0, 1, 0 },
                { 0, 1, 0, 0, 1 }
        };

        int islands = 0;
        int rows = grid.length;
        int cols = grid[0].length;

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (grid[r][c] == 1) {
                    islands++;
                    dfs(grid, r, c);
                }
            }
        }

        System.out.println(islands);
        return;
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

        dfs(grid, r - 1, c - 1);
        dfs(grid, r + 1, c + 1);
        dfs(grid, r + 1, c - 1);
        dfs(grid, r - 1, c + 1);
    }
}
