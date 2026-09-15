
// Problem: Single Number
// Platform: LeetCode
// Difficulty: Easy
// Approach: Bit Manipulation (XOR cancels out duplicate numbers, leaving the single number)
// Time Complexity: O(n)
// Space Complexity: O(1)
// Optimal: Yes ✅

class Solution {
    public int singleNumber(int[] nums) {

        int XOR = 0;

        for (int num : nums) {

            XOR ^= num;
        }

        return XOR;
    }
}