
// Problem: Peak Index in a Mountain Array
// Platform: LeetCode
// Difficulty: Medium
// Approach: Binary Search
// Time Complexity: O(log n)
// Space Complexity: O(1)
// Optimal: Yes ✅

class Solution {
    public int peakIndexInMountainArray(int[] arr) {

        int low = 0;
        int high = arr.length - 1;

        while(low <= high) {

            int mid = low + (high - low) / 2;

            if(arr[mid] > arr[mid + 1] && mid != arr.length - 1 && arr[mid] > arr[mid - 1] && mid != 0) {

                return mid;
                
            } else if(mid == 0 && arr[mid] > arr[mid + 1]) {

                return mid;
                
            } else if(mid == arr.length - 1 && arr[mid] > arr[mid - 1]) {

                return mid;
                
            }

            if(mid != 0 && arr[mid] < arr[mid - 1]) {

                high = mid - 1;

            } else if(mid != arr.length - 1 && arr[mid] < arr[mid + 1]) {

                low = mid + 1;
            }
        }

        return 0;
    }
}