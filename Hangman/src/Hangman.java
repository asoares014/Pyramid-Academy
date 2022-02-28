import java.util.List;
import java.util.Scanner;

public class Hangman {

    public static boolean printWordState(String word, List<Character> playerGuesses){
        int correctCount = 0;
        for (int i = 0; i < word.length(); i++) {
            if(playerGuesses.contains(word.charAt(i))) {
                System.out.print(word.charAt(i));
                correctCount++;
            } else {
                System.out.print("-");
            }
        }
        System.out.println();
        return (word.length() == correctCount);
    }

    public static boolean getPlayerGuess(Scanner input, String word, List<Character> playerGuesses) {
        System.out.println("Please enter a letter:");
        String letterGuess = input.nextLine();
        playerGuesses.add(letterGuess.charAt(0));

        return word.contains(letterGuess);
    }

    public static void printHangedMan(Integer wrongCount){
        System.out.println(" -------");
        System.out.println(" |     |");
        if (wrongCount >= 1) {
            System.out.println(" O");
        }
        if (wrongCount >= 2) {
            System.out.print("| ");
            if (wrongCount >= 3) {
                System.out.println("|");
            } else {
                System.out.println("");
            }
        }
        if (wrongCount >= 4) {
            System.out.println(" |");
        }
        if (wrongCount >= 5) {
            System.out.print("| ");
            if (wrongCount >= 6) {
                System.out.println("|");
            } else {
                System.out.println("");
            }
        }
        System.out.println("");
    }
}
