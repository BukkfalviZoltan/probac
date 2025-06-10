package hu.progmasters.probac;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class TestMorseI {
    MorseI morse = new Morse();
    MorseI morseMap = new MorseMap();
    @Test
    void testConvertText2Morse(){
        List<String> morselist = new ArrayList<>();
        morselist.add(".-");
        List<String> results = morse.convertText2Morse("A");

        Assertions.assertEquals(morselist, results);
    }
    @Test
    void testConvertText2MorseMap(){
        List<String> morselist = new ArrayList<>();
        morselist.add(".-");
        List<String> results = morseMap.convertText2Morse("A");

        Assertions.assertEquals(morselist, results);
    }
}
