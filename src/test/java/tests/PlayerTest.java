package tests;

import models.Player;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.concurrent.ThreadLocalRandom;
import java.util.logging.Logger;

public class PlayerTest {

    private static final Logger log = Logger.getLogger(Player.class.getName());

    @BeforeAll
    static void setup(){
        log.info("Starting test for class Player");
    }

    @Disabled
    @DisplayName("Basic test - Setting attempt")
    @Test
    void testAttempt(){
        Player player = new Player();
        player.setAttempt();
        log.info("Obtained.: " + player.getAttempt());
    }

    @DisplayName("Basic test - Score")
    @Test
    void testScore(){
        int number = ThreadLocalRandom.current().nextInt(0, 100 + 1);
        Player player = new Player();
        log.info("Random number.:" + number);
        for (int i = 0; i < number; i++) {
            player.increaseScore();
        }
        log.info("Total score.: " + player.getScore());
    }
}
