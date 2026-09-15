
// Problem: Matrix Diagonal Sum
// Platform: LeetCode
// Difficulty: Easy
// Approach: Matrix Traversal (add both primary and secondary diagonal elements, then subtract the center element once if the matrix size is odd)
// Time Complexity: O(n)
// Space Complexity: O(1)
// Optimal: Yes ✅ (each diagonal is traversed in a single loop)

class Solution {
    public int diagonalSum(int[][] mat) {

        int sum = 0;
        int size = mat.length;

        for (int i = 0; i < size; i++) {

            sum += mat[i][i];
            sum += mat[i][size - i - 1];
        }

        if (size % 2 != 0)
            sum -= mat[size / 2][size / 2];

        return sum;
    }
}