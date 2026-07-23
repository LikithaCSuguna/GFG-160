/* Anagram */

class Solution {
    public static boolean areAnagrams(String s1, String s2) {

        // If lengths are different, they cannot be anagrams
        if (s1.length() != s2.length()) {
            return false;
        }

        // Frequency array for 26 lowercase letters
        int[] freq = new int[26];

        // Count characters from s1 and remove characters from s2
        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i) - 'a']++;
            freq[s2.charAt(i) - 'a']--;
        }

        // Check if all frequencies become zero
        for (int count : freq) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}
