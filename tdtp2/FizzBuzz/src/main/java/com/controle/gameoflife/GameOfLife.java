package com.controle.gameoflife;
import java.util.Arrays;
public class GameOfLife {

    public GameOfLife(int rowCount, int columnCount) {
        grid = new int [rowCount][columnCount];
        this.rowCount = grid.length;
        this.columnCount = grid[0].length;
        initializeGridWithDeadCells();
    }

    public void initializeGridWithDeadCells(){
        for (int y = 0; y < this.rowCount; y++) {
            Arrays.fill(grid[y], DEAD_CELL);
        }
    }

    public void setLivingCell(int row, int column) {
        grid[row][column] = LIVING_CELL;
    }

    public int countlivingNeighbours(int row, int column) {

        int[][] cellsToCheck = {
                {row - 1, column - 1},
                {row - 1, column},
                {row - 1, column + 1},
                {row, column + 1},
                {row + 1, column + 1},
                {row + 1, column},
                {row + 1, column - 1},
                {row, column - 1},
        };

        int livingNeighbours = 0;

        int i = 0;
        while (i < cellsToCheck.length) {
            int rowToCheck = cellsToCheck[i][0];
            int colTocheck = cellsToCheck[i][1];

            if (isInTheGrid(rowToCheck, colTocheck) && isAlive(rowToCheck, colTocheck)) {
                livingNeighbours ++ ;
            }
            i++;
        }

        return livingNeighbours;
    }

    private boolean isInTheGrid(int row, int col) {
        return row >= 0 && col >= 0 && row < rowCount && col < columnCount;
    }

    public void computeNextGeneration() {
        int[][] nextGenerationGrid = new int[rowCount][columnCount];

        int y = 0;
        while (y < rowCount) {
           int x = 0;
           while (x < columnCount) {
                if (thisCellIsAliveAndHasLessThanTwoLivingNeighbours(y, x)) {
                    nextGenerationGrid[y][x] = DEAD_CELL;
                } else if (thisCellIsAliveAndHasTwoOrThreeLivingNeighbours(y, x)) {
                    nextGenerationGrid[y][x] = LIVING_CELL;
                } else if (thisCellIsAliveAndHasMoreThanThreeLivingNeighbours(y, x)) {
                    nextGenerationGrid[y][x] = DEAD_CELL;
                } else if (thisCellIsDeadAndHasThreeLivingNeighbours(y, x)) {
                    nextGenerationGrid[y][x] = LIVING_CELL;
                } else {
                    nextGenerationGrid[y][x] = grid[y][x];
                }
                x++;
            }
            y ++;
        }
        grid = nextGenerationGrid.clone();
    }

    private boolean thisCellIsDeadAndHasThreeLivingNeighbours(int row, int column) {
        int livingNeighbours = countlivingNeighbours(row, column);
        return isDead(row, column) && livingNeighbours == 3;
    }

    private boolean thisCellIsAliveAndHasMoreThanThreeLivingNeighbours(int row, int column) {
        int livingNeighbours = countlivingNeighbours(row, column);
        return isAlive(row, column) && livingNeighbours > 3;
    }

    private boolean thisCellIsAliveAndHasTwoOrThreeLivingNeighbours(int row, int column) {
        int livingNeighbours = countlivingNeighbours(row, column);
        return isAlive(row, column) && (livingNeighbours == 2 || livingNeighbours == 3);
    }

    private boolean thisCellIsAliveAndHasLessThanTwoLivingNeighbours(int row, int column) {
        int neighboursCount = countlivingNeighbours(row, column);
        return isAlive(row, column) && neighboursCount < 2;
    }

    public boolean isAlive(int row, int column) {
        return grid[row][column] == LIVING_CELL;
    }

    public boolean isDead(int row, int column) {
        return grid[row][column] == DEAD_CELL;
    }

    private int rowCount;
    private int columnCount;
    public int[][] grid;
    public static final int DEAD_CELL = 0;
    public static final int LIVING_CELL = 1;
}
