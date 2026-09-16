
// Problem: Power of Two
// Platform: LeetCode
// Difficulty: Easy
// Approach: Bit Manipulation (a power of two has exactly one set bit)
// Time Complexity: O(1)
// Space Complexity: O(1)
// Optimal: Yes ✅

class Solution {
    public boolean isPowerOfTwo(int n) {
        
        return n > 0 && (n & (n - 1)) == 0;
        
    }
}