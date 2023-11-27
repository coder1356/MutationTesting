package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SingleBitOperationTest {

    @Test
    public void flipBitTest() {
        assertEquals(1, SingleBitOperation.flipBit(3, 1));
        assertEquals(11, SingleBitOperation.flipBit(3, 3));
    }

    @Test
    public void setBitTest() {
        assertEquals(5, SingleBitOperation.setBit(4, 0));
        assertEquals(4, SingleBitOperation.setBit(4, 2));
    }

    @Test
    public void clearBitTest() {
        assertEquals(5, SingleBitOperation.clearBit(7, 1));
        assertEquals(5, SingleBitOperation.clearBit(5, 1));
    }

    @Test
    public void getBitTest() {
        assertEquals(0, SingleBitOperation.getBit(6, 0));
        assertEquals(1, SingleBitOperation.getBit(7, 1));
    }
}
