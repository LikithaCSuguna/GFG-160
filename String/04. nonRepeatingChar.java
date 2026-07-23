/* Non Repeating Character */

class Solution {
    static char nonRepeatingChar(String s) {

        // Frequency array for lowercase letters
        int[] freq = new int[26];

        // Count frequency of each character
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        // Find the first character with frequency 1
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return s.charAt(i);
            }
        }

        // No non-repeating character found
        return '$';
    }
}
