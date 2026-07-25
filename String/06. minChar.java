class Solution {
    public int minChar(String s) {

        String rev = new StringBuilder(s).reverse().toString();
        String temp = s + "$" + rev;

        int[] lps = new int[temp.length()];

        int len = 0;
        int i = 1;

        while (i < temp.length()) {

            if (temp.charAt(i) == temp.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }

        return s.length() - lps[temp.length() - 1];
    }
}
