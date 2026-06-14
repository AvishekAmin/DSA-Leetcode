package Arrays;

// LeetCode 42: Trapping Rain Water
// Difficulty: Hard

// Approach:
// - For each index, determine the highest bar on its left and right.
// - The water level at an index is the minimum of these two heights.
// - Water trapped at an index = water level - current bar height.
// - Use two auxiliary arrays:
//   1. leftMax[i]  = highest bar from 0 to i
//   2. rightMax[i] = highest bar from i to n-1
// - Sum the trapped water at each index.

// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {
    public int trap(int[] height) {
        int n = height.length;

        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }

        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i = n-2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        int trappedWater = 0;
        for(int i = 0; i < n; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += (waterLevel - height[i]);
        }
        return trappedWater;
    }
}