class Solution {
    public int reverse(int x) {
        int n = 0;

        while (x != 0) {
            int digit = x % 10;

            // Check for overflow before multiplying by 10 and adding digit
            if (n > Integer.MAX_VALUE / 10 || (n == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0; // Overflow for positive numbers
            }
            if (n < Integer.MIN_VALUE / 10 || (n == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0; // Overflow for negative numbers
            }

            n = n * 10 + digit;
            x /= 10;
        }

        return n;
    }
}
