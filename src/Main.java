import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Hangman man = new Hangman();
        Scanner input = new Scanner(System.in);
        List<String> words = new ArrayList<>();
        words.add("bird");
        words.add("apple");
        words.add("lamp");
        words.add("rain");
        words.add("soda");
        words.add("floor");

        Random rand = new Random();
        String word = words.get(rand.nextInt(words.size()));
        System.out.println(word);

        List<Character> playerGuesses = new ArrayList<>();

        man.printWordState(word, playerGuesses);

        int wrongCount = 0;
        while (true) {
            man.printHangedMan(wrongCount);

            if(wrongCount >= 6){
                System.out.println("You lose!");
                break;
            }

            if (!man.getPlayerGuess(input, word, playerGuesses)) {
                wrongCount++;
            };

            if (man.printWordState(word, playerGuesses)) {
                System.out.println("You guessed the word correctly!");
                break;
            }
        }
    }
}

