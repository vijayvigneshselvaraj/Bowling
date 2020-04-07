package com.vijay.kata;

public class Bowling {

    public String[] parseInputSequenceOfRoll(String rollSequence) {
        String[] frames = null;
        if (rollSequence != null && !"".equalsIgnoreCase(rollSequence)) {
            frames = rollSequence.split("\\s+");
        }
        return frames;
    }
}
