package leetcode.array;

import java.util.Map;
import java.util.HashMap;

public class P0560_SubarraySumEqualsK {

    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> prefixSumCounts = new HashMap<>();
        prefixSumCounts.put(0, 1);

        int runningSum = 0;
        int count = 0;

        for (int num : nums) {
            runningSum += num;

            if (prefixSumCounts.containsKey(runningSum - k)) {
                count += prefixSumCounts.get(runningSum - k);
            }

            prefixSumCounts.put(runningSum, prefixSumCounts.getOrDefault(runningSum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        P0560_SubarraySumEqualsK solver = new P0560_SubarraySumEqualsK();
        int[] nums = {1, 1, 1};
        int k = 2;

        System.out.println(solver.subarraySum(nums, k));
        // Expected output: 2
    }
}
