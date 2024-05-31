


class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int left[] = new int[n];
        int right[] = new int[n];
        left[0] = 1;
        right[n - 1] = 1;

        // Calculate the product of elements to the left of each index
        for (int i = 1; i < n; i++) {
            left[i] = left[i - 1] * nums[i - 1];
        }

        // Calculate the product of elements to the right of each index
        for (int i = n - 2; i >= 0; i--) {
            right[i] = right[i + 1] * nums[i + 1];
        }

        // Calculate the final result by multiplying the corresponding left and right products
        int ans[] = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = left[i] * right[i]; // Fix the semicolon here (remove the semicolon)
        }
        return ans;
    }
}
