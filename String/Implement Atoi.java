/* Implement Atoi (String to Integer Conversion) */

class Solution {
    public int myAtoi(String s) {

        int i = 0;
        int n = s.length();

        // Skip leading spaces
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        // Check sign
        int sign = 1;
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {

            if (s.charAt(i) == '-') {
                sign = -1;
            }

            i++;
        }

        // Skip leading zeros
        while (i < n && s.charAt(i) == '0') {
            i++;
        }

        long num = 0;

        // Read digits
        while (i < n && Character.isDigit(s.charAt(i))) {

            int digit = s.charAt(i) - '0';

            // Overflow check
            if (num > (Integer.MAX_VALUE - digit) / 10) {

                if (sign == 1)
                    return Integer.MAX_VALUE;
                else
                    return Integer.MIN_VALUE;
            }

            num = num * 10 + digit;

            i++;
        }

        return (int)(sign * num);
    }
}
