package hu.progmasters.probac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

/**
 * Converts string into Morse Code
 */
public class MorseMap {

    /**
     * Default string to be converted.
     */
    public static final String WOZU_WORTE_DRUCKEN_ES_GIBT_DOCH_SCHREIBER = "Wozu Worte drucken, es gibt doch Schreiber";

    Map<String, String> morseMap = new HashMap<>();

    public MorseMap() {
        morseMap.put("a",".-");
        morseMap.put("b","-...");
        morseMap.put("c","-.-.");
        morseMap.put("d","-..");
        morseMap.put("e",".");
        morseMap.put("f","..-.");
        morseMap.put("g","--.");
        morseMap.put("h","....");
        morseMap.put("i","..");
        morseMap.put("k","-.-");
        morseMap.put("l",".-..");
        morseMap.put("m","--");
        morseMap.put("n","-.");
        morseMap.put("o","---");
        morseMap.put("p",".--.");
        morseMap.put("q","--.-");
        morseMap.put("r",".-.");
        morseMap.put("s","...");
        morseMap.put("t","-");
        morseMap.put("u","..-");
        morseMap.put("v","...-");
        morseMap.put("w",".--");
        morseMap.put("x","-..-");
        morseMap.put("y","-.--");
        morseMap.put("z","--..");
        morseMap.put("1",".----");
        morseMap.put("2","..---");
        morseMap.put("3","...--");
        morseMap.put("4","....-");
        morseMap.put("5",".....");
        morseMap.put("6","-....");
        morseMap.put("7","--...");
        morseMap.put("8","---..");
        morseMap.put("9","----.");
        morseMap.put("0","----");
    }

    /**
     * Starts main code
     * @param args String array standard start parameter
     */
    public static void main(String[] args) {
        MorseMap morse = new MorseMap();
        morse.printMorseCode(WOZU_WORTE_DRUCKEN_ES_GIBT_DOCH_SCHREIBER);
    }


    /**
     * prints String converted into Morse code
     * @param input String that is to be converted
     */
    void printMorseCode(String input) {
        List<String> results = convertText2Morse(input);
        String noBrackets = Arrays.toString(results.toArray()).replace("[", "").replace("]", "");
        System.out.println(noBrackets);
    }

    /**
     * Converts the contents of input into Morse code.
     * @param input given string that is to be converted.
     * @return results, an Arraylist containing the input converted to Morse.
     */
    public List<String> convertText2Morse(String input) {
        input = input.toLowerCase();
       // input = input.replaceAll("[^a-z0-9]", ""); // removes everything but letters and digits
        input = input.replace(" ","");
        input = input.replace(".","");
        input = input.replace(",","");


        List<String> results = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            String c = input.substring(i,i+1);
            if (morseMap.containsKey(c)) {
                //String s = morseMap.get(c);
                results.add(morseMap.get(c));
            }
            else {
                //System.out.print("? "); // optional: marker for unknown characters
                results.add("?");
            }
        }
        return results;
    }

}