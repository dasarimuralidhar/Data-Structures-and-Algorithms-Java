
// Problem: First Stable Index
// Platform: LeetCode
// Difficulty: Medium
// Approach: Prefix Maximum + Suffix Minimum
// Time Complexity: O(n)
// Space Complexity: O(n)
// Optimal: Yes ✅

class Solution {
    public int firstStableIndex(int[] nums, int k) {

        int Min[] = new int[nums.length];

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0, size = nums.length; i < size; i++) {

            min = Math.min(min, nums[size - i - 1]);

            Min[size - 1 - i] = min;
        }

        for (int i = 0, size = nums.length; i < size; i++) {

            max = Math.max(max, nums[i]);

            if (max - Min[i] <= k) return i;
        }

        return -1;
    }
}