package com.vijay.kata;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BowlingTest {
    public Bowling b = null;
    public ScoreBoard sb = null;

    @Before
    public void setup() {
        b = new Bowling();
        sb = new ScoreBoard();
    }

    @Test
    public void baseTest() {
        assertTrue(true);
    }

    @Test
    public void parseInputSequenceOfRollShouldReturnNullWhenEmptyInputRollSequencePassedTest() {
        assertNull(sb.parseInputSequenceOfRoll(""));
    }

    @Test
    public void parseInputSequenceOfRollShouldReturnNullWhenNullInputRollSequencePassedTest() {
        assertNull(sb.parseInputSequenceOfRoll(null));
    }

    @Test
    public void parseInputSequenceOfRollWhenXGivenInputRollSequencePassedTest() {
        String rollSequence = "X X X X";
        String[] expectedParsedRollSequence = new String[]{"X", "X", "X", "X"};
        assertEquals(sb.parseInputSequenceOfRoll(rollSequence), expectedParsedRollSequence);
    }

    @Test
    public void parseInputSequenceOfRollWhenXGivenWithSpaceInputRollSequencePassedTest() {
        String rollSequence = "X X X  X ";
        String[] expectedParsedRollSequence = new String[]{"X", "X", "X", "X"};
        assertEquals(sb.parseInputSequenceOfRoll(rollSequence), expectedParsedRollSequence);
    }

    @Test
    public void parseInputSequenceOfRollWhenMissGivenTest() {
        String rollSequence = "5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/5";
        assertEquals(b.getScore(rollSequence), 150);
    }

}
