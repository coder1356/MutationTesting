package com.example;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class WordLadderTest {

    @Test
    public void testLadderLengthWithValidTransformation() {
        List<String> wordList = Arrays.asList("hot", "dot", "dog", "lot", "log", "cog");
        assertEquals(5, WordLadder.ladderLength("hit", "cog", wordList));
    }

    @Test
    public void testLadderLengthWithInvalidTransformation() {
        List<String> wordList = Arrays.asList("hot", "dot", "dog", "lot", "log");
        assertEquals(0, WordLadder.ladderLength("hit", "cog", wordList));
    }

    // @Test
    // public void testLadderLengthWithSameBeginAndEndWord() {
    //     List<String> wordList = Arrays.asList("hot", "dot", "dog", "lot", "log", "cog");
    //     assertEquals(1, WordLadder.ladderLength("hit", "hit", wordList));
    // }

    @Test
    public void testLadderLengthWithEmptyWordList() {
        List<String> wordList = Arrays.asList();
        assertEquals(0, WordLadder.ladderLength("hit", "cog", wordList));
    }

    @Test
    public void testLadderLengthWithEmptyBeginWord() {
        List<String> wordList = Arrays.asList("hot", "dot", "dog", "lot", "log", "cog");
        assertEquals(0, WordLadder.ladderLength("", "cog", wordList));
    }

    @Test
    public void testLadderLengthWithEmptyEndWord() {
        List<String> wordList = Arrays.asList("hot", "dot", "dog", "lot", "log", "cog");
        assertEquals(0, WordLadder.ladderLength("hit", "", wordList));
    }
}
