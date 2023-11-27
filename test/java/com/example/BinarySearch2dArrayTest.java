package com.example;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class BinarySearch2dArrayTest {

    @Test
    public void testBinarySearch2dArrayMiddle() {
        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        int target = 6;

        int[] ans = BinarySearch2dArray.BinarySearch(arr, target);
        System.out.println(Arrays.toString(ans));
        assertEquals(1, ans[0]);
        assertEquals(1, ans[1]);
    }

    @Test
    public void testBinarySearch2dArrayMiddleSide() {
        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        int target = 8;

        int[] ans = BinarySearch2dArray.BinarySearch(arr, target);
        System.out.println(Arrays.toString(ans));
        assertEquals(1, ans[0]);
        assertEquals(3, ans[1]);
    }

    @Test
    public void testBinarySearch2dArrayUpper() {
        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        int target = 2;

        int[] ans = BinarySearch2dArray.BinarySearch(arr, target);
        System.out.println(Arrays.toString(ans));
        assertEquals(0, ans[0]);
        assertEquals(1, ans[1]);
    }

    @Test
    public void testBinarySearch2dArrayUpperSide() {
        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        int target = 1;

        int[] ans = BinarySearch2dArray.BinarySearch(arr, target);
        System.out.println(Arrays.toString(ans));
        assertEquals(0, ans[0]);
        assertEquals(0, ans[1]);
    }

    @Test
    public void testBinarySearch2dArrayLower() {
        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        int target = 10;

        int[] ans = BinarySearch2dArray.BinarySearch(arr, target);
        System.out.println(Arrays.toString(ans));
        assertEquals(2, ans[0]);
        assertEquals(1, ans[1]);
    }

    @Test
    public void testBinarySearch2dArrayLowerSide() {
        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        int target = 11;

        int[] ans = BinarySearch2dArray.BinarySearch(arr, target);
        System.out.println(Arrays.toString(ans));
        assertEquals(2, ans[0]);
        assertEquals(2, ans[1]);
    }

    @Test
    public void testBinarySearch2dArrayNotFound() {
        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        int target = 101;

        int[] ans = BinarySearch2dArray.BinarySearch(arr, target);
        System.out.println(Arrays.toString(ans));
        assertEquals(-1, ans[0]);
        assertEquals(-1, ans[1]);
    }

    @Test
    public void testBinarySearch2dArrayOneRow() {
        int[][] arr = {{1, 2, 3, 4}};
        int target = 2;

        assertEquals(arr.length, 1);
        int[] ans = BinarySearch2dArray.BinarySearch(arr, target);
        System.out.println(Arrays.toString(ans));
        assertEquals(0, ans[0]);
        assertEquals(1, ans[1]);
    }

    @Test
    public void testBinarySearch2dArrayTargetInMiddle() {
        int[][] arr = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}};
        int target = 8;

        assertEquals(arr[arr.length / 2][arr[0].length / 2], target);
        int[] ans = BinarySearch2dArray.BinarySearch(arr, target);
        System.out.println(Arrays.toString(ans));
        assertEquals(1, ans[0]);
        assertEquals(2, ans[1]);
    }
}

