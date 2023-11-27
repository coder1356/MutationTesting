package com.example;

import static org.junit.Assert.*;

import org.junit.Test;
public class AnagramsTest {

    @Test
    public void isAlphabetical() {
        String input1 = "late";
        Anagrams anagrams = new Anagrams();
        assertTrue(anagrams.approach1(input1, "tale"));
        assertTrue(anagrams.approach1(input1, "teal"));
        assertTrue(anagrams.approach2(input1, "tale"));
        assertTrue(anagrams.approach2(input1, "teal"));
        assertTrue(anagrams.approach3(input1, "tale"));
        assertTrue(anagrams.approach3(input1, "teal"));
        assertTrue(anagrams.approach4(input1, "tale"));
        assertTrue(anagrams.approach4(input1, "teal"));
        assertTrue(anagrams.approach5(input1, "teal"));
    }
}
