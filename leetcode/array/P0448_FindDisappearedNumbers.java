package leetcode.array;

import java.util.List;
import java.util.ArrayList;

public class P0448_FindDisappearedNumbers {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1; // the index this number "points to"

            if (nums[index] > 0) {
                nums[index] = -nums[index]; // mark it as seen by making it negative
            }
        }

        List<Integer> missingNumbers = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                missingNumbers.add(i + 1); // this number was never seen
            }
        }

        return missingNumbers;
    }

    // Simple manual test to confirm it works
    public static void main(String[] args) {
        P0448_FindDisappearedNumbers solver = new P0448_FindDisappearedNumbers();
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};

        List<Integer> result = solver.findDisappearedNumbers(nums);
        System.out.println(result);
        // Expected output: [5, 6]
    }
}
