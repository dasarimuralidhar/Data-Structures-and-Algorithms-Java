
// Problem: Transpose Matrix
// Platform: LeetCode
// Difficulty: Easy
// Approach: Create a transposed matrix and swap row/column indices
// Time Complexity: O(m × n)
// Space Complexity: O(m × n)
// Optimal: Yes ✅

class Solution {
    public int[][] transpose(int[][] matrix) {

        int nums[][] = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < nums.length; i++) {

            for (int j = 0; j < nums[0].length; j++) {

                nums[i][j] = matrix[j][i];
            }
        }

        return nums;
    }
}