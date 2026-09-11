
// Problem: Intersection of Two Arrays
// Platform: LeetCode
// Difficulty: Easy
// Approach: HashSet + ArrayList (store unique elements from nums1, then check common unique elements in nums2)
// Time Complexity: O(n * m)
// Space Complexity: O(n + m)
// Optimal: No ❌ (can be improved to O(n + m) by using a HashSet for checking duplicates)
// 
// Note: list.contains() takes O(n), so the second loop can become O(n * m).

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {

            set.add(nums1[i]);
        }

        for (int i = 0; i < nums2.length; i++) {

            if ((!list.contains(nums2[i])) && set.contains(nums2[i])) {

                list.add(nums2[i]);
            }
        }

        int result[] = new int[list.size()];

        for (int i = 0; i < list.size(); i++)
            result[i] = list.get(i);

        return result;
    }
}