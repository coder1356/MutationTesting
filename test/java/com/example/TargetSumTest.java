package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TargetSumTest {

	 @Test
	 public  void test1() {
	        int arr[] = { 1, 2, 3, 1 };
	        int target = 3;
	        int arr2[] = { 1,1,1,1, 1 };

	        int n = arr.length;

	       // // Call the targetSum function and print the result
	        assertEquals(2,  TargetSum.targetSum(4, target, arr));
	        assertEquals(5,  TargetSum.targetSum(5, target, arr2));
	        assertEquals(2,  TargetSum.targetSum1(4, target, arr));
	        assertEquals(5,  TargetSum.targetSum1(5, target, arr2));
	        
	    }

        @Test
    public void testSingleElementArray() {
        int[] arr = { 5 };
        int target = 5;
        assertEquals(1, TargetSum.targetSum(1, target, arr));
        assertEquals(1, TargetSum.targetSum1(1, target, arr));
    }

    // @Test
    // public void testZeroTarget() {
    //     int[] arr = { 2, 4, 6, 8 };
    //     int target = 0;
    //     assertEquals(1, TargetSum.targetSum(4, target, arr));
    //     assertEquals(1, TargetSum.targetSum1(4, target, arr));
    // }

    // @Test
    // public void testNegativeNumbers() {
    //     int[] arr = { -3, -1, 2, 4, 6 };
    //     int target = 1;
    //     assertEquals(2, TargetSum.targetSum(5, target, arr));
    //     assertEquals(2, TargetSum.targetSum1(5, target, arr));
    // }

    @Test
    public void testEmptyArray() {
        int[] arr = {};
        int target = 5;
        assertEquals(0, TargetSum.targetSum(0, target, arr));
        assertEquals(0, TargetSum.targetSum1(0, target, arr));
    }

    @Test
    public void testLargeArray() {
        int[] arr = new int[1000];
        for (int i = 0; i < 1000; i++) {
            arr[i] = 1;
        }
        int target = 1000;
        assertEquals(1, TargetSum.targetSum(1000, target, arr));
        assertEquals(1, TargetSum.targetSum1(1000, target, arr));
    }
}
