package hu.progmasters.probac;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

//https://junit.org/junit5/docs/current/user-guide/#writing-tests
public class TestMorse {
    Morse morse = new Morse();
    MorseMap morseMap = new MorseMap();
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
        List<String> results = morse.convertText2Morse("A");
        Assertions.assertEquals(morselist, results);
    }
    @Test
    void testConvertText2MorseBA(){
        List<String> morselist = new ArrayList<>();
        morselist.add("-...");
        morselist.add(".-");
        List<String> results = morse.convertText2Morse("BA");
        Assertions.assertEquals(morselist, results);
    }
    @Test
    void testConvertText2MorseAT(){
        List<String> morselist = new ArrayList<>();
        morselist.add("?");
        List<String> results = morse.convertText2Morse("@");
        Assertions.assertEquals(morselist, results);
    }
    @Test
    void testConvertText2MorseLong(){
        List<String> morselist = new ArrayList<>();
        morselist.add(".--");
        morselist.add("---");
        morselist.add("--..");
        morselist.add("..-");
        morselist.add(".--");
        morselist.add("---");
        morselist.add(".-.");
        morselist.add("-");
        morselist.add(".");
        morselist.add("-..");
        morselist.add(".-.");
        morselist.add("..-");
        morselist.add("-.-.");
        morselist.add("-.-");
        morselist.add(".");
        morselist.add("-.");
        morselist.add(".");
        morselist.add("...");
        morselist.add("--.");
        morselist.add("..");
        morselist.add("-...");
        morselist.add("-");
        morselist.add("-..");
        morselist.add("---");
        morselist.add("-.-.");
        morselist.add("....");
        morselist.add("...");
        morselist.add("-.-.");
        morselist.add("....");
        morselist.add(".-.");
        morselist.add(".");
        morselist.add("..");
        morselist.add("-...");
        morselist.add(".");
        morselist.add(".-.");
        List<String> results = new ArrayList<>();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10; i++) {
            results = morse.convertText2Morse(Morse.WOZU_WORTE_DRUCKEN_ES_GIBT_DOCH_SCHREIBER);
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
        //Assertions.assertEquals(morselist, results);
        Assertions.assertLinesMatch(morselist, results);
    }

    @Test
    void testConvertText2MorseMap(){
        List<String> morselist = new ArrayList<>();
        morselist.add(".-");
        List<String> results = morseMap.convertText2Morse("A");

        Assertions.assertEquals(morselist, results);
    }
    @Test
    void testConvertText2MorseMapBA() {
        List<String> morselist = new ArrayList<>();
        morselist.add("-...");
        morselist.add(".-");
        List<String> results = morseMap.convertText2Morse("BA");
        Assertions.assertEquals(morselist, results);
    }
    @Test
    void testConvertText2MorseMapAT(){
        List<String> morselist = new ArrayList<>();
        morselist.add("?");
        List<String> results = morseMap.convertText2Morse("@");
        Assertions.assertEquals(morselist, results);
    }
    @Test
    void testConvertText2MorseMapLong(){
        List<String> morselist = new ArrayList<>();
        morselist.add(".--");
        morselist.add("---");
        morselist.add("--..");
        morselist.add("..-");
        morselist.add(".--");
        morselist.add("---");
        morselist.add(".-.");
        morselist.add("-");
        morselist.add(".");
        morselist.add("-..");
        morselist.add(".-.");
        morselist.add("..-");
        morselist.add("-.-.");
        morselist.add("-.-");
        morselist.add(".");
        morselist.add("-.");
        morselist.add(".");
        morselist.add("...");
        morselist.add("--.");
        morselist.add("..");
        morselist.add("-...");
        morselist.add("-");
        morselist.add("-..");
        morselist.add("---");
        morselist.add("-.-.");
        morselist.add("....");
        morselist.add("...");
        morselist.add("-.-.");
        morselist.add("....");
        morselist.add(".-.");
        morselist.add(".");
        morselist.add("..");
        morselist.add("-...");
        morselist.add(".");
        morselist.add(".-.");
        List<String> results = new ArrayList<>();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10; i++) {
            results = morseMap.convertText2Morse(MorseMap.WOZU_WORTE_DRUCKEN_ES_GIBT_DOCH_SCHREIBER);
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
        Assertions.assertLinesMatch(morselist, results);
    }

    @Test
    void testConvertText2MorseInternational(){
        List<String> morselist = new ArrayList<>();
        morselist.add(".--.-");
        //List<String> results = morse.convertText2Morse("Á");
        Assertions.assertEquals(morselist, morse.convertText2Morse("Á"));

        morselist.clear();
        morselist.add(".-,-");
        Assertions.assertEquals(morselist, morse.convertText2Morse("Ä"));

        morselist.clear();
        morselist.add(".-,-");
        Assertions.assertEquals(morselist, morse.convertText2Morse("ä"));

        morselist.clear();
        morselist.add("..-..");
        Assertions.assertEquals(morselist, morse.convertText2Morse("É"));

        morselist.clear();
        morselist.add("--.--");
        Assertions.assertEquals(morselist, morse.convertText2Morse("Ñ"));

        morselist.clear();
        morselist.add("---.");
        Assertions.assertEquals(morselist, morse.convertText2Morse("Ö"));

        morselist.clear();
        morselist.add("..--");
        Assertions.assertEquals(morselist, morse.convertText2Morse("Ü"));
    }
    @Test
    void testConvertText2MorseAA(){
        List<String> morselist = new ArrayList<>();
        morselist.add(".--.-");
        List<String> results = morse.convertText2Morse("Á");
        Assertions.assertEquals(morselist, results);
    }
    @Test
    void testConvertText2MorseAAA(){
        List<String> morselist = new ArrayList<>();
        morselist.add(".-.-");
        List<String> results = morse.convertText2Morse("Ä");
        Assertions.assertEquals(morselist, results);
    }
    @Test
    void testConvertText2MorseJ(){
        List<String> morselist = new ArrayList<>();
        morselist.add(".---");
        List<String> results = morse.convertText2Morse("J");
        Assertions.assertEquals(morselist, results);
    }
}
