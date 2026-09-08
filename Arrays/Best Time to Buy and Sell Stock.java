
// Problem: Best Time to Buy and Sell Stock
// Platform: LeetCode
// Difficulty: Easy
// Approach: Track the minimum price seen so far and calculate the maximum profit
// Time Complexity: O(n)
// Space Complexity: O(1)
// Optimal: Yes ✅

class Solution {
    public int maxProfit(int[] prices) {

        int maxProfit = 0;
        int minPrice = prices[0];

        for (int i = 1, size = prices.length; i < size; i++) {

            int profit = prices[i] - minPrice;

            minPrice = Math.min(prices[i], minPrice);

            maxProfit = Math.max(profit, maxProfit);
        }

        return maxProfit;
    }
}