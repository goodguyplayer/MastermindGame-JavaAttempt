package tests;

import models.Code;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.concurrent.ThreadLocalRandom;
import java.util.logging.Logger;

public class CodeTester {

    private static final Logger log = Logger.getLogger(Code.class.getName());

    @BeforeAll
    static void setup(){
        log.info("Starting test for class Code");
    }

    @DisplayName("Basic test - Testing getter")
    @Test
    void testGetter(){
        Code code = new Code();
        log.info("Obtained.: " + code.getCode());
    }

    @DisplayName("Testing N new codes at random")
    @Test
    void testNCodes(){
        int number = ThreadLocalRandom.current().nextInt(0, 100 + 1);
        for (int i = 0; i < number; i++) {
            Code code = new Code();
            log.info("For i = " + i + ", we have the code.: " + code.getCode());

        }
    }
}
