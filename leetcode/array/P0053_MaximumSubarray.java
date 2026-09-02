package leetcode.array;

public class P0053_MaximumSubarray {

    public int maxSubArray(int[] nums) {
        int currentSum = nums[0]; // start by assuming the first number is our running sum
        int maxSum = nums[0];     // and also our best sum so far

        for (int i = 1; i < nums.length; i++) {
            // Decision: extend the current subarray, or start fresh here?
            currentSum = Math.max(nums[i], currentSum + nums[i]);

            // Update the best sum seen so far
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    // Simple manual test to confirm it works
    public static void main(String[] args) {
        P0053_MaximumSubarray solver = new P0053_MaximumSubarray();
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(solver.maxSubArray(nums));
        // Expected output: 6
    }
}
