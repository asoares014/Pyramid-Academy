import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int randomNumber = rand.nextInt(100) + 1;
        //System.out.println(randomNumber);

        System.out.println("Hello! What is your name?");
        String name = input.nextLine();
        System.out.println("Well, " + name + " , I am thinking of a number between 1 and 100.");
        System.out.println("Enter your guess:");
        int counter = 0;

        while (true) {
            try {
                int playerGuess = input.nextInt();
                counter++;

                if (playerGuess == randomNumber) {
                    System.out.println("Correct! You Win!");
                    System.out.println("You guessed my number in " + counter + " tries!");
                    break;
                } else if (randomNumber > playerGuess) {
                    System.out.println("Your guess is too low! Guess again");
                } else {
                    System.out.println("Your guess is too high! Guess again");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("Invalid Input");
                break;
            }
        }
    }
}

