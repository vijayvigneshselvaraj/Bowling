package com.vijay.kata;

public class ScoreBoard {
    public int getBowlingScore(String[] frames) {
        int score = 0;
        int no_of_frames = 10;
        for(String eachFrame : frames) {
            if(eachFrame!= null && "X".equalsIgnoreCase(eachFrame)) {
                score = score + 30;
            }
            else if(eachFrame!= null && eachFrame.contains("-")) {
                eachFrame = eachFrame.replace("-", "");
                score = score + Integer.parseInt(eachFrame);
            }
            else if(eachFrame!= null && eachFrame.contains("/")) {
                eachFrame = eachFrame.replace("/", "");
                score = score + Integer.parseInt(eachFrame);
            }
        }
        return score;
    }
}
