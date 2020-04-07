package com.vijay.kata;

import java.util.ArrayList;

public class Bowling {

    public int getScore(String bowlSequence) {
        ScoreBoard sb = new ScoreBoard();
        String rawFrames[] = sb.parseInputSequenceOfRoll(bowlSequence);
        ArrayList<Frame> frames = sb.convertSequenceToFrame(rawFrames);
        return sb.getBowlingScore(frames);
    }
}
