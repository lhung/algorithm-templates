package com.example.template;

public class BinarySearch {

    /**
     * Search in array that contains duplicate values
     */
    public static int countStrictlyLessThan(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] > target) {
                right = mid - 1;    // nums[mid] too large, search left
            } else if (nums[mid] < target) {
                left = mid + 1;     // nums[mid] too small, search right
            } else if (nums[left] != target) {
                right = mid;        // same value, but nums[mid] not the first
            } else {
                return left;        // same value, and nums[mid] is first
            }
        }
        return left;
    }
}
