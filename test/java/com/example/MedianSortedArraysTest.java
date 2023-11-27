package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MedianSortedArraysTest {
    @Test
    public void testMedianBruteForce_OddLengthArrays() {
        int[] a = {1, 3, 5};
        int[] b = {2, 4, 6, 8};
        double expected = 4;
        assertEquals(expected, MedianSortedArrays.medianBruteForce(a, b), 0.001);
    }

    @Test
    public void testMedianBruteForce_EvenLengthArrays() {
        int[] a = {1, 3, 5, 7};
        int[] b = {2, 4, 6, 8};
        double expected = 4.5;
        assertEquals(expected, MedianSortedArrays.medianBruteForce(a, b), 0.001);
    }

    @Test
    public void testMedianBetter_OddLengthArrays() {
        int[] a = {1, 3, 5};
        int[] b = {2, 4, 6, 8};
        double expected = 4;
        assertEquals(expected, MedianSortedArrays.medianBetter(a, b), 0.001);
    }

    @Test
    public void testMedianBetter_EvenLengthArrays() {
        int[] a = {1, 3, 5, 7};
        int[] b = {2, 4, 6, 8};
        double expected = 4.5;
        assertEquals(expected, MedianSortedArrays.medianBetter(a, b), 0.001);
    }

    @Test
    public void testMedianOptimal_OddLengthArrays() {
        int[] a = {1, 3, 5};
        int[] b = {2, 4, 6, 8};
        double expected = 4;
        assertEquals(expected, MedianSortedArrays.medianOptimal(a, b), 0.001);
    }

    @Test
    public void testMedianOptimal_EvenLengthArrays() {
        int[] a = {1, 3, 5, 7};
        int[] b = {2, 4, 6, 8};
        double expected = 4.5;
        assertEquals(expected, MedianSortedArrays.medianOptimal(a, b), 0.001);
    }
}
