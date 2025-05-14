package hu.progmasters.probac;

public class Main {
    public static void main(String[] args) {
        printMorseCode("Wozu Worte drucken, es gibt doch Schreiber");
    }

    static int getPosInAlphabet(String letter) {
        letter = letter.toLowerCase();
        String alphabet = "abcdefghijklmnopqrstuvwxyz1234567890";
        return alphabet.indexOf(letter);
    }

    static void printMorseCode(String input) {
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

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            int pos = getPosInAlphabet(String.valueOf(c));
            if (pos >= 0) {
                System.out.print(morsecode[pos] + " ");
            } else {
                System.out.print("? "); // optional: marker for unknown characters
            }
        }
        System.out.println(); // new line at the end
    }
}