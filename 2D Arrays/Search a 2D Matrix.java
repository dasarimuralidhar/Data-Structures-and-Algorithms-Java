
// Problem: Search a 2D Matrix
// Platform: LeetCode
// Difficulty: Medium
// Approach: Binary Search (treat the 2D matrix as a sorted 1D array and convert the 1D index into row and column)
// Time Complexity: O(log(m × n))
// Space Complexity: O(1)
// Optimal: Yes ✅ (best possible approach for the given matrix conditions)

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int sizeRow = matrix.length;
        int sizeCol = matrix[0].length;

        int low = 0;
        int high = sizeRow * sizeCol - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            int i = mid / sizeCol; // row
            int j = mid % sizeCol; // col

            if (matrix[i][j] == target)
                return true;

            if (matrix[i][j] > target) {

                high = mid - 1;

            } else {

                low = mid + 1;
            }
        }

        return false;
    }
}