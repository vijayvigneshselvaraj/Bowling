package com.vijay.kata;

import java.util.ArrayList;

public class ScoreBoard {

    public int getBowlingScore(ArrayList<Frame> frames) {
        int score = 0;
        Frame eachFrame;
        for(int eachRawFrameValue=0; eachRawFrameValue < Constants.MAX_BOWLING_TURN; eachRawFrameValue++) {
            eachFrame = frames.get(eachRawFrameValue);
            if(isStrike(eachFrame)) {
                score = Constants.STRIKE_SCORE + score;
            }
            if(isMiss(eachFrame)) {
                score = calculateCurrentFrameScore(eachFrame).getScore() + score;
            }
            if(isSpare(eachFrame)) {
                score = calculateCurrentFrameScore(eachFrame).getScore() + score + Constants.SPARE_SCORE;
            }
        }
        return score;
    }

    public ArrayList<Frame> convertSequenceToFrame(String[] rawFrameValues) {
        ArrayList<Frame> frames = new ArrayList<Frame>();
        Frame frame = null;
        if (rawFrameValues != null) {
            for(int eachRawFrameValue=0; eachRawFrameValue < rawFrameValues.length; eachRawFrameValue++) {
                frame = new Frame();
                frame.setFrameId(eachRawFrameValue+1);
                frame.setFrameValue(rawFrameValues[eachRawFrameValue]);
                frames.add(frame);
            }
            return frames;
        }
        return null;
    }

    public String[] parseInputSequenceOfRoll(String rollSequence) {
        String[] rawFrameValues = null;
        if (rollSequence != null && !"".equalsIgnoreCase(rollSequence)) {
            rawFrameValues = rollSequence.split("\\s+");
        }
        return rawFrameValues;
    }

    private boolean isSpare(Frame eachFrame) {
        return eachFrame.getFrameValue().contains(Constants.SPARE_SEP);
    }

    private boolean isMiss(Frame frame) {
        return frame.getFrameValue().contains(Constants.MISS_SEP);
    }

    private boolean isStrike(Frame frame) {
        return frame.getFrameValue().contains(Constants.STRIKE_SEP);
    }

    private Frame calculateCurrentFrameScore(Frame frame) {
        int eachFrameScore = 0;
        if(isSpare(frame)) {
            if(frame.getFrameId() == Constants.MAX_BOWLING_TURN) {
                eachFrameScore = Integer.parseInt(frame.getFrameValue().replace(Constants.SPARE_SEP, ""));
                eachFrameScore = eachFrameScore%10;
                frame.setScore(eachFrameScore);
                return frame;
            }
            eachFrameScore = Integer.parseInt(frame.getFrameValue().replace(Constants.SPARE_SEP, ""));
            frame.setScore(eachFrameScore);
        }
        else if(isMiss(frame)) {
            eachFrameScore = Integer.parseInt(frame.getFrameValue().replace("-", ""));
            frame.setScore(eachFrameScore);
        }
        return frame;
    }

}
