package hu.progmasters.probac;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
//https://junit.org/junit5/docs/current/user-guide/#writing-tests
public class TestMorse {
    Morse morse = new Morse();
    @Test
    void testGetPosInAlphabet(){
        Assertions.assertEquals(0, morse.getPosInAlphabet("a"));
        Assertions.assertNotEquals(1, morse.getPosInAlphabet("a"));
        Assertions.assertEquals(0, morse.getPosInAlphabet(""));
       // Assertions.assertEquals(0, morse.getPosInAlphabet(null));
        Assertions.assertEquals(-1, morse.getPosInAlphabet("#"));

    }
}
