
// Problem: Counting Bits
// Platform: LeetCode
// Difficulty: Easy
// Approach: Bit Manipulation (check each bit of every number using a bit mask and right shift)
// Time Complexity: O(n log n)
// Space Complexity: O(n)
// Optimal: No ❌ (can be optimized to O(n) using the relation bits[i] = bits[i >> 1] + (i & 1))

class Solution {
    public int[] countBits(int n) {
        
        int nums[] = new int[n + 1];
        int bitMask = 1;
        
        for (int i = 0; i < nums.length; i++) {

            int num = i;
            int count = 0;

            while (num > 0) {

                if ((num & bitMask) != 0)
                    count++;

                num = num >> 1;
            }

            nums[i] = count;
        }

        return nums;
    }
}