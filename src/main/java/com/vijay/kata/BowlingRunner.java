package com.vijay.kata;

public class BowlingRunner {
    public static void main(String[] args) {
        Bowling b = new Bowling();
        if (args.length==1)
            System.out.println(b.getScore(args[0]));
        else
            System.out.println("Required: 1 str arg. Found: Invalid no of args / no args ! ! !");
    }
}
