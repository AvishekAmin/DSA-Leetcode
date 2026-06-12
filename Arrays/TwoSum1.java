package Arrays;

// LeetCode 1: Two Sum
// Difficulty: Easy

// Approach:
// - Check every pair of elements.
// - Return indices whose sum equals target.

// Time Complexity: O(n²)
// Space Complexity: O(1)

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
            int searchNum = target - nums[i];

            for(int j = i + 1; j < nums.length; j++) {
                if(nums[j] == searchNum) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
}
