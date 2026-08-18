import java.util.*;

class Solution {
    public ArrayList<ArrayList<String>> anagrams(String[] arr) {

        HashMap<String, ArrayList<String>> map = new HashMap<>();

        for (String str : arr) {
            char[] chars = str.toCharArray();

            Arrays.sort(chars);

            String key = new String(chars);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
        }

        return new ArrayList<>(map.values());
    }
}
