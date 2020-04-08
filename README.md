# Bowling

### Description:
Create a program, which, given a valid sequence of rolls for one line of American Ten-Pin Bowling, produces the total score for the game. Here are some things that the program will not do:

1) We will not check for valid rolls.
2) We will not check for correct number of rolls and frames.
3) We will not provide scores for intermediate frames.

Depending on the application, this might or might not be a valid way to define a complete story, but we do it here for purposes of keeping the kata light. I think you’ll see that improvements like those above would go in readily if they were needed for real.

We can briefly summarize the scoring for this form of bowling:

Each game, or “line” of bowling, includes ten turns, or “frames” for the bowler.
* In each frame, the bowler gets up to two tries to knock down all the pins.
* If in two tries, he fails to knock them all down, his score for that frame is the total number of pins knocked down in his two tries.
* If in two tries he knocks them all down, this is called a “spare” and his score for the frame is ten plus the number of pins knocked down on his next throw (in his next turn).
* If on his first try in the frame he knocks down all the pins, this is called a “strike”. His turn is over, and his score for the frame is ten plus the simple total of the pins knocked down in his next two rolls.
* If he gets a spare or strike in the last (tenth) frame, the bowler gets to throw one or two more bonus balls, respectively. These bonus throws are taken as part of the same turn. If the bonus throws knock down all the pins, the process does not repeat: the bonus throws are only used to calculate the score of the final frame.
* The game score is the total of all frame scores.

### Contributors
```
1) Vijayvignesh G S
```

### Prerequisites
```
1) Java 1.8+
2) Maven
```

### Installing

Download the zip file and extract into the designated directory and follow the bellow steps to build the application.


```
1) Open the terminal where you extracted the code. It whould be inside Bowling-master directory.
2) type 'javac src/main/java/com/vijay/kata/*.java'
3) Go to main directory by typing 'cd src/main/java'
4) Run the application by typing 'java com.vijay.kata.BowlingRunner X X X X X X X X X X X X' 
```

Examples:

```
1) java com.vijay.kata.BowlingRunner X X X X X X X X X X X X
2) java com.vijay.kata.BowlingRunner 9- 9- 9- 9- 9- 9- 9- 9- 9- 9-
3) java com.vijay.kata.BowlingRunner 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/5

```
