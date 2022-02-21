package com.andrea;


public class GuessNumber {

    public String intro() {
        return "Hello! I am thinking of a number between 1 and 100. Enter your guess:";
    }

    public String correct() {
        return "Correct! You Win!";
    }

    public String tooLow() {
        return "Your guess is too low! Guess again";
    }

    public String tooHigh() {
        return "Your guess is too high! Guess again";
    }
}
