class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums); // Sort the array
        
        int closestSum = nums[0] + nums[1] + nums[2]; // Initialize with the first triplet sum
        
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                
                if (Math.abs(sum - target) < Math.abs(closestSum - target)) {
                    closestSum = sum; // Update closestSum
                }
                
                if (sum < target) {
                    left++; // Move left pointer
                } else {
                    right--; // Move right pointer
                }
            }
        }
        
        return closestSum;
    }
}
