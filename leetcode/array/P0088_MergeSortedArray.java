package leetcode.array;

import java.util.Arrays;

/**
 * 0007/1000 - Merge Sorted Array
 * Difficulty: Easy
 * Time Complexity: O(m + n)
 * Space Complexity: O(1) - In-place merge
 */
public class P0088_MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1; // Last element in nums1's initial data
        int p2 = n - 1; // Last element in nums2
        int p = m + n - 1; // Last position in nums1

        // Move backward through both arrays
        while (p2 >= 0) {
            if (p1 >= 0 && nums1[p1] > nums2[p2]) {
                nums1[p--] = nums1[p1--];
            } else {
                nums1[p--] = nums2[p2--];
            }
        }
    }

    public static void main(String[] args) {
        P0088_MergeSortedArray solver = new P0088_MergeSortedArray();
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        solver.merge(nums1, m, nums2, n);
        System.out.println("7. Array - Merge Sorted Result: " + Arrays.toString(nums1));
    }
}
