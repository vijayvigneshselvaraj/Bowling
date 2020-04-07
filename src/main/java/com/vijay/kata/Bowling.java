package com.vijay.kata;

public class Bowling {

    public String[] parseInputSequenceOfRoll(String rollSequence) {
        String[] eachFrame = null;
        if (rollSequence != null && !"".equalsIgnoreCase(rollSequence)) {
            eachFrame = rollSequence.split("\\s+");
        }
        return eachFrame;
    }

}
