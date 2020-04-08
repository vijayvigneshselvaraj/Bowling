package com.vijay.kata;

public class BowlingRunner {
    public static void main(String[] args) {
        Bowling b = new Bowling();
        String scoreSequence = "";
        if (args.length>=1) {
            for(String arg : args) {
                scoreSequence = arg + " " + scoreSequence;
            }
            System.out.println(scoreSequence);
            System.out.println(b.getScore(scoreSequence));
        }
        else
            System.out.println("Required: 1 str arg. Found: Invalid no of args / no args ! ! !");
    }
}
