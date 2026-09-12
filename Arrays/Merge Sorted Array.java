
// Problem: Merge Sorted Array
// Platform: LeetCode
// Difficulty: Easy
// Approach: Insertion Sort (append nums2 to nums1, then sort the combined array)
// Time Complexity: O((m + n)^2)
// Space Complexity: O(1)
// Optimal: No ❌ (can be optimized to O(m + n) using the two-pointer approach)

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        for (int i = 0; i < nums2.length; i++) {

            nums1[m + i] = nums2[i];
        }

        for (int i = m; i < nums1.length; i++) {

            int index = i;

            while (index > 0) {

                if (nums1[index] < nums1[index - 1]) {

                    int temp = nums1[index];
                    nums1[index] = nums1[index - 1];
                    nums1[index - 1] = temp;

                    index--;

                } else {

                    break;
                }
            }
        }
    }
}