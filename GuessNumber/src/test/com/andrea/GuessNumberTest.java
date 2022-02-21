package com.andrea;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GuessNumberTest {

    GuessNumber number;

    @BeforeEach
    void setUp() {
    number = new GuessNumber();
    }

    @Test
    void intro() {
        assertEquals("Hello! I am thinking of a number between 1 and 100. Enter your guess:", number.intro());
    }

    @Test
    void correct() {
        assertEquals("Correct! You win!", number.correct());
    }

    @Test
    void tooLow() {
        assertEquals("Your guess is too low! Guess again", number.tooLow());
    }

    @Test
    void tooHigh() {
        assertEquals("Your guess is too high! Guess again", number.tooHigh());
    }

    @AfterEach
    void tearDown() {
    }

}