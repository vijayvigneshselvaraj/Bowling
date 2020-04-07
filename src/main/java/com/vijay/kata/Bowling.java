package com.vijay.kata;

import java.util.ArrayList;

public class Bowling {

    public ArrayList<Frame> parseInputSequenceOfRoll(String rollSequence) {
        ArrayList<Frame> frames = new ArrayList<Frame>();
        Frame frame = null;
        String[] rawFrameValues = null;
        if (rollSequence != null && !"".equalsIgnoreCase(rollSequence)) {
            rawFrameValues = rollSequence.split("\\s+");
        }
        for(int eachRawFrameValue=0; eachRawFrameValue < rawFrameValues.length; eachRawFrameValue++) {
            frame = new Frame();
            frame.setFrameId(eachRawFrameValue+1);
            frame.setFrameValue(rawFrameValues[eachRawFrameValue]);
            frames.add(frame);
        }
        return frames;
    }
}
