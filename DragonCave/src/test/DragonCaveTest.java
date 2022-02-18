import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DragonCaveTest {

    DragonCave dragon;

    @BeforeEach
    void setUp() {
        dragon = new DragonCave();
    }

    @Test
    void intro() {
        assertEquals("Welcome to the dragon cave.\n" +
                "There are two paths to pick. Choose 1 or 2", dragon.intro());
    }

    @Test
    void dragonEatsYou() {
        assertEquals("You approach the cave...\n" +
                "It is dark and spooky...\n" +
                "A large dragon jumps out in front of you and gobbles you in one bite", dragon.dragonEatsYou());
    }

    @Test
    void dragonSharesTreasure() {
        assertEquals("You approach the cave...\n" +
                "It is bright and sparkly...\n" +
                "A friendly dragon jumps out shares his treasure with you", dragon.dragonSharesTreasure());
    }

    @Test
    void dragonIncorrectEntry() {
        assertEquals("Incorrect entry. YOU SHALL NOT PASS!", dragon.dragonIncorrectEntry());
    }

    @AfterEach
    void tearDown() {
    }
}