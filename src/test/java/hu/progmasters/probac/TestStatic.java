package hu.progmasters.probac;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestStatic {


    @Test
    void testGetPosInAlphabet(){
        Assertions.assertEquals(0, MainStatic.getPosInAlphabet("a"));
        Assertions.assertNotEquals(1, MainStatic.getPosInAlphabet("a"));
        Assertions.assertEquals(0, MainStatic.getPosInAlphabet(""));
        Assertions.assertEquals(0, MainStatic.getPosInAlphabet(null));
        Assertions.assertEquals(-1, MainStatic.getPosInAlphabet("#"));
    }
}
