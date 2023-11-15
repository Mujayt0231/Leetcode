import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

    /*
     * Given an array of strings strs, group the anagrams together. You can return
     * the answer in any order.
     * 
     * An Anagram is a word or phrase formed by rearranging the letters of a
     * different word or phrase, typically using all the original letters exactly
     * once.
     */
    public static List<List<String>> grounpAnagrams(String[] strs) {
        if (strs == null || strs.length == 0)
            return new ArrayList<>();

        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {

            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedArray = new String(charArray);

            if (!map.containsKey(sortedArray)) {
                map.put(sortedArray, new ArrayList<>());
            }

            map.get(sortedArray).add(str);

        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] strs1 = { "eat", "tea", "tan", "ate", "nat", "bat", "chat", "tat", "att" };
        System.out.println(grounpAnagrams(strs1));
        System.out.println(groupAnagrams2(strs1));
    }

    // 11/15/2023
    /*
     * Given an array of strings strs, group the anagrams together. You can return
     * the answer in any order.
     * 
     * An Anagram is a word or phrase formed by rearranging the letters of a
     * different word or phrase, typically using all the original letters exactly
     * once.
     */
    public static List<List<String>> groupAnagrams2(String[] strs) {

        if (strs == null || strs.length == 0)
            return new ArrayList<>();

        Map<String, List<String>> hashmap = new HashMap<>();

        for (String string : strs) {

            char[] stringAsCharArr = string.toCharArray();
            Arrays.sort(stringAsCharArr);

            String charAsString = new String(stringAsCharArr);

            if (!hashmap.containsKey(charAsString)) {
                hashmap.put(charAsString, new ArrayList<>());
            }

            hashmap.get(charAsString).add(string);

        }

        return new ArrayList<>(hashmap.values());

    }

    // 09/03/2023
    public static List<List<String>> groupAnagrams(String[] strs) {

        if (strs == null || strs.length == 0)
            return new ArrayList<>();

        Map<String, List<String>> hashmap = new HashMap<>();

        for (String string : strs) {

            char[] charArray = string.toCharArray();
            Arrays.sort(charArray);
            String sortedString = new String(charArray);

            if (!hashmap.containsKey(sortedString)) {
                hashmap.put(sortedString, new ArrayList<>());

            }

            hashmap.get(sortedString).add(string);

        }

        return new ArrayList<>(hashmap.values());

    }
}
