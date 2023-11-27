package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StringCompressionTest {

    @Test
    public void testCompressWithEmptyString() {
        assertEquals("", StringCompression.compress(""));
    }

    @Test
    public void testCompressWithSingleCharacter() {
        assertEquals("a", StringCompression.compress("a"));
    }

    @Test
    public void testCompressWithNoRepeatingCharacters() {
        assertEquals("abcd", StringCompression.compress("abcd"));
    }

    @Test
    public void testCompressWithRepeatingCharacters() {
        assertEquals("a3b2c4", StringCompression.compress("aaabbcccc"));
    }

    // @Test
    // public void testCompressWithMixedCharacters() {
    //     assertEquals("a3b2c4d2", StringCompression.compress("aaabbcccdd"));
    // }

    @Test
    public void testCompressWithSingleCharacterRepeated() {
        assertEquals("a5", StringCompression.compress("aaaaa"));
    }

    @Test
    public void testCompressWithSingleCharacterRepeatedAtEnd() {
        assertEquals("a4b", StringCompression.compress("aaaab"));
    }
}
