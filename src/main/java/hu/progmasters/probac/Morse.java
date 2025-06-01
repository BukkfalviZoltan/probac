package hu.progmasters.probac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Converts string into Morse Code
 */
public class Morse {
    /**
     * Starts main code
     * @param args String array standard start parameter
     */
    public static void main(String[] args) {
        Morse morse = new Morse();
        morse.printMorseCode("Wozu Worte drucken, es gibt doch Schreiber");
    }

    /**
     * Returns index of letter in alphabet.
     * @param letter String whose index is to be found in alphabet.
     * @return index of letter
     */
    int getPosInAlphabet(String letter) {
        if (letter == null) {
            letter = "";
        }
        letter = letter.toLowerCase();
        String alphabet = "abcdefghijklmnopqrstuvwxyz1234567890";
        return alphabet.indexOf(letter);
    }

    /**
     * prints String converted into Morse code
     * @param input String that is to be converted
     */
    void printMorseCode(String input) {
        List<String> results = ConvertText2Morse(input);
        String noBrackets = Arrays.toString(results.toArray()).replace("[", "").replace("]", "");
        System.out.println(noBrackets);
    }

    /**
     * Converts the contents of input into Morse code.
     * @param input given string that is to be converted.
     * @return results, an Arraylist containing the input converted to Morse.
     */
    public List<String> ConvertText2Morse(String input) {
        input = input.toLowerCase();
        input = input.replaceAll("[^a-z0-9]", ""); // removes everything but letters and digits

        String[] morsecode = {
                ".-",   // A
                "-...", // B
                "-.-.", // C
                "-..",  // D
                ".",    // E
                "..-.", // F
                "--.",  // G
                "....", // H
                "..",   // I
                ".---", // J
                "-.-",  // K
                ".-..", // L
                "--",   // M
                "-.",   // N
                "---",  // O
                ".--.", // P
                "--.-", // Q
                ".-.",  // R
                "...",  // S
                "-",    // T
                "..-",  // U
                "...-", // V
                ".--",  // W
                "-..-", // X
                "-.--", // Y
                "--..", // Z
                ".----", // 1
                "..---", // 2
                "...--", // 3
                "....-", // 4
                ".....", // 5
                "-....", // 6
                "--...", // 7
                "---..", // 8
                "----.", // 9
                "-----"  // 0
        };


        List<String> results = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            int pos = getPosInAlphabet(String.valueOf(c));
            if (pos >= 0) {
                //System.out.print(morsecode[pos] + " ");
                results.add(morsecode[pos]);
            }

            else {
                //System.out.print("? "); // optional: marker for unknown characters
                results.add("?");
            }
        }

        return results;
    }

}