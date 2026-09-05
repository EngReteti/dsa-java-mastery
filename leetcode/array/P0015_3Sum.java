package leetcode.array;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class P0015_3Sum {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>(); // holds all the triplets we find
        Arrays.sort(nums); // sorting is what makes the two-pointer trick possible

        for (int i = 0; i < nums.length - 2; i++) {

            // Skip duplicate values for i, so we don't get repeated triplets
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // Skip duplicates for left and right too
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;

                    left++;
                    right--;
                } else if (sum < 0) {
                    left++; // sum too small, need a bigger number
                } else {
                    right--; // sum too big, need a smaller number
                }
            }
        }

        return result;
    }

    // Simple manual test to confirm it works
    public static void main(String[] args) {
        P0015_3Sum solver = new P0015_3Sum();
        int[] nums = {-1, 0, 1, 2, -1, -4};

        List<List<Integer>> result = solver.threeSum(nums);
        System.out.println(result);
        // Expected output: [[-1, -1, 2], [-1, 0, 1]]
    }
}
