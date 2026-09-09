package leetcode.array;

import java.util.Set;
import java.util.HashSet;

public class P0128_LongestConsecutiveSequence {

    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();

        for (int num : nums) {
            numSet.add(num);
        }

        int longestStreak = 0;

        for (int num : numSet) {
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (numSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }

    public static void main(String[] args) {
        P0128_LongestConsecutiveSequence solver = new P0128_LongestConsecutiveSequence();
        int[] nums = {100, 4, 200, 1, 3, 2};

        System.out.println(solver.longestConsecutive(nums));
        // Expected output: 4
    }
}
