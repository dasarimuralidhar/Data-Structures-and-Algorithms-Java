
// Problem: Hamming Distance
// Platform: LeetCode
// Difficulty: Easy
// Approach: Bit Manipulation (XOR finds the differing bits)
// Time Complexity: O(log n)
// Space Complexity: O(1)
// Optimal: Yes ✅

class Solution {
    public int hammingDistance(int x, int y) {

        int XOR = x ^ y;

        int count = 0;

        while (XOR > 0) {

            if (XOR % 2 == 1)
                count++;

            XOR /= 2;
        }

        return count;
    }
}