package com.vijay.kata;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BowlingTest {

    @Test
    public void baseTest() {
        assertTrue(true);
    }

    @Test
    public void parseInputSequenceOfRollShouldReturnNullWhenEmptyInputRollSequencePassedTest() {
        assertNull(new Bowling().parseInputSequenceOfRoll(""));
    }

    @Test
    public void parseInputSequenceOfRollShouldReturnNullWhenNullInputRollSequencePassedTest() {
        assertNull(new Bowling().parseInputSequenceOfRoll(null));
    }

}
