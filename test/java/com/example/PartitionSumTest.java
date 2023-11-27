package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PartitionSumTest {

    @Test
    public void testMaxSumAfterPartitioning1() {
        PartitionSum partitionSum = new PartitionSum();
        int[] arr = {1, 15, 7, 9, 2, 5};
        int k = 3;
        int result = partitionSum.maxSumAfterPartitioning1(arr, k);
        assertEquals(72, result);
    }

    @Test
    public void testMaxSumAfterPartitioning2() {
        PartitionSum partitionSum = new PartitionSum();
        int[] arr = {1, 15, 7, 9, 2, 5};
        int k = 3;
        int result = partitionSum.maxSumAfterPartitioning2(arr, k);
        assertEquals(72, result);
    }

    @Test
    public void testMaxSumAfterPartitioning3() {
        PartitionSum partitionSum = new PartitionSum();
        int[] arr = {4, 1, 7, 5, 6, 2, 10, 3};
        int k = 3;
        int result = partitionSum.maxSumAfterPartitioning1(arr, k);
        assertEquals(63, result);
    }

    @Test
    public void testMaxSumAfterPartitioning4() {
        PartitionSum partitionSum = new PartitionSum();
        int[] arr = {4, 1, 7, 5, 6, 2, 10, 3};
        int k = 3;
        int result = partitionSum.maxSumAfterPartitioning2(arr, k);
        assertEquals(63, result);
    }

    @Test
    public void testMaxSumAfterPartitioning5() {
        PartitionSum partitionSum = new PartitionSum();
        int[] arr = {2, 5, 1, 3, 4, 8, 7};
        int k = 2;
        int result = partitionSum.maxSumAfterPartitioning1(arr, k);
        assertEquals(39, result);
    }

    @Test
    public void testMaxSumAfterPartitioning6() {
        PartitionSum partitionSum = new PartitionSum();
        int[] arr = {2, 5, 1, 3, 4, 8, 7};
        int k = 2;
        int result = partitionSum.maxSumAfterPartitioning2(arr, k);
        assertEquals(39, result);
    }

    @Test
    public void testMaxSumAfterPartitioning7() {
        PartitionSum partitionSum = new PartitionSum();
        int[] arr = {3, 2, 5, 10, 7};
        int k = 3;
        int result = partitionSum.maxSumAfterPartitioning1(arr, k);
        assertEquals(40, result);
    }

    @Test
    public void testMaxSumAfterPartitioning8() {
        PartitionSum partitionSum = new PartitionSum();
        int[] arr = {3, 2, 5, 10, 7};
        int k = 3;
        int result = partitionSum.maxSumAfterPartitioning2(arr, k);
        assertEquals(40, result);
    }

    @Test
    public void testMaxSumAfterPartitioning9() {
        PartitionSum partitionSum = new PartitionSum();
        int[] arr = {1, 1, 1, 1, 1};
        int k = 2;
        int result = partitionSum.maxSumAfterPartitioning1(arr, k);
        assertEquals(5, result);
    }

    @Test
    public void testMaxSumAfterPartitioning10() {
        PartitionSum partitionSum = new PartitionSum();
        int[] arr = {1, 1, 1, 1, 1};
        int k = 2;
        int result = partitionSum.maxSumAfterPartitioning2(arr, k);
        assertEquals(5, result);
    }
}
