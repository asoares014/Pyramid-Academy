package com.andrea;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        GuessNumber number = new GuessNumber();
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int randomNumber = rand.nextInt(100) + 1;
       // System.out.println(randomNumber);

        System.out.println(number.intro());
        int counter = 0;

        while (true) {
            try {
                int playerGuess = input.nextInt();
                counter++;

                if (playerGuess == randomNumber) {
                    System.out.println(number.correct());
                    System.out.println("You guessed my number in " + counter + " tries!");
                    break;
                } else if (randomNumber > playerGuess) {
                    System.out.println(number.tooLow());
                } else {
                    System.out.println(number.tooHigh());
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("Invalid Input");
                break;
            }
        }
    }
}
