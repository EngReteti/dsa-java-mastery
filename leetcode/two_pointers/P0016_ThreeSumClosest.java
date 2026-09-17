package leetcode.two_pointers;

import java.util.Arrays;

public class P0016_ThreeSumClosest {

    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closestSum = nums[0] + nums[1] + nums[2];

        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int currentSum = nums[i] + nums[left] + nums[right];

                if (Math.abs(currentSum - target) < Math.abs(closestSum - target)) {
                    closestSum = currentSum;
                }

                if (currentSum < target) {
                    left++;
                } else if (currentSum > target) {
                    right--;
                } else {
                    return currentSum;
                }
            }
        }

        return closestSum;
    }

    public static void main(String[] args) {
        P0016_ThreeSumClosest solver = new P0016_ThreeSumClosest();
        int[] nums = {-1, 2, 1, -4};
        int target = 1;

        System.out.println(solver.threeSumClosest(nums, target));
        // Expected output: 2
    }
}
