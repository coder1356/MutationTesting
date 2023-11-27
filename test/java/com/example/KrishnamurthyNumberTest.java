package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;

public class KrishnamurthyNumberTest {
    
    private final InputStream originalSystemIn = System.in;
    private final PrintStream originalSystemOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @Before
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @After
    public void tearDown() {
        System.setIn(originalSystemIn);
        System.setOut(originalSystemOut);
    }

    @Test
    public void testMainWithKrishnamurthyNumber() throws IOException {
        // Arrange
        String input = "145\n";
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        // Act
        KrishnamurthyNumber.main(new String[]{});

        // Assert
        assertEquals("Enter a number to check if it is a Krishnamurthy number: \n145 is a Krishnamurthy number.\n", outputStreamCaptor.toString());
    }

    @Test
    public void testMainWithNonKrishnamurthyNumber() throws IOException {
        // Arrange
        String input = "123\n";
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        // Act
        KrishnamurthyNumber.main(new String[]{});

        // Assert
        assertEquals("Enter a number to check if it is a Krishnamurthy number: \n123 is NOT a Krishnamurthy number.\n", outputStreamCaptor.toString());
    }

    @Test
    public void testPositiveKrishnamurthyNumber() {
        assertTrue(KrishnamurthyNumber.isKMurthy(145));
    }

    @Test
    public void testZeroIsNotKrishnamurthyNumber() {
        assertFalse(KrishnamurthyNumber.isKMurthy(0));
    }

    @Test
    public void testNegativeNumberIsNotKrishnamurthyNumber() {
        assertFalse(KrishnamurthyNumber.isKMurthy(-123));
    }

    @Test
    public void testSingleDigitKrishnamurthyNumber() {
        assertTrue(KrishnamurthyNumber.isKMurthy(1));
    }

    @Test
    public void testNonKrishnamurthyNumber() {
        assertFalse(KrishnamurthyNumber.isKMurthy(123));
    }

    @Test
    public void testLargeKrishnamurthyNumber() {
        assertTrue(KrishnamurthyNumber.isKMurthy(40585));
    }

    @Test
    public void testTwoDigitNonKrishnamurthyNumber() {
        assertFalse(KrishnamurthyNumber.isKMurthy(19));
    }

    @Test
    public void testThreeDigitKrishnamurthyNumber() {
        assertTrue(KrishnamurthyNumber.isKMurthy(145));
    }
}
