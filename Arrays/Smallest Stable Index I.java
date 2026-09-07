
// Problem: First Stable Index
// Platform: LeetCode
// Difficulty: Medium
// Approach: Prefix Maximum + Suffix Minimum
// Time Complexity: O(n)
// Space Complexity: O(n)
// Optimal: Yes ✅

class Solution {
    public int firstStableIndex(int[] nums, int k) {

        int size = nums.length;

        int suffixMin[] = new int[size];

        suffixMin[size - 1] = nums[size - 1];

        for (int i = size - 2; i >= 0; i--) {
            suffixMin[i] = Math.min(nums[i], suffixMin[i + 1]);
        }

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < size; i++) {

            max = Math.max(max, nums[i]);

            if (max - suffixMin[i] <= k) {
                return i;
            }
        }

        return -1;
    }
}