package com.vijay.kata;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BowlingTest {
    public Bowling b = null;

    @Before
    public void setup() {
        b = new Bowling();
    }

    @Test
    public void baseTest() {
        assertTrue(true);
    }

    @Test
    public void parseInputSequenceOfRollShouldReturnNullWhenEmptyInputRollSequencePassedTest() {
        assertNull(b.parseInputSequenceOfRoll(""));
    }

    @Test
    public void parseInputSequenceOfRollShouldReturnNullWhenNullInputRollSequencePassedTest() {
        assertNull(b.parseInputSequenceOfRoll(null));
    }

    @Test
    public void parseInputSequenceOfRollShouldReturnNullWhenXGivenInputRollSequencePassedTest() {
        String rollSequence = "X X X X";
        String[] expectedParsedRollSequence = new String[]{"X", "X", "X", "X"};
        assertEquals(b.parseInputSequenceOfRoll(rollSequence), expectedParsedRollSequence);
    }

}
