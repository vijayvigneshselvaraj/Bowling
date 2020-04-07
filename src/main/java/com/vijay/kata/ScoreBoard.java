package com.vijay.kata;

import java.util.ArrayList;

public class ScoreBoard {

    public int getBowlingScore(ArrayList<Frame> frames) {
        int score = 0;
        int max_turns = 10;
        Frame eachFrame;
        for(int eachRawFrameValue=0; eachRawFrameValue < max_turns; eachRawFrameValue++) {
            eachFrame = frames.get(eachRawFrameValue);
            // Strike
            if(eachFrame.getFrameValue().contains("X")) {
                score = 30 + score;
            }
            // Miss
            if(eachFrame.getFrameValue().contains("-")) {
                int eachFrameScore = Integer.parseInt(eachFrame.getFrameValue().replace("-", ""));
                score = eachFrameScore + score;
            }
            // Spare
            if(eachFrame.getFrameValue().contains("/")) {
                score = calculateCurrentFrameScore(eachFrame).getScore() + score + 10;
            }
        }
        return score;
    }

    public Frame calculateCurrentFrameScore(Frame frame) {
        int eachFrameScore = 0;
        if(frame.getFrameId() == 10) {
            eachFrameScore = Integer.parseInt(frame.getFrameValue().replace("/", ""));
            eachFrameScore = eachFrameScore%10;
            frame.setScore(eachFrameScore);
            return frame;
        }
        eachFrameScore = Integer.parseInt(frame.getFrameValue().replace("/", ""));
        frame.setScore(eachFrameScore);
        return frame;
    }

}
