package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class PathsTest {

    // @Test
    // public void testCountPaths1() {
    //     Paths paths = new Paths();
    //     int n = 5;
    //     int[][] roads = {{0, 1, 4}, {0, 2, 7}, {1, 3, 2}, {2, 4, 1}, {3, 4, 5}};
    //     int result = paths.countPaths1(n, roads);
    //     int expected = 6;
    //     assertEquals(expected, result);
    // }

    // @Test
    // public void testCountPaths2() {
    //     Paths paths = new Paths();
    //     int n = 4;
    //     int[][] roads = {{0, 1, 2}, {1, 2, 1}, {2, 3, 3}};
    //     int result = paths.countPaths1(n, roads);
    //     int expected = 2;
    //     assertEquals(expected, result);
    // }

    // @Test
    // public void testCountPaths3() {
    //     Paths paths = new Paths();
    //     int n = 3;
    //     int[][] roads = {{0, 1, 1}, {1, 2, 2}, {0, 2, 3}};
    //     int result = paths.countPaths1(n, roads);
    //     int expected = 1;
    //     assertEquals(expected, result);
    // }

    @Test
    public void testCountPaths4() {
        Paths paths = new Paths();
        int n = 3;
        int[][] roads = {{0, 1, 1}, {1, 2, 1}, {0, 2, 1}};
        int result = paths.countPaths1(n, roads);
        int expected = 1;
        assertEquals(expected, result);
    }

    // @Test
    // public void testCountPaths5() {
    //     Paths paths = new Paths();
    //     int n = 2;
    //     int[][] roads = {{0, 1, 5}};
    //     int result = paths.countPaths1(n, roads);
    //     int expected = 0;
    //     assertEquals(expected, result);
    // }

    @Test
    public void testCountPaths6() {
        Paths paths = new Paths();
        int n = 1;
        int[][] roads = {};
        int result = paths.countPaths1(n, roads);
        int expected = 1;
        assertEquals(expected, result);
    }

    @Test
    public void testCountPaths7() {
        Paths paths = new Paths();
        int n = 4;
        int[][] roads = {{0, 1, 1}, {1, 2, 1}, {2, 3, 1}, {0, 3, 1}};
        int result = paths.countPaths1(n, roads);
        int expected = 1;
        assertEquals(expected, result);
    }

    @Test
    public void testCountPaths8() {
        Paths paths = new Paths();
        int n = 5;
        int[][] roads = {{0, 1, 1}, {1, 2, 1}, {2, 3, 1}, {3, 4, 1}};
        int result = paths.countPaths1(n, roads);
        int expected = 1;
        assertEquals(expected, result);
    }

    @Test
    public void testCountPaths9() {
        Paths paths = new Paths();
        int n = 3;
        int[][] roads = {{0, 1, 1}, {1, 2, 1}, {2, 0, 1}};
        int result = paths.countPaths1(n, roads);
        int expected = 1;
        assertEquals(expected, result);
    }

    // @Test
    // public void testCountPaths10() {
    //     Paths paths = new Paths();
    //     int n = 3;
    //     int[][] roads = {{0, 1, 1}, {1, 2, 1}, {2, 1, 1}};
    //     int result = paths.countPaths1(n, roads);
    //     int expected = 0;
    //     assertEquals(expected, result);
    // }
}

