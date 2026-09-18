
// Problem: Flipping an Image
// Platform: LeetCode
// Difficulty: Easy
// Approach: Two Pointers + Bit Inversion (reverse each row and invert 0 ↔ 1)
// Time Complexity: O(n²)
// Space Complexity: O(1)
// Optimal: Yes ✅ (every element must be processed at least once)

class Solution {
    public int[][] flipAndInvertImage(int[][] image) {

        int size = image.length;

        for (int i = 0; i < size; i++) {

            int left = 0;
            int right = size - 1;

            while (left <= right) {

                if (left == right) {

                    image[i][left] = image[i][right] == 1 ? 0 : 1;
                    left++;
                    continue;
                }

                int temp = image[i][left];

                image[i][left] = image[i][right] == 1 ? 0 : 1;
                image[i][right] = temp == 1 ? 0 : 1;

                left++;
                right--;
            }
        }

        return image;
    }
}