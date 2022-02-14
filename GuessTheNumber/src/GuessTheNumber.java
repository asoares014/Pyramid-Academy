import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Hello! What is your name?");
        String name = input.nextLine();
        System.out.println("Well, " + name + " , I am thinking of a number between 1 and 20.");
        int number;
        int count = 0;
        do {
            System.out.println("Take a guess");
            number = input.nextInt();
            count++;
            if (number > 14) {
                System.out.println("Your guess is too high");
            }
            if (number < 14) {
                System.out.println("Your guess is too low");
            } else if (number == 14) {
                System.out.println("Good job, " + name + " You guessed my number in " + count + " guesses!");
            }
        } while (number != 14);
        System.out.println("Would you like to play again? (y or n)");

        Scanner again = new Scanner(System.in);
        String playAgain = again.nextLine();
        if(playAgain.equals("y")) {
            System.out.println("Let's play again!..I am thinking of a number between 1 and 20");
            int countNew = 0;
            do {
                System.out.println("Take a guess!");
                number = input.nextInt();
                countNew++;
                if (number > 9) {
                    System.out.println("Your guess is too high");
                }
                if (number < 9) {
                    System.out.println("Your guess is too low");
                } else if (number == 9) {
                    System.out.println("Good job, you guessed my number in " + countNew + " guesses!");
                }
            } while (number != 9);
        }if (playAgain.equals("n")) {
            System.out.println("See you next time!");
        }
    }
}
