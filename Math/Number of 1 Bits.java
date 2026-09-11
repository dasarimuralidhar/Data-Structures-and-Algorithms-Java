
// Problem: Number of 1 Bits
// Platform: LeetCode
// Difficulty: Easy
// Approach: Bit Manipulation (repeatedly divide by 2 and count set bits)
// Time Complexity: O(log n)
// Space Complexity: O(1)
// Optimal: Yes ✅

class Solution {
    public int hammingWeight(int n) {
        
        int count = 0;

        while (n > 0) {

            if (n % 2 == 1)
                count++;

            n = n / 2;
        }

        return count;
    }
}