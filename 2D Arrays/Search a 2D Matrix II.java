
// Problem: Search a 2D Matrix II
// Platform: LeetCode
// Difficulty: Medium
// Approach: Staircase Search (start from the bottom-left; move up if the value is too large, otherwise move right)
// Time Complexity: O(m + n)
// Space Complexity: O(1)
// Optimal: Yes ✅ (optimal for the given matrix properties)

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int sizeRow = matrix.length;
        int sizeCol = matrix[0].length;

        int i = sizeRow - 1;
        int j = 0;

        while (j <= sizeCol - 1 && i >= 0) {

            if (matrix[i][j] == target)
                return true;

            if (matrix[i][j] > target) {
                
                i--;

            } else {

                j++;
            }
        }

        return false;
    }
}