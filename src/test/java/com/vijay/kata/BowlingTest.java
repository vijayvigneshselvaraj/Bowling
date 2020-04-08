package com.vijay.kata;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BowlingTest {
    public Bowling bowling = null;
    public ScoreBoard scoreBoard = null;

    @Before
    public void setup() {
        bowling = new Bowling();
        scoreBoard = new ScoreBoard();
    }

    @After
    public void tearDown() {
        bowling = null;
        scoreBoard = null;
        assertNull(bowling);
        assertNull(scoreBoard);
    }

    @Test
    public void baseTest() {
        assertTrue(true);
    }

    @Test
    public void parseInputSequenceOfRollShouldReturnNullWhenEmptyInputRollSequencePassedTest() {
        assertNull(scoreBoard.parseInputSequenceOfRoll(""));
    }

    @Test
    public void parseInputSequenceOfRollShouldReturnNullWhenNullInputRollSequencePassedTest() {
        assertNull(scoreBoard.parseInputSequenceOfRoll(null));
    }

    @Test
    public void parseInputSequenceOfRollWhenXGivenInputRollSequencePassedTest() {
        String rollSequence = "X X X X";
        String[] expectedParsedRollSequence = new String[]{"X", "X", "X", "X"};
        assertEquals(scoreBoard.parseInputSequenceOfRoll(rollSequence), expectedParsedRollSequence);
    }

    @Test
    public void parseInputSequenceOfRollWhenXGivenWithSpaceInputRollSequencePassedTest() {
        String rollSequence = "X X X  X ";
        String[] expectedParsedRollSequence = new String[]{"X", "X", "X", "X"};
        assertEquals(scoreBoard.parseInputSequenceOfRoll(rollSequence), expectedParsedRollSequence);
    }

    @Test
    public void parseInputSequenceOfRollWhenSpareGivenTest() {
        String rollSequence = "5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/5";
        assertEquals(bowling.getScore(rollSequence), 150);
    }

    @Test
    public void parseInputSequenceOfRollWhenXGivenTest() {
        String rollSequence = "X X X X X X X X X X X X";
        assertEquals(bowling.getScore(rollSequence), 300);
    }

    @Test
    public void parseInputSequenceOfRollWhenMissingTurnGivenTest() {
        String rollSequence = "9- 9- 9- 9- 9- 9- 9- 9- 9- 9-";
        assertEquals(bowling.getScore(rollSequence), 90);
    }

}
