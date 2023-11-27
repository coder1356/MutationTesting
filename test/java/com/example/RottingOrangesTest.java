package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RottingOrangesTest {
    @Test
    public void testOrangesRotting() {
        RottingOranges solution = new RottingOranges();

        // Test case 1
        int[][] grid1 = {
            {2, 1, 1},
            {1, 1, 0},
            {0, 1, 1}
        };
        assertEquals(4, solution.orangesRotting(grid1));

        // Test case 2
        int[][] grid2 = {
            {2, 1, 1},
            {0, 1, 1},
            {1, 0, 1}
        };
        assertEquals(-1, solution.orangesRotting(grid2));

        // Test case 3
        int[][] grid3 = {
            {0, 2}
        };
        assertEquals(0, solution.orangesRotting(grid3));

        // Test case 4
        int[][] grid4 = {
            {0}
        };
        assertEquals(0, solution.orangesRotting(grid4));

        // Test case 5
        int[][] grid5 = {
            {1, 1, 1},
            {1, 1, 1},
            {1, 1, 1}
        };
        assertEquals(-1, solution.orangesRotting(grid5));
    }
}
