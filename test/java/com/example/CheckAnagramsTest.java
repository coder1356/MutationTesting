package com.example;
import static org.junit.Assert.*;

import org.junit.Test;

public class CheckAnagramsTest {
    private static final String MESSAGE = "Strings must contain only lowercase English letters!";

    // CHECK METHOD isAnagrams()
    @Test
    public void testCheckAnagrams() {
        String testString1 = "STUDY";
        String testString2 = "DUSTY";
        assertTrue(CheckAnagrams.isAnagrams(testString1, testString2));
    }

    @Test
    public void testCheckFalseAnagrams() {
        String testString1 = "STUDY";
        String testString2 = "random";
        assertFalse(CheckAnagrams.isAnagrams(testString1, testString2));
    }

    @Test
    public void testCheckSameWordAnagrams() {
        String testString1 = "STUDY";
        assertTrue(CheckAnagrams.isAnagrams(testString1, testString1));
    }

    @Test
    public void testCheckDifferentCasesAnagram() {
        String testString1 = "STUDY";
        String testString2 = "dusty";
        assertTrue(CheckAnagrams.isAnagrams(testString1, testString2));
    }

    // CHECK METHOD isAnagramsUnicode()
    // Below tests work with strings which consist of Unicode symbols & the algorithm is case-sensitive.
    @Test
    public void testStringAreValidAnagramsCaseSensitive() {
        assertTrue(CheckAnagrams.isAnagramsUnicode("Silent", "liSten"));
        assertTrue(CheckAnagrams.isAnagramsUnicode("This is a string", "is This a string"));
    }

    @Test
    public void testStringAreNotAnagramsCaseSensitive() {
        assertFalse(CheckAnagrams.isAnagramsUnicode("Silent", "Listen"));
        assertFalse(CheckAnagrams.isAnagramsUnicode("This is a string", "Is this a string"));
    }

    // CHECK METHOD isAnagramsOptimised()
    // Below tests work with strings which consist of only lowercase English letters
    @Test
    public void testOptimisedAlgorithmStringsAreValidAnagrams() {
        assertTrue(CheckAnagrams.isAnagramsOptimised("silent", "listen"));
        assertTrue(CheckAnagrams.isAnagramsOptimised("mam", "amm"));
    }

    @Test
    public void testOptimisedAlgorithmShouldThrowExceptionWhenStringsContainUppercaseLetters() {
        try {
            CheckAnagrams.isAnagramsOptimised("Silent", "Listen");
            // If no exception is thrown, fail the test
            fail("Expected IllegalArgumentException, but no exception was thrown.");
        } catch (IllegalArgumentException exception) {
            assertEquals(MESSAGE, exception.getMessage());
        }

        try {
            assertFalse(CheckAnagrams.isAnagramsOptimised("This is a string", "Is this a string"));
            // If no exception is thrown, fail the test
            fail("Expected IllegalArgumentException, but no exception was thrown.");
        } catch (IllegalArgumentException exception) {
            assertEquals(MESSAGE, exception.getMessage());
        }
        // IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> CheckAnagrams.isAnagramsOptimised("Silent", "Listen"));
        // assertEquals(exception.getMessage(), MESSAGE);

        // exception = assertThrows(IllegalArgumentException.class, () -> Assertions.assertFalse(CheckAnagrams.isAnagramsOptimised("This is a string", "Is this a string")));
        // assertEquals(exception.getMessage(), MESSAGE);
    }
}
