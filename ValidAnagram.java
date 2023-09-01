import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    /*
     * Given two strings s and t, return true if t is an anagram of s, and false
     * otherwise.
     * 
     * An Anagram is a word or phrase formed by rearranging the letters of a
     * different word or phrase, typically using all the original letters exactly
     * once.
     */

    // First try
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length())
            return false;

        char[] sAsChar = s.toCharArray();
        char[] tAsChar = t.toCharArray();

        Map<Character, Integer> hashMap = new HashMap<>();

        for (char c : sAsChar) {
            hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);
        }

        for (char c : tAsChar) {
            if (!hashMap.containsKey(c) || hashMap.get(c) == 0)
                return false;

            hashMap.put(c, hashMap.getOrDefault(c, 0) - 1);
        }

        return true;

    }

    public boolean isAnagramBetterSolution(String s, String t) {
        // If lengths of both strings are different, they can't be anagrams
        if (s.length() != t.length()) {
            return false;
        }

        // Using HashMap to store the frequency of each character in string s
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        // Count frequency of each character in string s
        for (char c : s.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Check frequency of each character in string t
        for (char c : t.toCharArray()) {
            // If the character is not found in the map or its frequency is zero, return
            // false
            if (!charCountMap.containsKey(c) || charCountMap.get(c) == 0) {
                return false;
            }

            // Decrease the frequency count of the character
            charCountMap.put(c, charCountMap.get(c) - 1);
        }

        return true;
    }

    /*
     * Explanation:
     * Check for Lengths: If two strings have different lengths, they cannot be
     * anagrams.
     * 
     * Counter Array: I used an integer array counter of size 26, assuming all
     * characters are lowercase alphabets. Each position in the array corresponds to
     * a letter ('a' to 'z'), and we will store the frequency of these letters in
     * this array.
     * This takes up constant space
     * 
     * Populating Counter Array: For each character in string s, I incremented its
     * count in the array. The array index is determined by c - 'a', so 'a' would
     * map to counter[0], 'b' to counter[1], and so on.
     * 
     * Checking for Anagram: Then, I iterated through string t and decremented the
     * count for each character in the array. If I found a character whose count
     * became less than 0, I returned false.
     * 
     * Return True: If the function has not returned false by the end of the loop,
     * then t is an anagram of s, and I return true.
     */

    public static boolean isAnagramGPT4Solution(String s, String t) {
        // If lengths of both strings are different, they can't be anagrams
        if (s.length() != t.length()) {
            return false;
        }

        // Create a frequency counter array
        int[] counter = new int[26]; // Assuming the input contains only lowercase alphabets

        // Count frequency of each character in string s
        for (char c : s.toCharArray()) {
            counter[c - 'a']++;
        }

        // Validate frequency of each character in string t
        for (char c : t.toCharArray()) {
            if (counter[c - 'a'] == 0) {
                return false;
            }
            counter[c - 'a']--;
        }

        return true;
    }
}