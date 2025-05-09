
public class DiagonalMatrix {
    public static void main(String[] args) {
        // Uncomment one of these to run the corresponding test
        testDiagonal();
        // testBottomLeft();
        // testBottomRight();
    }

    public static boolean diagonal(int[][] grid, int r, int c) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if ((i == j && grid[i][j] == 0) || (i != j && grid[i][j] != 0)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean bottomLeft(int[][] grid, int r, int c) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < i; j++) {
                if (grid[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean bottomRight(int[][] grid, int r, int c) {
        for (int i = 0; i < r; i++) {
            for (int j = i + 1; j < c; j++) {
                if (grid[i][j] != 0) {
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

    public static void testDiagonal() {
        int[][] grid1 = {
                { 42, 0, 0, 0, 0 },
                { 0, 17, 0, 0, 0 },
                { 0, 0, 63, 0, 0 },
                { 0, 0, 0, 8, 0 },
                { 0, 0, 0, 0, 91 }
        };

        int[][] grid2 = {
                { 42, 1, 0, 0, 0 },
                { 0, 17, 0, 0, 0 },
                { 0, 0, 63, 0, 0 },
                { 0, 0, 0, 8, 0 },
                { 0, 0, 0, 0, 91 }
        };

        int[][] grid3 = {
                { 42, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0 },
                { 0, 0, 63, 0, 0 },
                { 0, 0, 0, 8, 0 },
                { 0, 0, 0, 0, 91 }
        };

        System.out.println(diagonal(grid1, 5, 5));
        System.out.println(diagonal(grid2, 5, 5));
        System.out.println(diagonal(grid3, 5, 5));
    }

    public static void testBottomLeft() {
        int[][] grid1 = {
                { 1, 0, 0, 0, 0 },
                { 0, 1, 0, 0, 0 },
                { 0, 0, 1, 0, 0 },
                { 0, 0, 0, 1, 0 },
                { 0, 0, 0, 0, 1 }
        };

        int[][] grid2 = {
                { 1, 0, 0, 0, 0 },
                { 5, 1, 0, 0, 0 },
                { 0, 0, 1, 0, 0 },
                { 0, 3, 0, 1, 0 },
                { 0, 0, 0, 0, 1 }
        };

        int[][] grid3 = {
                { 1, 0, 0, 0, 0 },
                { 0, 1, 0, 0, 0 },
                { 9, 0, 1, 0, 0 },
                { 0, 0, 0, 1, 0 },
                { 0, 1, 0, 0, 1 }
        };

        System.out.println(bottomLeft(grid1, 5, 5));
        System.out.println(bottomLeft(grid2, 5, 5));
        System.out.println(bottomLeft(grid3, 5, 5));
    }

    public static void testBottomRight() {
        int[][] grid1 = {
                { 1, 0, 0, 0, 0 },
                { 0, 1, 0, 0, 0 },
                { 0, 0, 1, 0, 0 },
                { 0, 0, 0, 1, 0 },
                { 0, 0, 0, 0, 1 }
        };

        int[][] grid2 = {
                { 1, 0, 2, 0, 0 },
                { 0, 1, 0, 0, 0 },
                { 0, 0, 1, 0, 0 },
                { 0, 0, 0, 1, 5 },
                { 0, 0, 0, 0, 1 }
        };

        int[][] grid3 = {
                { 1, 0, 0, 0, 0 },
                { 0, 1, 0, 0, 0 },
                { 0, 0, 1, 7, 0 },
                { 0, 0, 0, 1, 0 },
                { 0, 0, 0, 4, 1 }
        };

        System.out.println(bottomRight(grid1, 5, 5));
        System.out.println(bottomRight(grid2, 5, 5));
        System.out.println(bottomRight(grid3, 5, 5));
    }
}
