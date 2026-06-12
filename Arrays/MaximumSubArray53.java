package Arrays;

// LeetCode 53: Maximum Subarray
// Difficulty: Medium

// Approach:
// - Use Kadane's Algorithm.
// - Maintain a running sum of the current subarray.
// - Update the maximum sum encountered so far.
// - If the current sum becomes negative, reset it to 0 since a negative sum
//   would only decrease the sum of any future subarray.

// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int maxSubArray(int[] nums) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++) {
            currSum += nums[i];
            maxSum = Math.max(currSum, maxSum);

            if(currSum < 0) {
                currSum = 0;
            }
        }
        return maxSum;
    }
}
