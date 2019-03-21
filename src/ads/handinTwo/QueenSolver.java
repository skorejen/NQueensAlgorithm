package ads.handinTwo;

import java.util.Arrays;
import java.util.Stack;

public class QueenSolver {

    private int[][] grid;
    private int queensNumber;
    private Stack<Integer> queenRows;
    private int solutions = 0;


    public QueenSolver(int queensNumber) {
        this.queensNumber = queensNumber;
        initalizeGrid(queensNumber);
        queenRows = new Stack<>();
    }

    public int getSolutions() {
        solve(0, 0);
        return solutions;
    }

    private boolean solve(int columnNumber, int row) {
        boolean flag= false;

        if (columnNumber >= grid.length) {
            solutions++;
            return true;
        }
        for (int i = 0; i < grid.length; i++) {
            if (grid[columnNumber][i] == 0) {
                if (isValid(columnNumber, i)) {
                    grid[columnNumber][i] = 1;
                    if (solve(columnNumber + 1, 0)) {
                       flag = !flag;
                    }
                    grid[columnNumber][i] = 0;
                }
            }
        }
        if(flag){
            return true;
        }
        return false;

    }

    /**
     * Check if the place is valid for a queen
     */
    private boolean isValid(int columnNumber, int row) {
        for (int i = columnNumber, up = row, down = row; i >= 0; i--, up--, down++) {
            if (grid[i][row] == 1) {
                return false;
            }
            if (up >= 0 && grid[i][up] == 1) {
                return false;
            }
            if (down < grid.length && grid[i][down] == 1) {
                return false;
            }
        }
        return true;
    }

    private void initalizeGrid(int queensNumber) {
        grid = new int[queensNumber][queensNumber];
        for (int i = 0; i < queensNumber; i++) {
            Arrays.fill(grid[i], 0);
        }
    }

    public String toString() {
        String retGridStr = "";
        for (int i = 0; i < grid.length; i++) {
            for (int a = 0; a < grid.length; a++) {
                retGridStr += grid[a][i] + " ";
            }
            retGridStr += "\n";
        }
        return retGridStr;
    }
}
