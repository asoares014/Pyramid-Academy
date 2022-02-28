import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

import java.util.List;
import java.util.Scanner;


class HangmanTest {

    Hangman hangman;

    @BeforeEach
    void setUp() {

        hangman = new Hangman();
    }

    @Test
    void printWordState() {

        assertTrue(hangman.printWordState("apple", List.of('a','p','l','e')));
        assertFalse(hangman.printWordState("apple", List.of('i','p','l','e')));
    }


    @Test
    void getPlayerGuess() {
        assertEquals(true, hangman.getPlayerGuess(new Scanner("k"), "apple", List.of('a', 'p', 'p','l','e')));
      // assertFalse(hangman.getPlayerGuess(new Scanner("h"), "apple", List.of('h')));
    }


    @Test
    void printHangedMan() {
    }

    @AfterEach
    void tearDown() {
    }
}