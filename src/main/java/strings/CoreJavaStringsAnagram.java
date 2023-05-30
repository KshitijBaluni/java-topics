package strings;

import java.util.HashMap;
import java.util.Map;

/**
 * Anagram Program for Strings.
 *
 * @author kshitijbaluni
 * @since 29 May 2023
 */
public class CoreJavaStringsAnagram {
    /**
     * Check weather the two strings are Anagram or Not.
     *
     * @param a String One
     * @param b String Two
     * @return true or false
     */
    public static boolean isAnagram(String a, String b) {
        if (a.length() != b.length())
            return false;

        Map<String, Integer> freqA, freqB;

        freqA = getFreqOfStringsCharacter(a.toLowerCase());
        freqB = getFreqOfStringsCharacter(b.toLowerCase());

        return freqA.equals(freqB);
    }

    /**
     * Function to get the frequency of each character in the String.
     *
     * @param inputString input string
     * @return map of characters and there frequency
     */
    private static Map<String, Integer> getFreqOfStringsCharacter(String inputString) {
        Map<String, Integer> freqInputString = new HashMap<String, Integer>();

        for (int i = 0; i < inputString.length(); i++) {
            if (!freqInputString.containsKey(String.valueOf(inputString.charAt(i))))
                freqInputString.put(String.valueOf(inputString.charAt(i)), 1);
            else
                freqInputString.put(String.valueOf(inputString.charAt(i)), freqInputString.get(String.valueOf(inputString.charAt(i))) + 1);
        }
        return freqInputString;
    }
}
