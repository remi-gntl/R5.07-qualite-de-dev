package com.controle.gameoflife;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class GameOfLifeTest {
    @Test
    void foundsNoLivingNeighboursInAnEmptyGrid() {
        gameOfLife = new GameOfLife(4,8);
        int neighboursCount = gameOfLife.countlivingNeighbours(1, 4);

        Assertions.assertThat(neighboursCount).isZero(); // équivalent à assertThat(neighboursCount).isEqualTo(0);
    }

    @Test
    void foundsOneLivingNeighbour() {
        gameOfLife = new GameOfLife(4,8);
        gameOfLife.setLivingCell(0, 3);

        int neighboursCount = gameOfLife.countlivingNeighbours(1, 4);

        Assertions.assertThat(neighboursCount).isEqualTo(1);
    }

    @Test
    void foundsTwoLivingNeighbours() {
        gameOfLife = new GameOfLife(4,8);
        gameOfLife.setLivingCell(0, 3);
        gameOfLife.setLivingCell(0, 4);

        int neighboursCount = gameOfLife.countlivingNeighbours(1, 4);

        Assertions.assertThat(neighboursCount).isEqualTo(2);
    }


    @Test
    void foundsThreeLivingNeighbours() {
        gameOfLife = new GameOfLife(4,8);
        gameOfLife.setLivingCell(0, 3);
        gameOfLife.setLivingCell(0, 4);
        gameOfLife.setLivingCell(0, 5);

        int neighboursCount = gameOfLife.countlivingNeighbours(1, 4);

        Assertions.assertThat(neighboursCount).isEqualTo(3);
    }

    @Test
    void foundsFourLivingNeighbours() {
        gameOfLife = new GameOfLife(4,8);
        gameOfLife.setLivingCell(0, 3);
        gameOfLife.setLivingCell(0, 4);
        gameOfLife.setLivingCell(0, 5);
        gameOfLife.setLivingCell(1, 5);

        int neighboursCount = gameOfLife.countlivingNeighbours(1, 4);

        Assertions.assertThat(neighboursCount).isEqualTo(4);
    }

    @Test
    void foundsFiveLivingNeighbours() {
        gameOfLife = new GameOfLife(4,8);
        gameOfLife.setLivingCell(0, 3);
        gameOfLife.setLivingCell(0, 4);
        gameOfLife.setLivingCell(0, 5);
        gameOfLife.setLivingCell(1, 5);
        gameOfLife.setLivingCell(2, 5);

        int neighboursCount = gameOfLife.countlivingNeighbours(1, 4);

        Assertions.assertThat(neighboursCount).isEqualTo(5);
    }

    @Test
    void foundsSixLivingNeighbours() {
        gameOfLife = new GameOfLife(4,8);
        gameOfLife.setLivingCell(0, 3);
        gameOfLife.setLivingCell(0, 4);
        gameOfLife.setLivingCell(0, 5);
        gameOfLife.setLivingCell(1, 5);
        gameOfLife.setLivingCell(2, 5);
        gameOfLife.setLivingCell(2, 4);

        int neighboursCount = gameOfLife.countlivingNeighbours(1, 4);

        Assertions.assertThat(neighboursCount).isEqualTo(6);
    }


    @Test
    void foundsSevenLivingNeighbours() {
        gameOfLife = new GameOfLife(4,8);
        gameOfLife.setLivingCell(0, 3);
        gameOfLife.setLivingCell(0, 4);
        gameOfLife.setLivingCell(0, 5);
        gameOfLife.setLivingCell(1, 5);
        gameOfLife.setLivingCell(2, 5);
        gameOfLife.setLivingCell(2, 4);
        gameOfLife.setLivingCell(2, 3);

        int neighboursCount = gameOfLife.countlivingNeighbours(1, 4);

        Assertions.assertThat(neighboursCount).isEqualTo(7);
    }

    @Test
    void foundsHeightLivingNeighbours() {
        gameOfLife = new GameOfLife(4,8);
        gameOfLife.setLivingCell(0, 3);
        gameOfLife.setLivingCell(0, 4);
        gameOfLife.setLivingCell(0, 5);
        gameOfLife.setLivingCell(1, 5);
        gameOfLife.setLivingCell(2, 5);
        gameOfLife.setLivingCell(2, 4);
        gameOfLife.setLivingCell(2, 3);
        gameOfLife.setLivingCell(1, 3);

        int neighboursCount = gameOfLife.countlivingNeighbours(1, 4);

        Assertions.assertThat(neighboursCount).isEqualTo(8);
    }

    @Test
    void foundsThreeLivingNeighboursForTheTopLeftCornerCell() {
        gameOfLife = new GameOfLife(4,8);
        gameOfLife.setLivingCell(0, 1);
        gameOfLife.setLivingCell(1, 1);
        gameOfLife.setLivingCell(1, 0);

        int neighboursCount = gameOfLife.countlivingNeighbours(0, 0);

        Assertions.assertThat(neighboursCount).isEqualTo(3);
    }

    @Test
    void foundsThreeLivingNeighboursForTheBottomRightCornerCell() {
        gameOfLife = new GameOfLife(4,8);
        gameOfLife.setLivingCell(3, 6);
        gameOfLife.setLivingCell(2, 6);
        gameOfLife.setLivingCell(2, 7);

        int neighboursCount = gameOfLife.countlivingNeighbours(3, 7);

        Assertions.assertThat(neighboursCount).isEqualTo(3);
    }

    @Test
    void aCellWithFewerThanTwoNeighboursDies() {
        gameOfLife = new GameOfLife(4,8);
        gameOfLife.setLivingCell(0, 0);
        gameOfLife.setLivingCell(0, 1);

        gameOfLife.computeNextGeneration();

        Assertions.assertThat(gameOfLife.isDead(0,0)).isTrue();
    }

    @Test
    void aCellWithAtLeastTwoNeighboursLives() {
        gameOfLife = new GameOfLife(4,8);
        gameOfLife.setLivingCell(0, 0);
        gameOfLife.setLivingCell(0, 1);
        gameOfLife.setLivingCell(1, 1);

        gameOfLife.computeNextGeneration();

        Assertions.assertThat(gameOfLife.isAlive(0,0)).isTrue();
    }

    @Test
    void aCellWithMoreThanThreeNeighboursDies() {
        gameOfLife = new GameOfLife(4,8);
        gameOfLife.setLivingCell(1, 4);
        gameOfLife.setLivingCell(0, 3);
        gameOfLife.setLivingCell(0, 4);
        gameOfLife.setLivingCell(0, 5);
        gameOfLife.setLivingCell(1, 5);

        gameOfLife.computeNextGeneration();

        Assertions.assertThat(gameOfLife.isDead(1,4)).isTrue();

    }

    @Test
    void aDeadCellWithThreeNeighboursGetsAlive() {
        gameOfLife = new GameOfLife(4,8);
        gameOfLife.setLivingCell(0, 3);
        gameOfLife.setLivingCell(0, 4);
        gameOfLife.setLivingCell(0, 5);

        gameOfLife.computeNextGeneration();

        Assertions.assertThat(gameOfLife.isAlive(1,4)).isTrue();
    }

    @Test
    void testAnHandMadeGrid() {
        gameOfLife = new GameOfLife(4,8);
        gameOfLife.setLivingCell(1, 4);
        gameOfLife.setLivingCell(2, 3);
        gameOfLife.setLivingCell(2, 4);

        gameOfLife.computeNextGeneration();

        int [][] expectedGrid = new int[][]{
                {GameOfLife.DEAD_CELL, GameOfLife.DEAD_CELL, GameOfLife.DEAD_CELL, GameOfLife.DEAD_CELL, GameOfLife.DEAD_CELL, GameOfLife.DEAD_CELL, GameOfLife.DEAD_CELL, GameOfLife.DEAD_CELL},
                {GameOfLife.DEAD_CELL, GameOfLife.DEAD_CELL, GameOfLife.DEAD_CELL, GameOfLife.LIVING_CELL, GameOfLife.LIVING_CELL, GameOfLife.DEAD_CELL, GameOfLife.DEAD_CELL, GameOfLife.DEAD_CELL},
                {GameOfLife.DEAD_CELL, GameOfLife.DEAD_CELL, GameOfLife.DEAD_CELL, GameOfLife.LIVING_CELL, GameOfLife.LIVING_CELL, GameOfLife.DEAD_CELL, GameOfLife.DEAD_CELL, GameOfLife.DEAD_CELL},
                {GameOfLife.DEAD_CELL, GameOfLife.DEAD_CELL, GameOfLife.DEAD_CELL, GameOfLife.DEAD_CELL, GameOfLife.DEAD_CELL, GameOfLife.DEAD_CELL, GameOfLife.DEAD_CELL, GameOfLife.DEAD_CELL}
        };

        Assertions.assertThat(Arrays.deepEquals(gameOfLife.grid, expectedGrid)).isTrue();
    }

    private GameOfLife gameOfLife;

}
