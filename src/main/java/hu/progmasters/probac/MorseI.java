package hu.progmasters.probac;

import java.util.List;

/**
 * Common interface for Morse implementations.
 */
public interface MorseI {
    /**
     * Converts the contents of input into Morse code.
     * @param input given string that is to be converted.
     * @return results, an Arraylist containing the input converted to Morse.
     */
    public List<String> convertText2Morse(String input);
}
