package Arrays;

// LeetCode 121: Best Time to Buy and Sell Stock
// Difficulty: Easy

// Approach:
// - Traverse the array once while keeping track of the minimum stock price seen so far.
// - For each day, calculate the profit that would be earned by selling on that day.
// - Update the maximum profit whenever a larger profit is found.
// - If no profitable transaction exists, return 0.

// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int maxProfit(int[] prices) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i = 0; i < prices.length; i++) {
            if(prices[i] < buyPrice) {
                buyPrice = prices[i];
            } else {
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(profit, maxProfit);
            }
        }
        return maxProfit;
    }
}
