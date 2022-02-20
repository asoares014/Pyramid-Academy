package com.andrea;

import java.util.Scanner;

public class GuessNumber {
    public void intro() {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello! What is your name?");
        String name = input.nextLine();
        System.out.println("Well, " + name + " , I am thinking of a number between 1 and 100. \n" +
                "Enter your guess:");
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
