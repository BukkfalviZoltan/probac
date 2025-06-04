package hu.progmasters.probac;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

//https://junit.org/junit5/docs/current/user-guide/#writing-tests
public class TestMorse {
    Morse morse = new Morse();
    @Test
    void testGetPosInAlphabet(){
        Assertions.assertEquals(0, morse.getPosInAlphabet("a"));
        Assertions.assertNotEquals(1, morse.getPosInAlphabet("a"));
        Assertions.assertEquals(0, morse.getPosInAlphabet(""));
        Assertions.assertEquals(0, morse.getPosInAlphabet(null));
        Assertions.assertEquals(-1, morse.getPosInAlphabet("#"));


    }
    @Test
    void testConvertText2Morse(){
        List<String> morselist = new ArrayList<>();
        morselist.add(".-");
        List<String> results = morse.ConvertText2Morse("A");

        Assertions.assertEquals(morselist, results);
    }
    @Test
    void testConvertText2MorseBA(){
        List<String> morselist = new ArrayList<>();
        morselist.add("-...");
        morselist.add(".-");
        List<String> results = morse.ConvertText2Morse("BA");
        Assertions.assertEquals(morselist, results);
    }
    @Test
    void testConvertText2MorseAT(){
        List<String> morselist = new ArrayList<>();
        morselist.add("?");
        List<String> results = morse.ConvertText2Morse("@");
        Assertions.assertEquals(morselist, results);
    }
}
