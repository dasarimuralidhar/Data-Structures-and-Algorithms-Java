
// Problem: Majority Element
// Platform: LeetCode
// Difficulty: Easy
// Approach: Boyer-Moore Voting Algorithm
// Time Complexity: O(n)
// Space Complexity: O(1)
// Optimal: Yes ✅

class Solution {
    public int majorityElement(int[] nums) {

        int num = 0, numCount = 0;

        for (int i = 0; i < nums.length; i++) {

            if (numCount == 0) {

                num = nums[i];
                numCount++;

            } else if (num == nums[i]) {

                numCount++;

            } else {

                numCount--;
            }
        }

        return num;
    }
}