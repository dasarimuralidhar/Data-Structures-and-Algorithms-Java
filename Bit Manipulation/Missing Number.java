
// Problem: Missing Number
// Platform: LeetCode
// Difficulty: Easy
// Approach: Bit Manipulation (XOR all numbers from 0 to n and all array elements; matching numbers cancel out)
// Time Complexity: O(n)
// Space Complexity: O(1)
// Optimal: Yes ✅

class Solution {
    public int missingNumber(int[] nums) {

        int XOR = 0;

        for (int i = 0; i <= nums.length; i++) {

            XOR ^= i;
        }

        for (int num : nums) {

            XOR ^= num;
        }

        return XOR;
    }
}