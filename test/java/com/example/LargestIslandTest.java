package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LargestIslandTest {

    @Test
    public void testLargestIsland1() {
        LargestIsland solution = new LargestIsland();
        int[][] grid = {
            {1, 1, 0, 0, 0},
            {1, 1, 0, 0, 1},
            {0, 0, 1, 1, 1},
            {0, 0, 1, 1, 0},
            {0, 1, 1, 0, 0}
        };
        int result = solution.largestIsland(grid);
        assertEquals(13, result);
    }

    @Test
    public void testLargestIsland2() {
        LargestIsland solution = new LargestIsland();
        int[][] grid = {
            {1, 0, 1, 0, 1},
            {0, 1, 0, 1, 0},
            {1, 0, 1, 0, 1},
            {0, 1, 0, 1, 0},
            {1, 0, 1, 0, 1}
        };
        int result = solution.largestIsland(grid);
        assertEquals(5, result);
    }

    @Test
    public void testLargestIsland3() {
        LargestIsland solution = new LargestIsland();
        int[][] grid = {
            {1, 0, 0, 0, 1},
            {0, 1, 0, 1, 0},
            {0, 0, 1, 0, 0},
            {0, 1, 0, 1, 0},
            {1, 0, 0, 0, 1}
        };
        int result = solution.largestIsland(grid);
        assertEquals(4, result);
    }

    @Test
    public void testLargestIsland4() {
        LargestIsland solution = new LargestIsland();
        int[][] grid = {
            {0, 0, 0},
            {0, 0, 0},
            {0, 0, 0}
        };
        int result = solution.largestIsland(grid);
        assertEquals(1, result);
    }
}