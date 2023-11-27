package com.example;

// public class ShortestPathBinaryMatrixTest {
    
// }
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ShortestPathBinaryMatrixTest {
    @Test
    public void testShortestPathBinaryMatrix() {
        ShortestPathBinaryMatrix shortestPathBinaryMatrix = new ShortestPathBinaryMatrix();

        // Test case 1: Basic test
        int[][] grid1 = {
                {0, 0, 0},
                {1, 1, 0},
                {1, 1, 0}
        };
        int expected1 = 4;
        assertEquals(expected1, shortestPathBinaryMatrix.shortestPathBinaryMatrix(grid1));

        // Test case 2: No valid path
        int[][] grid2 = {
                {1, 0, 0},
                {1, 1, 0},
                {1, 1, 0}
        };
        int expected2 = -1;
        assertEquals(expected2, shortestPathBinaryMatrix.shortestPathBinaryMatrix(grid2));

        // // Test case 3: Single-cell grid
        // int[][] grid3 = {{0}};
        // int expected3 = 1;
        // assertEquals(expected3, shortestPathBinaryMatrix.shortestPathBinaryMatrix(grid3));

        // // Test case 4: Larger grid
        // int[][] grid4 = {
        //         {0, 0, 0, 0, 0},
        //         {1, 1, 0, 1, 1},
        //         {1, 1, 0, 1, 1},
        //         {0, 0, 0, 0, 0},
        //         {0, 1, 1, 1, 0}
        // };
        // int expected4 = 10;
        // assertEquals(expected4, shortestPathBinaryMatrix.shortestPathBinaryMatrix(grid4));
    }
}
