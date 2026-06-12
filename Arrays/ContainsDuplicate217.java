package Arrays;

// LeetCode 217: Contains Duplicate
// Difficulty: Easy

// Approach:
// - Compare each element with every other element after it.
// - If a duplicate is found, return true.
// - If no duplicates are found after checking all pairs, return false.

// Time Complexity: O(n²)
// Space Complexity: O(1)

class Solution {
    public boolean containsDuplicate(int[] nums) {
        for(int i=0; i<nums.length; i++) {
            for(int j=i+1; j<nums.length; j++) {
                if(nums[j] == nums[i]) {
                    return true;
                }
            }
        }
        return false;
    }
}
