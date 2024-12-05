class Solution {
    public boolean isBalanced(String num) {
        int sum = 0;

        for (int i = 0; i < num.length(); i++) {
            int sum1 = num.charAt(i) - '0';

            if (i % 2 == 0) {
                sum += sum1;  // Add for even indices
            } else {
                sum -= sum1;  // Subtract for odd indices
            }
        }

        return sum == 0;  // Check if sums are balanced
    }
}