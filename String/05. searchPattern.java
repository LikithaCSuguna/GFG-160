class Solution {
    ArrayList<Integer> search(String pat, String txt) {

        ArrayList<Integer> ans = new ArrayList<>();

        int n = txt.length();
        int m = pat.length();

        // Check every possible starting position
        for (int i = 0; i <= n - m; i++) {

            int j = 0;

            // Compare pattern with text
            while (j < m && txt.charAt(i + j) == pat.charAt(j)) {
                j++;
            }

            // Complete pattern matched
            if (j == m) {
                ans.add(i);
            }
        }

        return ans;
    }
}
